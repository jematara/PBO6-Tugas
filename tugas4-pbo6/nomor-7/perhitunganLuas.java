package tugas4;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class perhitunganLuas {
    public static void main(String[] args) {
        int p;
        double hasil;
        Scanner input = new Scanner(System.in);
        System.out.println("=== Perhitungan Luas Bangun Datar ====");
        System.out.println("Menu : ");
        System.out.println("1. Luas persegi");
        System.out.println("2. Luas segitiga");
        System.out.println("3. Luas lingkaran");
        System.out.println("4. Luas trapesium");
        System.out.println("5. Luas layang-layang");
        System.out.print("Pilih (1-5) : ");
        p=input.nextInt();
        switch(p) {
            case 1:
                System.out.print("Masukkan sisi persegi : ");
                int s=input.nextInt();
                hasil=s*s;
                System.out.println("Luas persegi          : "+hasil);
                break;
            case 2:
                System.out.print("Masukkan alas segitiga   : ");
                int alas=input.nextInt();
                System.out.print("Masukkan tinggi segitiga : ");
                int tinggi=input.nextInt();
                hasil=0.5*alas*tinggi;
                System.out.println("Luas segitiga            : "+hasil);
                break;
            case 3:
                System.out.print("Masukkan jari-jari lingkaran : ");
                int r=input.nextInt();
                hasil=3.14*r*r;
                System.out.println("Luas lingkaran               : "+hasil);
                break;
            case 4:
                System.out.print("Masukkan sisi a sejajar   : ");
                int a=input.nextInt();
                System.out.print("Masukkan sisi b sejajar   : ");
                int b=input.nextInt();
                System.out.print("Masukkan tinggi trapesium : ");
                int t=input.nextInt();
                hasil=0.5*(a+b)*t;
                System.out.println("Luas trapesium            : "+hasil);
                break;
            case 5:
                System.out.print("Masukkan diagonal pertama : ");
                int d1=input.nextInt();
                System.out.print("Masukkan diagonal kedua   : ");
                int d2=input.nextInt();
                hasil=0.5*d1*d2;
                System.out.println("Luas layang-layang        : "+hasil);
                break;
            default:
                System.out.println("INVALID!");
        }
    }
}
