plugins {
    id("java")
    application
    id("com.diffplug.spotless") version "8.1.0"

}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:6.0.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.test {
    useJUnitPlatform()
}

spotless {
    java {
        importOrder()
        removeUnusedImports()
        googleJavaFormat().aosp()
        formatAnnotations()
        leadingTabsToSpaces(4)
    }
}

application {
    mainClass = "hexlet.code.App"
}
java {
    tasks.withType<JavaCompile>().configureEach {
        options.release = 21
    }
}
tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}