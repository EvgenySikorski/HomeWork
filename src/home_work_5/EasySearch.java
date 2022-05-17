package home_work_5;

import home_work_5.api.ISearchEngine;

public class EasySearch implements ISearchEngine {

    /**
     * Метод, который осущестляет поиск в переданном тексте заданного слова
     * @param text - текст в котором ищем заданное слово
     * @param word - слово, которое ищем в переданном тексте
     * @return количество раз, которое встречается в тексе (text) заданное слово (word)
     */
    @Override
    public long search(String text, String word) {

        long numberWordsFound = 0;
        int fromIndex = 0;
        int index = text.indexOf(word, fromIndex);

        while (index != -1) {
            numberWordsFound++;
            index = text.indexOf(word, (index + word.length()+ 1));
            }
        return numberWordsFound;
    }
}
