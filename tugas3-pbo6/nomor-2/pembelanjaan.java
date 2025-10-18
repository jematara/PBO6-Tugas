package tugas3;

import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class pembelanjaan {
    public static void main(String[] args) throws IOException {
        String nama;
        int tb, disc, total, bayar, kembalian;
        Scanner input = new Scanner(System.in);
        DataOutputStream dout = new DataOutputStream(new FileOutputStream("file.txt"));
        System.out.print("Masukkan Nama : ");
        nama=input.nextLine();
        dout.writeUTF(nama);
        System.out.print("Masukkan Total Belanja : ");
        tb=input.nextInt();
        dout.writeInt(tb);
        System.out.print("Masukkan Diskon (%) : ");
        disc=input.nextInt();
        dout.writeInt(disc);
        System.out.print("Masukkan Jumlah Pembayaran : ");
        bayar=input.nextInt();
        dout.writeInt(bayar);
        total=(int) (tb-(tb*((double) disc/100)));
        dout.writeInt(total);
        kembalian=bayar-total;
        dout.writeInt(kembalian);
        DataInputStream din = new DataInputStream(new FileInputStream("file.txt"));
        nama=din.readUTF();
        tb=din.readInt();
        disc=din.readInt();
        bayar=din.readInt();
        total=din.readInt();
        kembalian=din.readInt();
        System.out.println("\n=====================================");
        System.out.println("Nama                    : "+nama);
        System.out.println("Total Belanja           : "+tb);
        System.out.println("Diskon (%)              : "+disc);
        System.out.println("Total                   : "+total);
        System.out.println("Bayar                   : "+bayar);
        System.out.println("Kembalian               : "+kembalian);
        System.out.println("=====================================");
    }
}
