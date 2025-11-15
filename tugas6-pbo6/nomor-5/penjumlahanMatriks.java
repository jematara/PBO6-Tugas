package tugas6;

import java.util.Scanner;

public class penjumlahanMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] m1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] m2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        System.out.println("===== Menjumlahkan Matriks =====");
        System.out.println("Data matriks 1 : ");
        for(int[] a : m1){
            for(int b : a){
                System.out.print(b+" ");
            }
            System.out.println("");
        }
        System.out.println("Data matriks 2 : ");
        for(int[] a : m2){
            for(int b : a){
                System.out.print(b+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.print("Masukkan baris matriks 1 (0-2) : ");
        int i1=input.nextInt();
        System.out.print("Masukkan kolom matriks 1 (0-2) : ");
        int j1=input.nextInt();
        System.out.print("Masukkan baris matriks 2 (0-2) : ");
        int i2=input.nextInt();
        System.out.print("Masukkan kolom matriks 2 (0-2) : ");
        int j2=input.nextInt();
        int j=m1[i1][j1]+m2[i2][j2];
        System.out.println("");
        System.out.println("Hasil penjumlahan m1,"+i1+j1+" ("+m1[i1][j1]+") + m2,"+i2+j2+" ("+m2[i2][j2]+") : "+j);
    }
}
