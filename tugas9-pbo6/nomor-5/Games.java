package tugas9;

public class Games extends Produk{
    public Games(String judul, String penulis) {
        super(judul, penulis);
    }
    
    String getInfoProduk(){
        return "Judul   : "+judul+"\nPenulis : "+penulis;
    }
}
