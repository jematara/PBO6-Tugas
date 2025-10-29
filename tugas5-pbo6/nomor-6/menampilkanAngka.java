package tugas5;

import java.util.Scanner;

public class menampilkanAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Menampilkan Angka dengan Pengulangan ===");
        for(int i=0; i<10; i++){
            System.out.println((i+1)+". 11");
            if(i==1){
                break;
            }
        }
        System.out.println("Pengulangan telah selesai");
    }
}
