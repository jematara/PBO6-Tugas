package tugas9;

public class Kubus {
    private int sisi;
    public int hasil;
    
    public void setSisi(int sisi){
        this.sisi = sisi;
    }
    
    int getSisi(){
        return sisi;
    }
    
    int volume(){
        return hasil=sisi*sisi*sisi;
    }
}
