package tugas8;

import java.util.Scanner;

public class Kasir {
    double h, t, d, td, th;
    int j;
    
    double hitung(){
        th=(h*j);
        td=th*(d/100);
        return t=th-td;
    }
    
    public Kasir(double h) {
        this.h = h;
        this.d = 0;
        this.j = 1;
        hitung();
    }
    
    public Kasir(double h, int j) {
        this.h = h;
        this.d = 0;
        this.j = j;
        hitung();
    }

    public Kasir(double h, int j, double d) {
        this.h = h;
        this.j = j;
        this.d = d;
        hitung();
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("===== Kasir =====");
        System.out.print("Masukkan harga      : ");
        double h=input.nextDouble();
        System.out.print("Masukkan jumlah     : ");
        int j=input.nextInt();
        System.out.print("Masukkan diskon (%) : ");
        double d=input.nextDouble();
        System.out.println("");
        Kasir k1 = new Kasir(h);
        System.out.println("Kasir 1     : ");
        System.out.println("Total bayar : "+k1.t);
        System.out.println("");
        Kasir k2 = new Kasir(h, j);
        System.out.println("Kasir 2     : ");
        System.out.println("Total bayar : "+k2.t);
        System.out.println("");
        Kasir k3 = new Kasir(h, j, d);
        System.out.println("Kasir 3     : ");
        System.out.println("Total bayar : "+k3.t);
    }
}
