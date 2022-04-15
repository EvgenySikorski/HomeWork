package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoSuper operat6 = new CalculatorWithCounterAutoSuper();

        //a = 4.1 + 15 * 7 + Math.pow(28d/5, 2);//Результат выражения: 140.45999999999998
        double b = operat6.getPlus(4.1, (operat6.getPlus((operat6.getMultipli(15, 7)), operat6.getStepen((operat6.getDivision(28,5)),2))));

        System.out.println("Результат вычисления: " + b);
        System.out.println("Количество операций: " + operat6.getCountOperation());
    }
}
