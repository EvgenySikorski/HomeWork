package home_work_2.sorts;
import home_work_2.sorts.SortsUtils;
import home_work_2.arrays.ArraysUtils_2_1_1;
import home_work_2.arrays.ArraysUtils_2_1_2;

import java.util.Arrays;

public class SortsMain {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5,6};
        int[] arr2 = new int[]{1,1,1,1};
        int[] arr3 = new int[]{9,1,5,99,9,9};
        int[] arr4 = new int[]{};
        int[] arr5 = new int[]{6,5,4,3,2,1};


        System.out.println("Массив до сортировки" + Arrays.toString(arr1));
        SortsUtils.bubble(arr1);
        System.out.println("Массив до сортировки" + Arrays.toString(arr1));

        System.out.println("Массив до сортировки" + Arrays.toString(arr2));
        SortsUtils.bubble(arr2);
        System.out.println("Массив до сортировки" + Arrays.toString(arr2));

        System.out.println("Массив до сортировки" + Arrays.toString(arr3));
        SortsUtils.bubble(arr3);
        System.out.println("Массив до сортировки" + Arrays.toString(arr3));

        System.out.println("Массив до сортировки" + Arrays.toString(arr4));
        SortsUtils.bubble(arr4);
        System.out.println("Массив до сортировки" + Arrays.toString(arr4));

        System.out.println("Массив до сортировки" + Arrays.toString(arr5));
        SortsUtils.bubble(arr5);
        System.out.println("Массив до сортировки" + Arrays.toString(arr5));

        int[] arr6 = ArraysUtils_2_1_2.arrayRandom(7,15);
        int[] arr7 = ArraysUtils_2_1_1.arrayFromConsole();

        System.out.println("Массив до сортировки" + Arrays.toString(arr6));
        SortsUtils.bubble(arr6);
        System.out.println("Массив до сортировки" + Arrays.toString(arr6));

        System.out.println("Массив до сортировки" + Arrays.toString(arr7));
        SortsUtils.bubble(arr7);
        System.out.println("Массив до сортировки" + Arrays.toString(arr7));
    }

}
