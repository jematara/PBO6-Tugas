public class WaktuTempuh {
    public static void main(String[] args) {
        double jarakBulan=384000;
        double jarakMatahari=152100000;
        double kecepatanCahaya=300000;
        double waktuBulan=jarakBulan/kecepatanCahaya;
        double waktuMatahari=jarakMatahari/kecepatanCahaya;
        System.out.println("Jarak Bumi ke Bulan                : "+jarakBulan+" km");
        System.out.println("Jarak Bumi ke Matahari             : "+jarakMatahari+" km");
        System.out.println("Kecepatan Cahaya                   : "+jarakBulan+" km/s");
        System.out.println("Waktu Tempuh dari Bumi ke Bulan    : "+waktuBulan+" s");
        System.out.println("Waktu Tempuh dari Bumi ke Matahari : "+waktuMatahari+" s");
}
}
