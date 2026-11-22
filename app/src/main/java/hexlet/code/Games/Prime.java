package hexlet.code.Games;

import hexlet.code.Engine;

public class Prime {

    public static void start() {
        var rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.run(rules, Prime.generateRoundData());
    }

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
            if (number == 2) {
                answer = "yes";
            } else if (number < 2) {
                answer = "no";
            } else {
                for (var j = 2; j <= Math.sqrt(number); j++) {
                    if (number % j == 0) {
                        answer = "no";
                        // если нашли делитель - уходим
                        break;
                    } else {
                        answer = "yes";
                    }
                }
            }
            // заполнение массива элементами вида [вопрос, правильный ответ]
            rounds[i][0] = question;
            rounds[i][1] = answer;
        }
        return rounds;
    }
}
