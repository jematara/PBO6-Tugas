package tugas3;

//mengakses java.util package di Java untuk Scanner
import java.util.Scanner;

//mengakses java.io package di Java untuk debug ketika ada masalah dengan operasi I/O
import java.io.IOException;

/**
 *
 * @author Lenovo
 */
public class demoScanner {
    public static void main(String[] args) throws IOException {
        //membuat objek Scanner dengan nama input
        Scanner input = new Scanner(System.in);
        
        String nama;
        int umur;
        double nilai;
        char kelas;
        System.out.print("Masukkan Nama  : ");
        nama=input.nextLine();
        System.out.print("Masukkan Umur  : ");
        umur=input.nextInt();
        System.out.print("Masukkan Nilai : ");
        nilai=input.nextDouble();
        System.out.print("Masukkan Kelas : ");
        kelas=input.next().charAt(0);
        System.out.println("\n=======================");
        System.out.println("Nama         : "+nama);
        System.out.println("Umur         : "+umur);
        System.out.println("Nilai        : "+nilai);
        System.out.println("Kelas        : "+kelas);
        System.out.println("=======================");
    }
}
