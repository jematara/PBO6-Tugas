package tugas9;

public class Hewan{
    public String[] nama;
    public String kaki;
    
    void tampil(){
        System.out.print("Hewan berkaki "+kaki+" : ");
        for(String x : nama){
            System.out.println(x+" ");
        }
    }
}
