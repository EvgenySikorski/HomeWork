package home_work_2.loops;

import java.util.Scanner;

public class loops_1_3 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double number;
        int pow;
        double result;

        do {
            System.out.println("Введите любое дробное число");
            while (!console.hasNextDouble()) {
                System.out.println("Введено неверное число");
                console.next();
            }
            number = console.nextInt();
        }
        while (number == 0);
        System.out.println("Введено возводимое число" + number);

        do {
            System.out.println("Введите положительное значение степени числа");
            while (!console.hasNextInt()) {
                System.out.println("Введено не верное число");
                console.next();
            }
            pow = console.nextInt();
        }
        while (pow < 0);
        System.out.println("Введена степень числа" + pow);

        result = vozvedenie(number, pow);
        System.out.printf(number + "^" + pow + "=" + result);
    }
    /**
     * Метод возводит полученное через консоль число в полученную через консоль степень.
     * @param number число, которое возводим в степень
     * @param pow степень
     */
    static double vozvedenie(double number, int pow){
        double result = 1;

        for (int i = 0; i < pow; i++) {
            result *= number;
        }
        return result;
    }
}