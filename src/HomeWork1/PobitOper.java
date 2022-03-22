package HomeWork1;

public class PobitOper {
    public static void main(String[] args) {
        int a = 42;     // 00101010 число 42 в двоичной форме
        int b = 15;     // 00001111 число 15 в двоичной форме
        int c = a | b;  // 00101111 Побитовое OR: результирующий бит равен 1, если соответствующий бит в любом из операндов равен 1

        //число 42 в двоичной системе
        System.out.println("a =" + Integer.toBinaryString(a));
        //число 15 в двоичной системе
        System.out.println(Integer.toBinaryString(b));

        //обратыный перевод из двоичной системы в десятичную
        System.out.println(Integer.parseInt("00101111", 2));
        System.out.println(c);

        int d = 5 + 2 / 8;
        System.out.println(d);


    }
}
