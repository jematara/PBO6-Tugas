package tugas5;

import java.util.Scanner;

public class penjumlahanBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int j, n=0;
        System.out.println("=== Perulangan Penjumlahan Bilangan ===");
        System.out.print("Masukkan jumlah bilangan : ");
        j=input.nextInt();
        for(int i=0; i<j; i++){
            System.out.print("Masukkan bilangan ke-"+(i+1)+"   : ");
            n+=input.nextInt();
        }
        System.out.println("\nTotal penjumlahan      : "+n);
        System.out.println("Rata-rata penjumlahan  : "+((double) n/j));
    }
}
