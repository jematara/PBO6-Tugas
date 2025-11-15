package tugas6;

public class arrayMobil {
    public static void main(String[] args) {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};
        System.out.print("Data array sebelum diubah : ");
        for(String a : mobil){
            System.out.print(a+" ");
        }
        int id=-1;
        for(int i=0; i<mobil.length; i++){
            if(mobil[i].equals("Suzuki")){
                id=i;
                break;
            }
        }
        System.out.println("");
        if(id!=-1){
            mobil[id]="Mercedes";
            System.out.print("Data array setelah diubah : ");
            for(String a : mobil){
                System.out.print(a+" ");
            }
        }
        System.out.println("");
    }
}
