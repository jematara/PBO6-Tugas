package tugas9;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- Komik & Games -----");
        System.out.println("Komik -----");
        Komik p1 = new Komik("The Metamorphosis", "Franz Kafka");
        System.out.println(p1.getInfoProduk());
        System.out.println("Games -----");
        Games p2 = new Games("Saihate Station", "びぶ / viv");
        System.out.println(p2.getInfoProduk());
    }
}
