package HomeWork1;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Сейчас рабочий день?");
        boolean workDay = console.nextBoolean();

        System.out.println("Сейчас отпуск?");
        boolean vacation = console.nextBoolean();

        boolean sleep = sleepIn(vacation, workDay);


        if (sleep) {
            System.out.println("Можно спать дальше");
        }
        else {
            System.out.println("Пора вставать на работу");
            }
        }



    /**
     * Метод определения рабочего либо выходного дня
     * @param workDay - true обозначает рабочий день
     * @param vacation - true обозначает отпуск
     * @return true - можно спать, false - нельзя спать
     */
    public static boolean sleepIn(boolean workDay, boolean vacation) {
        if (workDay) {
            if (vacation) {
                return true;
            } else {
                return false;
            }
        }
        else {
            return true;
        }

    }
}







