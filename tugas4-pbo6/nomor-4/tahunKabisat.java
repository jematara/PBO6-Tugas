package tugas4;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class tahunKabisat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Menentukan Tahun Kabisat ===");
        System.out.print("Masukkan tahun : ");
        int y=input.nextInt();
        int hasil=y%400;
        if(hasil!=0){
            hasil=y%100;
            if(hasil!=0) {
                hasil=y%4;
                if(hasil==0){
                    System.out.println(y+" merupakan tahun kabisat");
                }else{
                    System.out.println(y+" bukan merupakan tahun kabisat");
                }
            }else{
                System.out.println(y+" bukan merupakan tahun kabisat");
            }
        }else{
            System.out.println(y+" merupakan tahun kabisat");
        }
    }
}
