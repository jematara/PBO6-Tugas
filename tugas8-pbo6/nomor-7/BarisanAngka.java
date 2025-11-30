package tugas8;

public class BarisanAngka {
    int[] data;

    public BarisanAngka(int[] data) {
        this.data = data;
    }
    
    void tampil(BarisanAngka b){
        for(int x : data){
            System.out.print(x+" ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        int[] a = {10, 5, 25, 20, 15};
        BarisanAngka b = new BarisanAngka(a);
        System.out.println("===== Barisan Angka =====");
        System.out.print("Bilangan : ");
        b.tampil(b);
    }
}
