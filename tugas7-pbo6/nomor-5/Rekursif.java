package tugas7;

public class Rekursif {
    int faktorial(int n){
        if(n<0){
            System.out.println("Angka harus lebih dari 0");
        }
        if(n==0 || n==1){
            return 1;
        }
        return n*faktorial(n-1);
    }
}
