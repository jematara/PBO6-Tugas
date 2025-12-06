package tugas9;

public class Segitiga {
    protected int alas, tinggi;
    protected double hasil;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    double luas(){
        return hasil=alas*tinggi*0.5;
    }
    
    void tampil(){
        System.out.println("Alas   : "+alas);
        System.out.println("Tinggi : "+tinggi);
        System.out.println("Hasil  : "+hasil);
    }
}
