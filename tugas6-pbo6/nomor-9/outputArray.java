package tugas6;

public class outputArray {
    public static void main(String[] args) {
        int[] age = {12, 4, 5, 2, 6};
        System.out.println("===== Output Menggunakan Perulangan For =====");
        System.out.print("Data Array Age : ");
        for(int i=0; i<age.length; i++){
            System.out.print(age[i]+" ");
        }
        System.out.println("");
        System.out.println("===== Output Menggunakan Perulangan Foreach =====");
        System.out.print("Data Array Age : ");
        for(int x : age){
            System.out.print(x+" ");
        }
        System.out.println("");
    }
}
