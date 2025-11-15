package tugas6;

import java.util.Scanner;

public class rata_rata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, j=0;
        double r;
        try{
            System.out.print("Masukkan jumlah bilangan pada array : ");
            n=input.nextInt();
            int[] a = new int[n];
            for(int i=0; i<n; i++){
                System.out.print("Masukkan bilangan ke-"+i+" : ");
                a[i]=input.nextInt();
                j+=a[i];
            }
            r=(double) j/n;
            System.out.println("Total     : "+j);
            System.out.println("Rata-rata : "+r);
        }catch (Exception e){
            System.out.println("Masukkan invalid");
        }finally{
            System.out.println("Program berakhir");
        }
    }
}
