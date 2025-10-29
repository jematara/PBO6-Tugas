package tugas5;

import java.util.Scanner;

public class angkaGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b=1, j=0;
        System.out.println("=== Penjumlahan Angka Ganjil ===");
        System.out.print("Masukkan jumlah angka : ");
        a=input.nextInt();
        for(int i=0; i<a; i++){
            System.out.print(b+" ");
            j+=a;
            b+=2;
        }
        System.out.println("\nTotal penjumlahan : "+j);
    }
}
