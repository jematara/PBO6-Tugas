package tugas9;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- Macam-macam Hewan Berdasarkan Jumlah Kaki -----");
        String[] a1 = {"Kangguru", "Ayam", "Bebek"};
        HewanKakiDua h1 = new HewanKakiDua(a1, "dua");
        h1.tampil();
        String[] a2 = {"Kucing", "Anjing", "Kuda"};
        HewanKakiEmpat h2 = new HewanKakiEmpat(a2, "empat");
        h2.tampil();
        String[] a3 = {"Capung", "Nyamuk", "Kupu-kupu"};
        HewanKakiEnam h3 = new HewanKakiEnam(a3, "enam");
        h3.tampil();
        String[] a4 = {"Kepiting", "Laba-laba"};
        HewanKakiDelapan h4 = new HewanKakiDelapan(a4, "delapan");
        h4.tampil();
    }
}
