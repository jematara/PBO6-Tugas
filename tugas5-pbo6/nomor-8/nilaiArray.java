package tugas5;

public class nilaiArray {
    public static void main(String[] args) {
        String[] n = {"Franz Kafka", "Fyodor Dostoevsky", "Jane Austen", "Emily Brontë", "Albert Camus"};
        int j=1;
        System.out.println("=== Menampilkan Data dalam Array ===");
        System.out.println("Array nama penulis classic : ");
        for(String i : n){
            System.out.println(j+". "+i);
            j++;
        }
    }
}
