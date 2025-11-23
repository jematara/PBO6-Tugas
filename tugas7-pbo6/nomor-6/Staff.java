package tugas7;

public class Staff {
    private String nama;

    public Staff(String nama) {
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void bekerja(Dosen ds){
        System.out.println(nama+" bekerja dengan "+ds.getNama());
    }
    
    public void bantu(Mahasiswa mhs){
        System.out.println(nama+" membantu "+mhs.getNama());
    }
}
