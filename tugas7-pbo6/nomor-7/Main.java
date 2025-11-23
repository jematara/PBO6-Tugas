package tugas7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DataMhs d = new DataMhs(null, null, '0');
        System.out.println("----- Data Mahasiswa -----");
        System.out.print("Masukkan nama  : ");
        d.nama=input.nextLine();
        System.out.print("Masukkan NPM   : ");
        d.npm=input.next();
        System.out.print("Masukkan kelas : ");
        d.kelas=input.next().charAt(0);
        System.out.println("\n===== Data Mahasiswa =====");
        d.tampil();
    }
}
