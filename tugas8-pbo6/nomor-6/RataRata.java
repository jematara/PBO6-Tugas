package tugas8;

public class RataRata {
    int[] data;

    public RataRata(int[] data) {
        this.data = data;
    }
    
    double rata2(){
        int hasil=0;
        for(int x : data){
            hasil+=x;
        }
        return (double) hasil/data.length;
    }
    
    public static void main(String[] args) {
        int[] a = {5, 15, 10, 25, 20};
        RataRata r = new RataRata(a);
        System.out.println("===== Rata-rata =====");
        System.out.print("Bilangan : ");
        for(int x : a){
            System.out.print(x+" ");
        }
        System.out.println("\nHasil    : "+r.rata2());
    }
}