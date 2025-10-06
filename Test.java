import java.util.Scanner;

public class Test {
    static void test(){
        IO.print("Hello from test");
    }

    static void pracaDomowaWyk2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj Liczbe a");
        int a = sc.nextInt();
        System.out.println("Podaj Liczbe b");
        int b = sc.nextInt();
        int c = a ^ b;

        IO.println(Integer.toBinaryString(c));
    }

    static void przesunieciaBinarne(){
        int liczba = -0b100;
        int l =liczba<<3;

//        IO.print(Integer.toBinaryString(l));
        IO.print(Integer.toBinaryString(l));
    }
}
