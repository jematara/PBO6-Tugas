package tugas6;

import java.util.ArrayList;

public class arrayInt {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0]=1;
        a[1]=2;
        a[2]=3;
        int n[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        ArrayList<Integer> b = new ArrayList<>();
        b.add(4);
        b.add(5);
        b.add(6);
        System.out.print("Array pertama : ");
        for(int i : a){
            System.out.print(i+" ");
        }
        System.out.println("");
        System.out.println("Array kedua   : ");
        for(int j[] : n){
            for(int l : j){
                System.out.print(l+" ");
            }
            System.out.println("");
        }
        System.out.print("Array ketiga  : "+b);
        System.out.println("");
    }
}
