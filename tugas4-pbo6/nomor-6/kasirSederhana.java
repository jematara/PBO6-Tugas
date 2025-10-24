package tugas4;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class kasirSederhana {
    public static void main(String[] args) {
        int belanja, bayar, diskon, total, kembalian;
        String member;
        Scanner input = new Scanner(System.in);
        System.out.println("=== Kasir Sederhana ===");
        System.out.print("Apakah anda memiliki kartu member (ya/tidak) : ");
        member=input.next().toLowerCase();
        if("ya".equals(member)){
            System.out.print("Total belanja       : Rp ");
            belanja=input.nextInt();
            System.out.print("Bayar               : Rp ");
            bayar=input.nextInt();
            if(belanja>500000){
                diskon=50000;
                total=belanja-diskon;
                kembalian=bayar-total;
                System.out.println("Diskon              : Rp "+diskon);
                System.out.println("Total harga         : Rp "+total);
                System.out.println("Kembalian           : Rp "+kembalian);
            }else if(belanja>100000) {
                diskon=15000;
                total=belanja-diskon;
                kembalian=bayar-total;
                System.out.println("Diskon              : Rp "+diskon);
                System.out.println("Total harga         : Rp "+total);
                System.out.println("Kembalian           : Rp "+kembalian);
            }else{
                diskon=0;
                total=belanja;
                kembalian=bayar-total;
                System.out.println("Diskon              : Rp "+diskon);
                System.out.println("Total harga         : Rp "+total);
                System.out.println("Kembalian           : Rp "+kembalian);
            }
        }else if("tidak".equals(member)) {
            System.out.print("Total belanja       : Rp ");
            belanja=input.nextInt();
            System.out.print("Bayar               : Rp ");
            bayar=input.nextInt();
            if(belanja>100000) {
                diskon=10000;
                total=belanja-diskon;
                kembalian=bayar-total;
                System.out.println("Diskon              : Rp "+diskon);
                System.out.println("Total harga         : Rp "+total);
                System.out.println("Kembalian           : Rp "+kembalian);
            }else{
                diskon=0;
                total=belanja;
                kembalian=bayar-total;
                System.out.println("Diskon              : Rp "+diskon);
                System.out.println("Total harga         : Rp "+total);
                System.out.println("Kembalian           : Rp "+kembalian);
            }
        }else{
            System.out.println("INVALID!");
        }
    }
}
