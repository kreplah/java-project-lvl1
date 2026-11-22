package hexlet.code.Games;

import hexlet.code.Engine;

public class Calc {

    public static void start() {
        var rules = "What is the result of the expression?";
        Engine.run(rules, Calc.generateRoundData());
    }

    public static String[][] generateRoundData() {
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
        String[] operations = {"+", "-", "*"};

        for (var i = 0; i < count; i++) {
            number1 = (int) (Math.random() * 100) + 1;
            number2 = (int) (Math.random() * 100) + 1;
            // выбираем индекс из массива операций
            var randomOperation = (int) (Math.random() * operations.length);
            // определяем по индексу операцию
            var stringOperator = operations[randomOperation];
            question =
                    "Question: "
                            + String.valueOf(number1)
                            + " "
                            + stringOperator
                            + " "
                            + String.valueOf(number2);
            switch (stringOperator) {
                case "+" -> answer = String.valueOf(number1 + number2);
                case "-" -> answer = String.valueOf(number1 - number2);
                case "*" -> answer = String.valueOf(number1 * number2);
            }
            // заполнение массива элементами вида [вопрос, правильный ответ]
            rounds[i][0] = question;
            rounds[i][1] = answer;
        }
        return rounds;
    }
}
