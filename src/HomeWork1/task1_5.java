package HomeWork1;
// результат java: bad operand types for binary operator '|' - неверные типы операндов для бинарного оператора '|', '&', '^', '~', '<<', '>>', '>>>'.
public class task1_5 {

    public static void main(String[] args) {

        double a = 42.5;
        double b = 15;
        // double result1 = a | b;
        // побитовую операцию выполнить с дробными числами нельзя, т.к. побитовые операторы применимы только к целочисленными типам long, int, short, char, byte.
        // результат java: bad operand types for binary operator '|' - неверные типы операндов для бинарного оператора '|', '&', '^', '~', '<<', '>>', '>>>'.

         // System.out.println(a + " | " + b);
         // System.out.println("result1 =" + result1 + "-десятичная система исчисления"); //Результат в десятичной системе исчисления
         // System.out.println("result1 =" + Integer.toBinaryString(result1) + "-двоичная система исчисления"); //Результат в двоичной системе исчисления

    }
}
