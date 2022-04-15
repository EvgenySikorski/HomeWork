package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    public static void main(String[] args) {
        CalculatorWithMathCopy operat3 = new CalculatorWithMathCopy();

        //a = 4.1 + 15 * 7 + Math.pow(28d/5, 2);//Результат выражения: 140.45999999999998

        double b = operat3.getPlus(4.1, (operat3.getPlus((operat3.getMultipli(15, 7)), operat3.getStepen((operat3.getDivision(28,5)),2))));
        System.out.println("Результат вычисления: " + b);
    }
}
