package HomeWork1;

public class task2_2 {

    public static void main(String[] args) {

        int a = 8;
        int b = 2;
        int c = 5;

        int result2 = (c + b) / a;
        // Первым выполняется сложение, т.к. действие находится в скобках 5 + 2 = 7.
        // Далее выполняется деление 7 / 8 = 0.875
        // Т.к. переменные int целочисленные,в результат идет только целое число, т.е. 0.
        // result2 = (5 + 2) / 8 = 0;
        System.out.println(" (5 + 2) / 8 = " + result2);

    }
}

