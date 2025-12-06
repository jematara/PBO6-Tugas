package tugas9;

public class Main {
    public static void main(String[] args) {
        Kubus k1 = new Kubus();
        System.out.println("----- Volume Kubus -----");
        k1.setSisi(5);
        k1.volume();
        System.out.println("Sisi  : "+k1.getSisi());
        System.out.println("Hasil : "+k1.hasil);
    }
}
