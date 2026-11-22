package hexlet.code.Games;

import hexlet.code.Engine;

import java.util.Arrays;

public class Progression {

    public static void start() {
        var rules = "What number is missing in the progression?";
        Engine.run(rules, Progression.generateRoundData());
    }

    public static String[] create() {
        var currentElement = 0;
        var minCountNumber = 5;
        // случайное количество чисел в последовательности, от 5 до 10 включительно
        var countNumber = (int) (Math.random() * 6) + minCountNumber;
        String[] numberArray = new String[countNumber];
        // считаем шаг прогрессии
        var stepProgression = (int) (Math.random() * 10) + 1;
        // случайная точка отсчета
        var startProgression = (int) (Math.random() * 10) + 1;
        for (var i = 0; i < countNumber; i++) {
            currentElement = startProgression + i * stepProgression;
            numberArray[i] = String.valueOf(currentElement);
        }
        return numberArray;
    }

    public static String[][] generateRoundData() {
        // количество раундов
        var count = 3;
        // один раунд сстоит из пары вопрос-ответ
        var round = 2;
        String question = "";
        String[][] rounds = new String[count][round];

        for (var i = 0; i < count; i++) {
            var progressionArray = Progression.create();
            var hideNumberIndex = (int) (int) (Math.random() * progressionArray.length);
            var hudeNumber = progressionArray[hideNumberIndex];
            progressionArray[hideNumberIndex] = "..";
            question = "Question: " + Arrays.toString(progressionArray);
            // заполнение массива элементами вида [вопрос, правильный ответ]
            rounds[i][0] = question;
            rounds[i][1] = String.valueOf(hudeNumber);
        }
        return rounds;
    }
}
