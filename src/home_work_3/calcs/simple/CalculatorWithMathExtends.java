package home_work_3.calcs.simple;

public class CalculatorWithMathExtends extends CalculatorWithOperator {

    /**
     * Переопределение метода getStepen "Возведение в степень" из родительского класса CalculatorWithOperator
     * @param number - число, которое возводим в степень
     * @param pow - степень числа
     * @return resStepen - результат возведения числа в степень
     */
    public double getStepen (double number, int pow) {
        resStepen = Math.pow(number, pow);
        return resStepen;
    }

    public double getModul(double number) {
        resModul = Math.abs(number);
        return resModul;
    }

    public double getSqrt (double number) {
        resSqrt = Math.sqrt(number);
        return resSqrt;
    }
}
