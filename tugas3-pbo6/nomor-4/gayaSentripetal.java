package tugas3;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class gayaSentripetal {
    public static void main(String[] args) {
        int m, v, r;
        double f;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Massa Benda (kg) : ");
        m = input.nextInt();
        System.out.print("Masukkan Kecepatan Linear (m/s) : ");
        v = input.nextInt();
        System.out.print("Masukkan Jari-jari Lintasan (m) : ");
        r = input.nextInt();
        f = ((double) (m*(v*v))/r);
        System.out.println("\n=====================================");
        System.out.println("Massa Benda (kg)             : "+m);
        System.out.println("Kecepatan Linear (m/s)       : "+v);
        System.out.println("Jari-jari Lintasan (m)       : "+r);
        System.out.println("Gaya Sentripetal (N)         : "+f);
        System.out.println("=====================================");
    }
}
