package tugas7;

public class DataMhs {
    String nama, npm;
    char kelas;

    public DataMhs(String nama, String npm, char kelas) {
        this.nama = nama;
        this.npm = npm;
        this.kelas = kelas;
    }
    
    public void tampil(){
        System.out.println("Nama  : "+nama);
        System.out.println("NPM   : "+npm);
        System.out.println("Kelas : "+kelas);
    }
}
