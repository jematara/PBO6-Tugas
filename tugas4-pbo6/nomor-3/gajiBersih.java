package tugas4;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class gajiBersih {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nik, nama, ket;
        int kdgol, jmlanak = 0;
        double tnjanak, tnjpas, gapok, gaber = 0;
        System.out.println("=== Menghitung Gaji Bersih Karyawan ===");
        System.out.print("Masukkan NIK Karyawan : ");
        nik=input.next();
        input.nextLine();
        System.out.print("Masukkan Nama Karyawan : ");
        nama=input.nextLine();
        System.out.println("Kode Golongan : ");
        System.out.println("1. Menikah");
        System.out.println("2. Belum Menikah");
        System.out.println("3. Cerai");
        System.out.println("4. Menikah dan punya anak");
        System.out.print("Pilih Status (1-4) : ");
        kdgol=input.nextInt();
        switch(kdgol){
            case 1:
                ket="Menikah";
                gapok=1200000;
                tnjpas=gapok*0.1;
                gaber=gapok+tnjpas;
                break;
            case 2:
                ket="Belum Menikah";
                gapok=1500000;
                gaber=gapok;
                break;
            case 3:
                ket="Cerai";
                gapok=1750000;
                gaber=gapok;
                break;
            case 4:
                ket="Menikah dan Punya Anak";
                gapok=2000000;
                System.out.print("Masukkan Jumlah Anak : ");
                jmlanak=input.nextInt();
                tnjpas=gapok*0.1;
                tnjanak=gapok*0.05*jmlanak;
                gaber=gapok+tnjpas+tnjanak;
                break;
            default:
                ket="INVALID!";
                gapok=0;
                break;
        }
        System.out.println("\n======================================================");
        System.out.println("NIK Karyawan               : "+nik);
        System.out.println("Nama Karyawan              : "+nama);
        if(kdgol==4){
            System.out.println("Status Pernikahan Karyawan : "+ket);
            System.out.println("Jumlah Anak Karyawan       : "+jmlanak);
            System.out.println("Gaji Pokok Karyawan        : "+gapok);
            System.out.println("Gaji Bersih Karyawan       : "+gaber);
        }else{
            System.out.println("Status Pernikahan Karyawan : "+ket);
            System.out.println("Gaji Pokok Karyawan        : "+gapok);
            System.out.println("Gaji Bersih Karyawan       : "+gaber);
        }
        System.out.println("======================================================");
    }
}
