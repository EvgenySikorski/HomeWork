package HomeWork1;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        public boolean sleepIn(boolean weekday, boolean vacation) {



            if (!weekday || vacation) {
                System.out.print("Введите Ваше имя: ");
            }

            System.out.print("Введите Ваше имя: ");
               }

        Scanner in = new Scanner(System.in);
        System.out.print("Введите Ваше имя: ");
        String name = in.nextLine();

        if (name.equals("Вася")) {
            System.out.println("Привет!");
            System.out.println("Я тебя так долго ждал");
        }
        if (name.equals("Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        }
        if (!name.equals("Вася") && !name.equals("Анастасия")) {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}

