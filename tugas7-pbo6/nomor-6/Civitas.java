package tugas7;

public class Civitas {
    private Mahasiswa mhs;
    private Dosen ds;
    private Staff st;

    public Civitas(Mahasiswa m) {
        this.mhs = m;
    }
    
    public Civitas(Dosen d) {
        this.ds = d;
    }
    
    public Civitas(Staff s) {
        this.st = s;
    }
    
    public String getNama(){
        if(mhs!=null)return mhs.getNama();
        if(ds!=null)return ds.getNama();
        if(st!=null)return st.getNama();
        return "Unknown";
    }
    
    public String getStatus(){
        if(mhs!=null)return "Mahasiswa";
        if(ds!=null)return "Dosen";
        if(st!=null)return "Staff";
        return "Undefined";
    }
    
    public void tampil(){
        System.out.println("Nama   : "+getNama());
        System.out.println("Status : "+getStatus());
    }
}
