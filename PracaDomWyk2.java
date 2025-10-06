import java.util.Scanner;

public class PracaDomWyk2 {
    static void pracaDomowaWyk2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj Liczbe a");
        int a = sc.nextInt();
        System.out.println("Podaj Liczbe b");
        int b = sc.nextInt();
        pracaDomowaWyk2pomocnicza(a, b);
    }
//aaa
    static void pracaDomowaWyk2pomocnicza(int a, int b) {
        int c = a ^ b;
        int d = a & b;
        d = d << 1;
        if (d == 0) {
            IO.println(c);
        } else {
            a = c;
            b = d;
            pracaDomowaWyk2pomocnicza(a, b);
        }
    }
}
