package home_work_5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CollectionBook {
    private String text;

    public CollectionBook(String text) {
        this.text = text;
    }

    /**
     * Метод который редактирует переданную строку, удаляет из нее лишние символы и возвращает массив строк.
     * @return массив строк (textCorrectArr).
     */
    public String[] bookCorrect() {
        String textCorrect = text.replaceAll("[^A-Za-zА-Яа-я0-9-]", " ");
        String[] textCorrectArr = textCorrect.split(" ");
        return textCorrectArr;
    }

    /**
     * Метод помещает массив строк в Set и возвращает коллекцию,содержащую
     набор слов который был использован при написании текста
     * @return коллекция,содержащая набор слов который был использован при написании текста
     */
    public Set<String> bookCollectSet(){
    Set<String> bookSet = new HashSet<>();

    String[] textCorrectArr = bookCorrect();

        for (int i = 0; i < textCorrectArr.length; i++) {
            bookSet.add(textCorrectArr[i]);
        }
    return bookSet;
    }

    /**
     * Метод наполняет Map ключ - значениями, где ключ - уникальные слова, значения - количество повторений уникальных слов
     * @return возвращает Map неотсортированный
     */

    //отсортировать Map пока не получается
    public Map<String, Integer> bookCollectMap(){
        Map<String, Integer> bookMap = new HashMap<>();

        String[] textCorrectArr = bookCorrect();

        for (int i = 0; i < textCorrectArr.length; i++) {
            if(!bookMap.containsKey(textCorrectArr[i])) {
                bookMap.put(textCorrectArr[i], 1);
            } else {
                Integer numberRepeat = bookMap.get(textCorrectArr[i]);
                bookMap.put(textCorrectArr[i], ++numberRepeat);
            }
        }
        return bookMap;
    }
}
