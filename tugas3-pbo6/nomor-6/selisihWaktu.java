package tugas3;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class selisihWaktu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	System.out.println("Waktu Awal");
	System.out.print("Masukkan Jam   : ");
        String str_jam_awal=input.nextLine();
        System.out.print("Masukkan Menit : ");
        String str_menit_awal=input.nextLine();
	System.out.print("Masukkan Detik : ");
        String str_detik_awal=input.nextLine();
	System.out.println("\nWaktu Akhir");
	System.out.print("Masukkan Jam   : ");
        String str_jam_akhir=input.nextLine();
	System.out.print("Masukkan Menit : ");
        String str_menit_akhir=input.nextLine();
	System.out.print("Masukkan Detik : ");
        String str_detik_akhir=input.nextLine();
	
	String str_waktu_awal=str_jam_awal+":"+str_menit_awal+":"+str_detik_awal;
	String str_waktu_akhir=str_jam_akhir+":"+str_menit_akhir+":"+str_detik_akhir;
	System.out.println("\nWaktu Awal  : "+str_waktu_awal);
	System.out.println("Waktu Akhir : "+str_waktu_akhir);
	
        int jam_awal=Integer.parseInt(str_jam_awal);
	int jam_akhir=Integer.parseInt(str_jam_akhir);
	int menit_awal=Integer.parseInt(str_menit_awal);
	int menit_akhir=Integer.parseInt(str_menit_akhir);
	int detik_awal=Integer.parseInt(str_detik_awal);
	int detik_akhir=Integer.parseInt(str_detik_akhir);
        
        int selisih_detik=0;
        if(detik_awal>detik_akhir) {
            while(detik_awal!=detik_akhir) {
                if(detik_awal==60) {
                    detik_awal=0;
                    menit_awal++;
                    continue;
                }
                detik_awal++;
		selisih_detik++;
            }
        } else if(detik_awal<detik_akhir) {
            selisih_detik=detik_akhir-detik_awal;
        }
        
	int selisih_waktu=selisih_detik;
        
        int selisih_menit=0;
        if(menit_awal>menit_akhir) {
            while(menit_awal!=menit_akhir) {
                if(menit_awal==60) {
                    menit_awal=0;
                    jam_awal++;
                    continue;
                }
                menit_awal++;
                selisih_menit++;
            }
        } else if(menit_awal<menit_akhir) {
            selisih_menit=menit_akhir-menit_akhir;
        }
        selisih_waktu+=selisih_menit*60;
        
        int selisih_jam=0;
        if(jam_awal>jam_akhir) {
            while(jam_awal!=jam_akhir) {
                if(jam_awal==24) {
                    jam_awal=0;
                    continue;
                }
		jam_awal++;
                selisih_jam++;
            }
        } else if(jam_awal<jam_akhir) {
            selisih_jam=jam_akhir-jam_awal;
        }
        selisih_waktu+=selisih_jam*3600;
        System.out.println("\n=========================================================================");
        System.out.println("Selisih antara waktu awal dan waktu akhir (detik)    : "+selisih_waktu);
	int jam=selisih_waktu/3600;
	selisih_waktu %= 3600;
	int menit;
	int detik;
	if(selisih_waktu >= 60) {
            menit=selisih_waktu/60;
            detik=selisih_waktu%60;
        } else {
            menit=0;
            detik=selisih_waktu;
        }
        String waktu=jam+":"+menit+":"+detik;
        System.out.println("Selisih antara waktu awal dan waktu akhir (HH:mm:ss) : "+waktu);
        System.out.println("=========================================================================");
    }
}
