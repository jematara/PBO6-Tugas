package tugas4;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class kodeHari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Kode Hari ===");
        System.out.print("Masukkan kode hari (1-7) : ");
        int kode=input.nextInt();
        switch(kode) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jum'at");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
            default:
                System.out.println("INVALID!");
                break;
        }
    }
}
