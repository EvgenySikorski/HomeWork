package home_work_2.loops;

import java.util.Scanner;

public class loops_1_1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число, до которого необходимо перемножитать цифры");
        int number = console.nextInt();

        int a = operat(number);
            System.out.print(a);

    }
    public static int operat(int number){
        int result = 1;
        for (int i = 1; i <= number; i ++){
            result = result*i;
            if (i < number){
                System.out.print(i + "*");
            } else {
                System.out.print(i + "=");
            }
        }
        return result;
    }
}
