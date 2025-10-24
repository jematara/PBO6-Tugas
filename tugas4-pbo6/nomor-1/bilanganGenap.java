package tugas4;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class bilanganGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Program Mengecek Angka Genap ===");
        System.out.print("Masukkan angka : ");
        int a=input.nextInt();
        int hasil=a%2;
        if(hasil==0){
            System.out.println("Angka yang anda masukkan adalah angka genap");
        }else{
            System.out.println("Angka yang anda masukkan bukan angka genap");
        }
    }
}
