package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    public static void main(String[] args) {

        CalculatorWithMathExtends operat4 = new CalculatorWithMathExtends();

        //a = 4.1 + 15 * 7 + Math.pow(28d/5, 2);//Результат выражения: 140.45999999999998

        double c = operat4.getPlus(4.1, (operat4.getPlus((operat4.getMultipli(15, 7)), operat4.getStepen((operat4.getDivision(28,5)),2))));
        System.out.println("Результат вычисления: " + c);
    }
}
