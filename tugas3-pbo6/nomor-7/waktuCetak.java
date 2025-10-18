package tugas3;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class waktuCetak {
    public static void main(String[] args) {
        int hari, jam, menit, detik, lembar, buku, hasil;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Buku yang Akan Dicetak : ");
        buku=input.nextInt();
        System.out.print("Masukkan Jumlah Lembar Per-buku        : ");
        lembar=input.nextInt();
        hasil=buku*lembar;
        System.out.println("\nJumlah Buku yang Dicetak      : "+buku);
        System.out.println("Jumlah Lembar Per-buku        : "+lembar);
        System.out.println("Total Lembar yang Dicetak     : "+hasil);
        hari=hasil/86400;
        hasil=hasil-hari*86400;
        jam=hasil/3600;
        hasil=hasil-jam*3600;
        menit=hasil/60;
        detik=hasil-menit*60;
        System.out.println("\n=====================================================");
        System.out.println("Waktu yang Diperlukan Untuk Pencetakan Adalah : ");
        System.out.println("Hari  : "+hari);
        System.out.println("Jam   : "+jam);
        System.out.println("Menit : "+menit);
        System.out.println("Detik : "+detik);
        System.out.println("=====================================================");
    }
}
