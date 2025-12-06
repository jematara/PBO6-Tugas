package tugas9;

public class HewanKakiDua extends Hewan {
    public String[] nama;
    public String kaki;

    public HewanKakiDua(String[] nama, String kaki) {
        this.nama = nama;
        this.kaki = kaki;
    }
    
    @Override
    void tampil(){
        System.out.print("Hewan berkaki "+kaki+" : ");
        for(String x : nama){
            System.out.print(x+", ");
        }
        System.out.print("dll\n");
    }
}
