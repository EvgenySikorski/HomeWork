package HomeWork1;

import HomeWork1.api.ICommunicationPrinter;

public class Task5_1_interface implements ICommunicationPrinter {
    @Override
    public String welcom(String name) {
        String name1 ="Вася";
        String name2 = "Анастасия";

        if (name1.equals(name)) {
            return "Привет!\nЯ тебя так долго ждал";
        }

        if (name2.equals(name)) {
            return "Я тебя так долго ждал";
        }
            return "Добрый день, а вы кто?";
     }
}
