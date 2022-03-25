package HomeWork1;

public class task2_8 {

    public static void main(String[] args) {

        boolean a = 6 - 2 > 3 && 12 * 12 <= 199;
        // логический оператор И && выводит true когда оба выражения true, если хотя бы одно false - значит в результате false.
        // 6 -2 = 4 > 3 true
        // 12 * 12 = 144 <= 199 true
        //Оба условия true - значит и в результате true

        System.out.println(a);
    }
}

