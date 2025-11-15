package tugas6;

import java.util.ArrayList;
import java.util.Scanner;

class Mhs {
    String nama;
    int nilai;
    String status;
    
    public Mhs(String nama, int nilai){
        this.nama=nama;
        this.nilai=nilai;
        if(nilai>50){
            this.status="Lulus";
        }else{
            this.status="Tidak Lulus";
        }
    }
}

public class arrayMhs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int id=1, nilai;
        String nama;
        ArrayList<Mhs> mhs;
        mhs = new ArrayList<>();
        System.out.println("===== Data Mahasiswa =====");
        System.out.print("Masukkan jumlah mahasiswa : ");
        int m=input.nextInt();
        System.out.println("");
        for(int i=0; i<m; i++){
            input.nextLine();
            System.out.println("Data mahasiswa ke-"+(i+1));
            System.out.print("Masukkan nama  : ");
            nama=input.nextLine();
            System.out.print("Masukkan nilai : ");
            nilai=input.nextInt();
            mhs.add(new Mhs(nama, nilai));
            System.out.println("");
        }
        System.out.println("Daftar Nilai Mahasiswa");
        System.out.println("------------------------------------------------");
        for(Mhs a : mhs){
            System.out.println((id++)+"\t"+a.nama+"\t"+a.nilai+"\t"+a.status);
        }
        System.out.println("------------------------------------------------");
    }
}
