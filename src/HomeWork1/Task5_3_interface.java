package HomeWork1;

import HomeWork1.api.ICommunicationPrinter;

import java.util.Scanner;

public class Task5_3_interface implements ICommunicationPrinter {

    @Override
    public String welcom(String name) {

        switch (name) {
            case "Вася":
                return "Привет!/nЯ тебя так долго ждал";
            case "Анастасия":
                return "Я тебя так долго ждал";
            default:
                return "Добрый день, а вы кто?";
        }
    }
}

