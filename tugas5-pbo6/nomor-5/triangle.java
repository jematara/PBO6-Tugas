package tugas5;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Half Triangle & Full Triangle ===");
        System.out.print("Masukkan jumlah baris : ");
        int n=input.nextInt();
        System.out.println("Half Triangle : ");
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*i-1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("=====================================");
        System.out.print("Masukkan jumlah baris : ");
        n=input.nextInt();
        int m=n/2+1;
        System.out.println("Full Triangle : ");
        for(int i=1; i<=m; i++){
            for(int j=i; j<m; j++){
                System.out.print(" ");
            }
            for(int k=0; k<2*i-1 && k<=n; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=m-1; i>=1; i--){
            for(int j=m; j>i; j--){
                System.out.print(" ");
            }
            for(int k=0; k<2*i-1 && k<=n; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
