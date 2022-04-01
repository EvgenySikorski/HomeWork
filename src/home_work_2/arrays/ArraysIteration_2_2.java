package home_work_2.arrays;

import java.util.Scanner;
import static home_work_2.arrays.ArraysUtils_2_1_1.*;

public class ArraysIteration_2_2 {
    public static void main(String[] args) {
        int[] container;

        container = arrayFromConsole();

        vseElementy(container);
        System.out.println();

        everySecond(container);
        System.out.println();

        obratnyPorydok(container);
        System.out.println();

        /**Метод вывода всех элементов массива
         *  @param length - длина массива
         *  @param elemt1 - элементы массива
         *  */
    }
        public static int[] vseElementy(int[] container) {
            int i;
            int elemt1;
            int length = container.length;

            System.out.println("Вывод всех элементов при помощи do....while");
            elemt1 = 0;
            i = 0;
            do {
                elemt1 = container[i];
                i++;
                System.out.println(elemt1);
            } while (i < length);

            System.out.println("Вывод всех элементов при помощи while");
            elemt1 = 0;
            i = 0;
            while (i < length) {
                elemt1 = container[i];
                i++;
                System.out.println(elemt1);
            }

            System.out.println("Вывод всех элементов при помощи for");
            elemt1 = 0;
            for (i = 0; i < length; i++) {
                elemt1 = container[i];
                System.out.println(elemt1);
            }

            System.out.println("Вывод всех элементов при помощи foreach");
            elemt1 = 0;
            for (int j : container) {
                elemt1 = j;
                System.out.println(elemt1);
            }

            return container;
        }

    /**Метод вывода каждого второго элемента массива
     *  */
        public static int[] everySecond(int[] container) {
            int i;
            int elemt1;
            int length = container.length;

            System.out.println("Вывод каждого второго элемента при помощи do....while");
            elemt1 = 0;
            i = 0;
            do {
                elemt1 = container[i];
                i = i + 2;
                System.out.println(elemt1);
            } while (i < length);

            System.out.println("Вывод каждого второго элемента при помощи while");
            elemt1 = 0;
            i = 0;
            while (i < length) {
                elemt1 = container[i];
                i = i + 2;
                System.out.println(elemt1);
            }

            System.out.println("Вывод каждого второго элемента при помощи for");
            elemt1 = 0;
            for (i = 0; i < length; i = i + 2) {
                elemt1 = container[i];
                System.out.println(elemt1);
            }

            // не понимаю, как сделать с foreach
            System.out.println("Вывод каждого второго элемента при помощи foreach");
            elemt1 = 0;
            for (int j : container) {
                elemt1 = j;
                System.out.println(elemt1);
            }
            return container;
        }

        /**Метод вывода элементов массива в обратном порядке
         * */

        public static int[] obratnyPorydok(int[] container) {
        int i;
        int elemt1;
        int length = container.length;

        System.out.println("Вывод элементов в обратном порядке при помощи do....while");
        elemt1 = 0;
        i = length - 1;
        do {
            elemt1 = container[i];
            i--;
            System.out.println(elemt1);
        } while (i >= 0);

        System.out.println("Вывод элементов в обратном порядке при помощи while");
        elemt1 = 0;
        i = length - 1;
        while (i >= 0) {
            elemt1 = container[i];
            i--;
            System.out.println(elemt1);
        }

        System.out.println("Вывод элементов в обратном порядке при помощи for");
        elemt1 = 0;
        for (i = length - 1; i >= 0; i--) {
            elemt1 = container[i];
            System.out.println(elemt1);
        }
            // не понимаю, как сделать с foreach
        System.out.println("Вывод элементов в обратном порядке при помощи foreach");
        elemt1 = 0;
        for (int j : container) {
            elemt1 = j;
            System.out.println(elemt1);
        }

        return container;
    }


}

