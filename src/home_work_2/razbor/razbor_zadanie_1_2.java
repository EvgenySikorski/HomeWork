package home_work_2.razbor;

public class razbor_zadanie_1_1 {
    public static void main(String[] args) {

        String rawData = args[0];

        //
        // char[] chars = rawData.toCharArray(); создается новый массив

        boolean findNotDigit = false;

        for (int i = 0; i < rawData.length(); i++) {
            char c = rawData.charAt(i);
            if(!Character.isDigit(c)){
                findNotDigit = true;
            }
        }

        if(findNotDigit){
            System.out.println("Вы ввели не число");
        } else {
            int number = Integer.parseInt(rawData);

            // проверка переполнения опытным путем, проверили при каком значение идет переполнение и указали в условии
            if (number > 16) {
                System.out.println("Извините, такие большие числа не используем");
            } else {

                int result = 1;

                for (int i = 0; i < number; i++) {
                    result *= (i + 1);
                }
                System.out.println(result);
            }
        }



    }

}
