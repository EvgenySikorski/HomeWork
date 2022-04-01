package home_work_2.loops; // РЕШЩЕНИЕ ЗАДАЧИ №5!!!!!!!!!!

public class loops_1_5 {

    public static void main(String[] args) {
        int j = 1;
        int i = 2;

        for (int z = 1; z <= 10; z++) {
                for (i = 2; i <= 5; i++) {
                    int result = j * i;
                    System.out.print(i + "x" + j + "=" + result + " ");

                }
                System.out.println("");
                j++;

                int k = 1;
                if (z == 10) {
                    for (int v = 1; v <= 10; v++) {
                        for (i = 6; i <= 9; i++) {
                            int result = k * i;
                            System.out.print(i + "x" + k + "=" + result + " ");
                        }
                        System.out.println("");
                        k++;
                    }
                }
        }
    }
}