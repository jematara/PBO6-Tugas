package tugas5;

import java.util.Scanner;

public class perbedaanInkremen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i=0, j=0, l;
        System.out.println("=== Perbedaan Increment ===");
        System.out.print("Masukkan jumlah pengulangan : ");
        l=input.nextInt();
        System.out.println("Post-increment (i++) : ");
        while(i<l){
            System.out.print((i++)+" ");
        }
        System.out.println("\n===========================");
        System.out.println("Pre-increment (++i) : ");
        while(j<l){
            System.out.print((++j)+" ");
        }
        System.out.println("");
    }
}
