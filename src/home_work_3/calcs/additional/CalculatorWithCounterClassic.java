package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    private long count;

    /**
     * Метод, который увеличивает внутренний счётчик (поле) в калькуляторе
     */
    public void incrementCountOperation(){
        count++;
    }

    /**
     * Метод который возвращает количество использований данного калькулятора (поле)
     * @return count - количество использований
     */

    public long getCountOperation(){
        return count;
    }
}
