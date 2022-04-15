package HomeWork1.razbor;

public class hw1 {
    public static void main(String[] args) {
        int s = 3700;
        int sec = s % 60;
        System.out.println(sec);
        int m = (s - sec) / 60;
        System.out.println(m);
        int min = m % 60;
        System.out.println(min);
        int h = (m - min) / 60;
        System.out.println(h);
        System.out.println(h + "часов" + min + "минут" + sec + "секунд");

    }
}
