package tugas5;

import java.util.Scanner;

public class menentukanAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, max=0, min=0;
        System.out.println("=== Menentukan Angka Terbesar & Terkecil ===");
        for(int i=0; i<10; i++){
            System.out.print("Masukkan angka : ");
            a=input.nextInt();
            if(i==0){
                max=a;
                min=a;
            }
            if(a>max){
                max=a;
            }
            if(a<min){
                min=a;
            }
        }
        System.out.println("\nAngka terbesar : "+max);
        System.out.println("Angka terkecil : "+min);
    }
}
