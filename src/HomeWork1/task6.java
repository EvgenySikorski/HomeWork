package HomeWork1;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class task6 {

    public static void main(String[] args) {

        int[] numberPhone = new int[10];
        Scanner console = new Scanner(System.in);
        System.out.println("Введите десять чисел");
        for (int i = 0; i < numberPhone.length; i++) {
            numberPhone[i] = console.nextInt();
        }

        System.out.println(createPhoneNumber(numberPhone));
    }

    public static String createPhoneNumber(int[]arr){
        String num =("(" + arr[0] + arr[1]+ arr[2]+")" + " " + arr[3] + arr[4]+ arr[5] + "-" + arr[6] + arr[7]+ arr[8] + arr[9]);
    return num;

    }
}








