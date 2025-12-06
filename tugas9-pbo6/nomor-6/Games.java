package tugas9;

public class Games extends Produk{
    int waktu_main;
    
    public Games(int waktu_main, String judul, String penulis) {
        super(judul, penulis);
        this.waktu_main = waktu_main;
    }
    
    String getInfoProduk(){
        return "Waktu main : "+waktu_main+" menit\nJudul      : "+judul+"\nPenulis    : "+penulis;
    }
}
