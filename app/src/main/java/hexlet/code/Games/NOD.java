package hexlet.code.Games;

import hexlet.code.Engine;

public class NOD {

    public static void start() {
        var rules = "Find the greatest common divisor of given numbers.";
        Engine.run(rules, NOD.generateRoundData());
    }

    private static String[][] generateRoundData() {
        // рандомное число
        var number1 = 0;
        var number2 = 0;
        // количество раундов
        var count = 3;
        // один раунд сстоит из пары вопрос-ответ
        var round = 2;
        String answer = "";
        String question = "";
        String[][] rounds = new String[count][round];

        for (var i = 0; i < count; i++) {
            number1 = (int) (Math.random() * 100) + 1;
            number2 = (int) (Math.random() * 100) + 1;
            question = "Question: " + String.valueOf(number1) + " " + String.valueOf(number2);
            // нахождение НОД
            if (number1 != 0 && number2 != 0) {
                while (number2 != 0) {
                    var result = number1 % number2;
                    number1 = number2;
                    number2 = result;
                }
                answer = String.valueOf(number1);
            } else if (number1 == 0) {
                answer = String.valueOf(number2);
            }
            rounds[i][0] = question;
            rounds[i][1] = answer;
        }
        return rounds;
    }
}
