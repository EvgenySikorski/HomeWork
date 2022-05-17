package home_work_5;

import java.io.File;

public class WarAndPeaceMain {
    public static void main(String[] args) {
        String pathToFile = "c:/Users/Professional/IdeaProjects/JD1/HomeWork/src/home_work_5/Война и мир_книга.txt";

        ReadBook text = new ReadBook(pathToFile);
        CollectionBook text1 = new CollectionBook(text.readFile());

        System.out.println(text1.bookCollectSet());
        System.out.println("Количество использованых слов: " + text1.bookCollectSet().size());

        //System.out.println(text1.bookCollectMap());

        EasySearch searchWord = new EasySearch();
        System.out.println("Cлово \"война\" встречается в тексте " + searchWord.search(text.readFile(),"война" ) + " раз");
        System.out.println("Cлово \"и\" встречается в тексте " + searchWord.search(text.readFile(),"и" ) + " раз");
        System.out.println("Cлово \"мир\" встречается в тексте " + searchWord.search(text.readFile(),"мир" ) + " раз");

    }
}
