package tugas6;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Object> data;
        data = new ArrayList<>();
        data.add(19);
        data.add(0.2);
        data.add('C');
        data.add("Java");
        data.add(true);
        System.out.println("Data yang terdapat di ArrayList : "+data);
    }
}
