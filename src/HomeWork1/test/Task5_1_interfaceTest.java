package HomeWork1.test;

import HomeWork1.Task5_1_interface;
import HomeWork1.api.ICommunicationPrinter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task5_1_interfaceTest {
    ICommunicationPrinter print = new Task5_1_interface();

    @Test
    public void testNameVasia() {
        String name = "Вася";
        String resultExpect = "Привет!\nЯ тебя так долго ждал";
        String resultActual = print.welcom(name);

        Assertions.assertEquals(resultExpect, resultActual);
    }

    @Test
    public void testNameAnastasia() {
        String name = "Анастасия";
        String resultExpect = "Я тебя так долго ждал";
        String resultActual = print.welcom(name);

        Assertions.assertEquals(resultExpect, resultActual);
    }
    @Test
    public void testNameOther() {
        String name = "Коля";
        String resultExpect = "Добрый день, а вы кто?";
        String resultActual = print.welcom(name);

        Assertions.assertEquals(resultExpect, resultActual);
    }

}
