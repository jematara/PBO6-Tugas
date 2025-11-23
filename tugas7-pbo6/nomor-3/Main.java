package tugas7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TanggalLahir tl = new TanggalLahir(0, 0);
        System.out.println("----- Menebak Tanggal Lahir -----");
        System.out.print("Masukkan bulan   : ");
        int b=input.nextInt();
        System.out.print("Masukkan tanggal : ");
        int t=input.nextInt();
        tl.tahun(b, t);
        System.out.println("Hasil            : "+tl.h);
    }
}
