package tugas8;

import java.util.Scanner;

public class NilaiBerpangkat {
    int a, b;

    public NilaiBerpangkat(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    int hitung(){
        int hasil=1;
        for(int i=0; i<b; i++){
            hasil*=a;
        }
        return hasil;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NilaiBerpangkat p = new NilaiBerpangkat(0, 0);
        System.out.println("===== Pangkat =====");
        System.out.print("Masukkan angka   : ");
        p.a=input.nextInt();
        System.out.print("Masukkan pangkat : ");
        p.b=input.nextInt();
        System.out.println("Hasil            : "+p.hitung());
    }
}
