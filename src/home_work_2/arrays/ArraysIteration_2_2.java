package home_work_2.arrays;

import java.util.Scanner;
import java.util.Random;

public class ArraysUtils_2_1_2 {

    public static int[] arrayRandom(int size, int maxValueExclusion) {
        int[] container;

        Random rnd = new Random();

        container = new int[size];

        for (int i = 0; i < container.length; i++) {
            container[i] = rnd.nextInt(maxValueExclusion);
        }
        return container;
    }
}
