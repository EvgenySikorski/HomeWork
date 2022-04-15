package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain  {
    public static void main(String[] args) {
        CalculatorWithCounterClassic operat5 = new CalculatorWithCounterClassic();

        //a = 4.1 + 15 * 7 + Math.pow(28d/5, 2);//Результат выражения: 140.45999999999998

        double d = operat5.getPlus(4.1, (operat5.getPlus((operat5.getMultipli(15, 7)), operat5.getStepen((operat5.getDivision(28,5)),2))));
        System.out.println("Результат вычисления: " + d);

        operat5.incrementCountOperation();
        operat5.incrementCountOperation();
        operat5.incrementCountOperation();
        operat5.incrementCountOperation();
        operat5.incrementCountOperation();


        System.out.println("Количество операций: " + operat5.getCountOperation());







    }
}
