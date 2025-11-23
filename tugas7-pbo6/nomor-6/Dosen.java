package tugas7;

public class Dosen {
    private String nama;

    public Dosen(String nama) {
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void bimbing(Mahasiswa mhs){
        System.out.println(nama+" membimbing "+mhs.getNama());
    }
    
    public void bekerja(Staff st){
        System.out.println(nama+" bekerja dengan "+st.getNama());
    }
}
