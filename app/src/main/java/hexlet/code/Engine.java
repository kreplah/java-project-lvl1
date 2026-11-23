package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void run(String rules, String[][] rounds) {
        var userName = Cli.Greeting();
        Scanner scanner = new Scanner(System.in);
        System.out.println(rules);
        // счетчик правильных ответов
        var count = 3;

        for (var i = 0; i < count; i++) {
            System.out.println(rounds[i][0]);
            System.out.println("Your answer: ");
            var answer = scanner.next();
            if (answer.equals(rounds[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println(
                        answer + " is wrong answer ;(. Correct answer was '" + rounds[i][1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        return;
    }
}
