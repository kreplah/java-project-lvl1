package hexlet.code.Games;

import hexlet.code.Engine;

public class Parity {

    public static String[][] generateRoundData() {
        // рандомное число
        var number = 0;
        // количество раундов
        var count = 3;
        // один раунд сстоит из пары вопрос-ответ
        var round = 2;
        String answer = "";
        String question = "";
        String[][] rounds = new String[count][round];

        for (var i = 0; i < count; i++) {
            number = (int) (Math.random() * 100) + 1;
            question = "Question: " + String.valueOf(number);
            if (number % 2 == 0) {
                answer = "yes";
            } else {
                answer = "no";
            }
            // заполнение массива элементами вида [вопрос, правильный ответ]
            rounds[i][0] = question;
            rounds[i][1] = answer;
        }
        return rounds;
    }

    public static void start() {
        var rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.run(rules, Parity.generateRoundData());
    }
}
