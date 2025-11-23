package tugas7;

public class SumpahPemuda {
    private String pembuka;
    public SumpahPemuda(String pembuka) {
        this.pembuka="Kami putra dan putri Indonesia, ";
    }
    
    public void tampil(){
        String[] s = {
            "mengaku bertumpah darah yang satu, tanah air Indonesia",
            "mengaku berbangsa yang satu, bangsa Indonesia",
            "menjunjung bahasa persatuan, bahasa Indonesia"
        };
        for(String isi : s){
            System.out.println(pembuka+isi);
        }
    }
}
