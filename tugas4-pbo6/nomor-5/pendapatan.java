package tugas4;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class pendapatan {
    public static void main(String[] args) {
        int sales, uj = 0, uk = 0, pay = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("=== Pendapatan Salesman ===");
        System.out.print("Masukkan hasil penjualan : Rp ");
        sales=input.nextInt();
        if(sales<=2000000) {
            uj=100000;
            uk=(int) (0.10*sales);
            pay=uj+uk;
        }else if(sales>2000000 && sales<=5000000){
            uj=200000;
            uk=(int) (0.15*sales);
            pay=uj+uk;
        }else if(sales>5000000) {
            uj=300000;
            uk=(int) (0.20*sales);
            pay=uj+uk;
        }
        System.out.println("Uang jasa yang didapat   : Rp "+uj);
        System.out.println("Uang komisi yang didapat : Rp "+uk);
        System.out.println("Pendapatan hari ini      : Rp "+pay);
    }
}
