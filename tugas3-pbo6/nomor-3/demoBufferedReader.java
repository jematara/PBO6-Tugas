package tugas3;

//mengakses java.io package di Java untuk BufferedReader dan InputStreamReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//mengakses java.io package di Java untuk debug ketika ada masalah dengan operasi I/O
import java.io.IOException;

/**
 *
 * @author Lenovo
 */
public class demoBufferedReader {
    public static void main(String[] args) throws IOException {
        //membuat objek BufferedReader dengan nama input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String nama;
        int umur;
        double nilai;
        char kelas;
        System.out.print("Masukkan Nama  : ");
        nama=br.readLine();
        System.out.print("Masukkan Umur  : ");
        umur=Integer.parseInt(br.readLine());
        System.out.print("Masukkan Nilai : ");
        nilai=Double.parseDouble(br.readLine());
        System.out.print("Masukkan Kelas : ");
        kelas=(char)br.read();
        System.out.println("\n=======================");
        System.out.println("Nama         : "+nama);
        System.out.println("Umur         : "+umur);
        System.out.println("Nilai        : "+nilai);
        System.out.println("Kelas        : "+kelas);
        System.out.println("=======================");
    }
}
