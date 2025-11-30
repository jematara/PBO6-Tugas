package tugas8;

import java.util.Scanner;

public class Faktorial {
    int n;

    public Faktorial(int n) {
        this.n = n;
    }
    
    int hitung(){
        int hasil=1;
        for(int i=1; i<=n; i++){
            hasil*=i;
        }
        return hasil;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Faktorial f = new Faktorial(0);
        System.out.println("===== Faktorial =====");
        System.out.print("Masukkan angka : ");
        f.n=input.nextInt();
        System.out.println("Hasil          : "+f.hitung());
    }
}
