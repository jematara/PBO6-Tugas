package tugas7;

public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Jay Clair");
        Dosen ds = new Dosen("Miki Rin");
        Staff st = new Staff("Death Kid");
        
        Civitas cM = new Civitas(mhs);
        Civitas cD = new Civitas(ds);
        Civitas cS = new Civitas(st);
        
        System.out.println("----- Data Civitas FT -----");
        cM.tampil();
        System.out.println("");
        cD.tampil();
        System.out.println("");
        cS.tampil();
        System.out.println("----- Hubungan Antar Objek -----");
        mhs.bimbing(ds);
        ds.bekerja(st);
        st.bantu(mhs);
    }
}
