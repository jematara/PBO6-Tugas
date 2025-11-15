package tugas6;

class cetak extends Thread{
    String nama;
    public cetak(String nama){
        this.nama=nama;
    }
    @Override
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(nama+" mencetak data "+(i+1));
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class thread {
    public static void main(String[] args) throws InterruptedException {
        cetak t1 = new cetak("Thread 1");
        cetak t2 = new cetak("Thread 2");
        t1.start();
        t2.start();
    }
}
