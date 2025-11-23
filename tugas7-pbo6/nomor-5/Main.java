package tugas7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rekursif r = new Rekursif();
        System.out.println("----- Rekursi (Faktorial) -----");
        System.out.print("Masukkan angka : ");
        int n=input.nextInt();
        if(n<=0){
            System.out.println("Angka harus lebih dari 0");
        }
        int h=r.faktorial(n);
        System.out.println("\n===== Hasil Faktorial =====");
        System.out.println("Angka : "+n);
        System.out.println("Hasil : "+h);
    }
}
