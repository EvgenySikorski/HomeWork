package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {

    private long count;

    /**
     * Метод который возвращает количество использований данного калькулятора (поле)
     * @return count - количество использований
     */
    public long getCountOperation() {
        return count;
    }

    /**
     * Метод getPlus "Сложение"
     * @param number1 - первое число
     * @param number2 - второе число
     * count  - счетчик использования метода
     * @return super.getPlus - результат сложения через вызов реализации из родительского класса
     */
    public double getPlus (double number1, double number2) {
        count++;
        return super.getPlus(number1, number2);
    }

    /**
     * Метод getMinus "Вычетание"
     * @param number1 - первое число
     * @param number2 - второе число
     * count  - счетчик использования метода
     * @return super.getMinus - результат вычетания через вызов реализации из родительского класса
     */
    public double getMinus (double number1, double number2) {
        count++;
        return super.getMinus(number1, number2);
    }

    /**
     * Метод getDivision "Деление"
     * @param number1 - делимое число
     * @param number2 - делитель
     * count  - счетчик использования метода
     * @return super.getDivision - результат деления через вызов реализации из родительского класса
     */
    public double getDivision (double number1, double number2) {
        count++;
        return super.getDivision(number1, number2);
    }

    /**
     * Метод getMultipli "Умножение"
     * @param number1 - первое число
     * @param number2 - второе число
     * count  - счетчик использования метода
     * @return super.getMultipli - результат умножения через вызов реализации из родительского класса
     */
    public double getMultipli (double number1, double number2) {
        count++;
        return super.getMultipli(number1,number2);
    }

    /**
     * Метод getStepen "Возведение в степень"
     * @param number - число, которое возводим в степень
     * @param pow - степень числа
     * count  - счетчик использования метода
     * @return результат возведения в степень через вызов реализации из родительского класса
     */
    public double getStepen (double number, int pow) {
        count++;
        return super.getStepen(number, pow);
    }

    /**
     * Метод getModul "Модуль числа"
     * @param number - число, модуль числа которого получаем
     * @return resModul - результат действия через вызов реализации из родительского класса
     */
        public double getModul(double number) {
        count++;
        return super.getModul(number);
    }

    /**
     * Метод getSqrt "Корень числа"
     * @param number - число, корень которого извлекаем
     * @return resSqrt - результат действия через вызов реализации из родительского класса
     */
    public double getSqrt (double number) {
        count++;
        return super.getSqrt(number);
    }
}
