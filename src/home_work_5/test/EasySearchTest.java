package home_work_5.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import home_work_5.EasySearch;


public class EasySearchTest {
    EasySearch searchWord = new EasySearch();

    @Test
    public void searchTest1(){
        String text ="привет, как дела!";

        Assertions.assertEquals(0, searchWord.search(text,"война" ));
        Assertions.assertEquals(1, searchWord.search(text,"привет" ));
        Assertions.assertEquals(2, searchWord.search(text,"к" ));
    }

    @Test
    public void searchTest2(){
        String text ="бабушка бабушке бабушку";

        Assertions.assertEquals(3, searchWord.search(text,"баб" ));
        Assertions.assertEquals(1, searchWord.search(text,"бабушка" ));
        Assertions.assertEquals(0, searchWord.search(text,"бабушки" ));
    }
}
