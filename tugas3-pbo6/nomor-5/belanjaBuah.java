package tugas3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lenovo
 */
public class belanjaBuah {
    public static void main(String[] args) throws IOException {
        int mangga, jambu, jt, mb, tm, tj, tb, buah;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan Jumlah Buah Mangga : "); mangga=Integer.parseInt(br.readLine());
        System.out.print("Masukkan Jumlah Buah Jambu per-Tetangga : "); jambu=Integer.parseInt(br.readLine());
        System.out.print("Masukkan Jumlah Tetangga : "); jt=Integer.parseInt(br.readLine());
        System.out.print("Masukkan Jumlah Mangga yang Busuk : "); mb=Integer.parseInt(br.readLine());
        tm=mangga-mb;
        tj=jambu*jt;
        tb=mangga+tj;
        buah=tm+tj;
        System.out.println("\n===========================================");
        System.out.println("Total Mangga                    : "+mangga);
        System.out.println("Total Mangga yang Baik          : "+tm);
        System.out.println("Total Jambu                     : "+tj);
        System.out.println("Total Buah yang Dibeli          : "+tb);
        System.out.println("Total Buah Setelah Dikembalikan : "+buah);
        System.out.println("===========================================");
    }
}