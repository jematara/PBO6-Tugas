package tugas9;

public class Kucing extends Hewan{
    String nama;

    public Kucing(String nama) {
        this.nama = nama;
    }
    
    String display(){
        return nama;
    }
    
    @Override
    void makan(){
        System.out.println(nama+" sedang makan");
    }
}
