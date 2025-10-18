package tugas3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Lenovo
 */
public class gajiBersih {
    public static void main(String[] args) throws IOException {
        String nik, nama, alamat, jabatan;
        int gp, tj, ti, ta, total, pajak, gb;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Masukkan Nomor Induk Karyawan : "); nik=br.readLine();
        System.out.print("Masukkan Nama Karyawan : "); nama=br.readLine();
        System.out.print("Masukkan Alamat : "); alamat=br.readLine();
        System.out.print("Masukkan Jabatan : "); jabatan=br.readLine();
        System.out.print("Masukkan Gaji Pokok : "); gp=Integer.parseInt(br.readLine());
        System.out.print("Masukkan Tunjangan Jabatan : "); tj=Integer.parseInt(br.readLine());
        System.out.print("Masukkan Tunjangan Istri : "); ti=Integer.parseInt(br.readLine());
        System.out.print("Masukkan Tunjangan Anak : "); ta=Integer.parseInt(br.readLine());
        total=gp+tj+ti+ta;
        pajak=(int) ((int) (gp+tj+ta)*0.1);
        gb=total-pajak;
        System.out.println("\n============================================");
        System.out.println("Nomor Induk Karyawan : "+nik);
        System.out.println("Nama Karyawan        : "+nama);
        System.out.println("Alamat               : "+alamat);
        System.out.println("Jabatan              : "+jabatan);
        System.out.println("Gaji Pokok           : "+gp);
        System.out.println("Tunjangan Jabatan    : "+tj);
        System.out.println("Tunjangan Istri      : "+ti);
        System.out.println("Tunjangan Anak       : "+ta);
        System.out.println("Total Gaji           : "+total);
        System.out.println("Pajak Penghasilan    : "+pajak);
        System.out.println("Gaji Bersih          : "+gb);
        System.out.println("============================================");
}
}
