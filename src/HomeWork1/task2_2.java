package HomeWork1;

public class task2_1 {

    public static void main(String[] args) {

        int a = 8;
        int b = 2;
        int c = 5;

        int result1 = c + b / a;

        System.out.println(" 5 + 2 / 8 = " + result1);
        // Первым выполняется деление 2 / 8 = 0,25.
        // Т.к. переменные int целочисленные,в сложение с 5 идет только целое число результата, т.е. 0.
        // result1 = 5 + 0 = 5;

        int result2 = (c + b) / a;
        // Первым выполняется сложение, т.к. действие находится в скобках 5 + 2 = 7.
        // Далее выполняется деление 7 / 8 = 0.875
        // Т.к. переменные int целочисленные,в результат идет только целое число, т.е. 0.
        // result2 = (5 + 2) / 8 = 0;
        System.out.println(" (5 + 2) / 8 = " + result2);

        int result3 = (c + b++) / a;
        // Первым выполняется сложение, т.к. действие находится в скобках 5 + 2 = 7.
        // Далее выполняется деление 7 / 8 = 0.875
        // Т.к. переменные int целочисленные,в результат идет только целое число, т.е. 0.
        // result2 = (5 + 2) / 8 = 0;
        System.out.println(" (5 + 2++) / 8 = " + result3);
    }
}
