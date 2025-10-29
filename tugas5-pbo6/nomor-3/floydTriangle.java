package tugas5;

import java.util.Scanner;

public class floydTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=1, b;
        System.out.println("=== Floyd's Triangle ===");
        System.out.print("Masukkan jumlah baris : ");
        b=input.nextInt();
        for(int i=1; i<=b; i++){
            for(int j=1; j<=i; j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println("");
        }
    }
}
