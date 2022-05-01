package HomeWork1;

import HomeWork1.api.ICommunicationPrinter;

public class Task5_2_interface implements ICommunicationPrinter {

    @Override
    public String welcom(String name) {
        String name1 = "Вася";
        String name2 = "Анастасия";

        if (name1.equals(name)) {
            return "Привет!/nЯ тебя так долго ждал";
        } else if (name2.equals(name)) {
            return "Я тебя так долго ждал";
        } else return "Добрый день, а вы кто?";
    }
}

