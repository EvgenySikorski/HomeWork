package home_work_2.arrays;

import java.util.Scanner;

public class ArraysUtils_2_1_1 {

    public static int[] arrayFromConsole() {
        int lengthArray;
        int[] container;

        Scanner sc = new Scanner(System.in);
        System.out.print("Сколько элементов будет введено?: ");

        while (!sc.hasNextInt()) {
            System.out.println("Введено неверное число");
            sc.nextLine();
        }

        lengthArray = sc.nextInt();
        container = new int[lengthArray];

        for (int i = 0; i < container.length; i++) {
            System.out.print("Введите элементы массива: ");
            while (!sc.hasNextInt()) {
                System.out.println("Введено неверное число");
                sc.nextLine();
            }
            container[i] = sc.nextInt();
        }
        return container;
    }
}
