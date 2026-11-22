package hexlet.code;

import hexlet.code.Games.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(
"""
Please enter the game number and press Enter.
1 - Greet
2 - Even
3 - Calc
4 - GCD
5 - Progression
6 - Prime
0 - Exit
Your choice: """);
        var choice = scanner.next();
        switch (choice) {
            case "1":
                Cli.Greeting();
                break;
            case "2":
                Parity.start();
                break;
            case "3":
                Calc.start();
                break;
            case "4":
                NOD.start();
                break;
            case "5":
                Progression.start();
                break;
            case "6":
                Prime.start();
                break;
            case "0":
                return;
            default:
                return;
        }
    }
}
