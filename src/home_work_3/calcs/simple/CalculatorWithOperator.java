package home_work_3.calcs.simple;

public class CalculatorWithOperator {
    private double resPlus;
    private double resMinus;
    private double resDivision;
    private double resMultipli;
    protected double resStepen;
    protected double resModul;
    protected double resSqrt;

    /**
     * Метод getPlus "Сложение"
     * @param number1 - первое число
     * @param number2 - второе число
     * @return resPlus - результат сложения
     */
    public double getPlus (double number1, double number2) {
        resPlus = number1 + number2;
        return resPlus;
    }

    /**
     * Метод getMinus "Вычетание"
     * @param number1 - первое число
     * @param number2 - второе число
     * @return resMinus - результат вычетания
     */
    public double getMinus (double number1, double number2) {
        resMinus = number1 - number2;
        return resMinus;
    }

    /**
     * Метод getDivision "Деление"
     * @param number1 - делимое число
     * @param number2 - делитель
     * @return resDivision - результат деления
     */
    public double getDivision (double number1, double number2) {
        if (number2 == 0){
            System.out.println("Error");
        } else {
            resDivision = number1 / number2;
        }
        return resDivision;
    }

    /**
     * Метод getMultipli "Умножение"
     * @param number1 - первое число
     * @param number2 - второе число
     * @return resMultipli - результат деления
     */
    public double getMultipli (double number1, double number2) {
        resMultipli = number1 * number2;
        return resMultipli;
    }
    /**
     * Метод getStepen "Возведение в степень"
     * @param number - число, которое возводим в степень
     * @param pow - степень числа
     * @return resStepen - результат возведения числа в степень
     */
    public double getStepen (double number, int pow) {
        if (pow == 0) {
           return  1.0;
        } else {
            resStepen = 1;
            for (int i = 1; i <= pow; i++) {
                resStepen = resStepen * number;
            }
            return resStepen;
        }
    }

    /**
     * Метод getModul "Модуль числа"
     * @param number - число, модуль числа которого получаем
     * @return resModul - результат действия
     */

     public double getModul (double number) {
         if (number < 0) {
             resModul = -number;
         } else {
             resModul = number;
         }
         return resModul;
     }
    /**
     * Метод getSqrt "Корень числа"
     * @param number - число, корень которого извлекаем
     * @return resSqrt - результат действия
     */
     public double getSqrt (double number) {
        resSqrt = Math.sqrt(number);
        return resSqrt;
    }
}
