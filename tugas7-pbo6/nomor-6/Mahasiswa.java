package tugas7;

public class Mahasiswa {
    private String nama;
    private String status;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void bimbing(Dosen ds){
        System.out.println(nama+" dibimbing oleh "+ds.getNama());
    }
    
    public void bantu(Staff st){
        System.out.println(nama+" dibantu oleh "+st.getNama());
    }
}
