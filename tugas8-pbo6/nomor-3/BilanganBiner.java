package tugas8;

import java.util.Scanner;

public class BilanganBiner {
    int nilai;

    public BilanganBiner(int n) {
        nilai=n;
    }
    
    String biner(){
        return Integer.toBinaryString(nilai);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== Bilangan Bulat ke Biner =====");
        System.out.print("Masukkan angka : ");
        int a=input.nextInt();
        BilanganBiner b = new BilanganBiner(a);
        System.out.println("Biner          : "+b.biner());
    }
}
