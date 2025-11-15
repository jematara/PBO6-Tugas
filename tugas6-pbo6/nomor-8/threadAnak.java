package tugas6;

import java.util.Scanner;

public class threadAnak {
    static class Main extends Thread {
        int id;
        public Main(int id){
            this.id=id;
        }
        @Override
        public void run(){
            System.out.println("Thread anak "+id+" mencetak data");
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
            }
            System.out.println("Thread anak "+id+" selesai mencetak");
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.print("Input jumlah anak thread : ");
        int c=input.nextInt();
        System.out.println("Thread Main membuat "+c+" thread anak");
        Thread[] child = new Thread[c];
        for(int i=0; i<c; i++){
            child[i] = new Main(i+1);
            child[i].start();
        }
        for(int i=0; i<c; i++){
            child[i].join();
        }
        System.out.println("Semua thread anak selesai. Thread utama selesai.");
    }
}
