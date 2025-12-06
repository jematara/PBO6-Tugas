package tugas9;

public class Komik extends Produk{
    public Komik(String judul, String penulis) {
        super(judul, penulis);
    }
    
    String getInfoProduk(){
        return "Judul   : "+judul+"\nPenulis : "+penulis;
    }
}
