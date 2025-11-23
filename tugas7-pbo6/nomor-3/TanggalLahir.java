package tugas7;

public class TanggalLahir {
    int t, b, h;

    public TanggalLahir(int t, int b) {
        this.t = t;
        this.b = b;
    }
    
    int tahun(int b, int t){
        h=b*100+t;
        return h;
    }
}
