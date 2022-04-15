package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    public static void main(String[] args) {
        CalculatorWithOperator operat2 = new CalculatorWithOperator();

        //a = 4.1 + 15 * 7 + Math.pow(28d/5, 2);//Результат выражения: 140.45999999999998

        double a = operat2.getPlus(4.1, (operat2.getPlus((operat2.getMultipli(15, 7)), operat2.getStepen((operat2.getDivision(28,5)),2))));
        System.out.println("Результат вычисления: " + a);

    }
}
