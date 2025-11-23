package tugas7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Keliling k = new Keliling();
        System.out.println("----- Keliling Persegi Panjang -----");
        System.out.print("Masukkan panjang  : ");
        k.p=input.nextInt();
        System.out.print("Masukkan lebar    : ");
        k.l=input.nextInt();
        System.out.println("Hasil             : "+k.kel());
    }
}
