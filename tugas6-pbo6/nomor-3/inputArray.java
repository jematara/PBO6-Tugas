package tugas6;

import java.util.Scanner;

public class inputArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan data array (int) : ");
        int b=input.nextInt();
        int[] a = new int[b];
        int max=a[0], min=a[0], j=0, g=0, id1=0, id2=0;
        double r;
        for(int i=0; i<b; i++){
            System.out.print("Masukkan data ke-"+(i+1)+" : ");
            a[i]=input.nextInt();
            if(i==0){
                max=a[i];
                min=a[i];
                id1=i;
            }
            if(a[i]>max){
                max=a[i];
                id1=i;
            }if(a[i]<min){
                min=a[i];
                id2=i;
            }
            j+=a[i];
        }
        r=(double) j/b;
        for(int i=0; i<b; i++){
            if(i%2==0){
                g+=a[i];
            }
        }
        System.out.println("");
        System.out.println("============= Hasil =============");
        System.out.println("Data terbesar          : "+max+" pada index "+id1);
        System.out.println("Data terkecil          : "+min+" pada index "+id2);
        System.out.println("Total data             : "+j);
        System.out.println("Rata-rata data         : "+r);
        System.out.print("Total data index genap : "+g);
        if(g%2==0){
            System.out.println(", bernilai genap");
        }else{
            System.out.println(", bernilai ganjil");
        }
        System.out.print("Data Array             : [");
        for(int x : a){
            System.out.print(x+" ");
        }
        System.out.println("]");
    }
}
