package tugas9;

public class Komik extends Produk{
    int jumlah_halaman;
    
    public Komik(int jumlah_halaman, String judul, String penulis) {
        super(judul, penulis);
        this.jumlah_halaman = jumlah_halaman;
    }
    
    String getInfoProduk(){
        return "Jumlah halaman : "+jumlah_halaman+"\nJudul          : "+judul+"\nPenulis        : "+penulis;
    }
}
