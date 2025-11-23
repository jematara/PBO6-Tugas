package tugas7;

public class Kalkulator {
    int a1;
    int a2; //atribut

    public Kalkulator(int a1, int a2) {
        this.a1 = a1;
        this.a2 = a2;
    } //konstruktor berparameter agar variabelnya dapat digunakan
    
    public void penjumlahan(){ //method
        int h=a1+a2;
        System.out.println("Penjumlahan "+a1+" + "+a2+" : "+h);
    }
    
    public void pengurangan(){ //method
        int h=a1-a2;
        System.out.println("Penjumlahan "+a1+" - "+a2+" : "+h);
    }
    
    public static void main(String[] args) {
        Kalkulator k1 = new Kalkulator(5, 10); //objek 1 dari kelas Calculator dengan inisialisasi variabel a1 dan a2
        Kalkulator k2 = new Kalkulator(10, 5); //objek 2 dari kelas yang sama namun beda method
        k1.penjumlahan();
        k2.pengurangan();
    }
}
