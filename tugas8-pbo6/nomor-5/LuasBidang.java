package tugas8;

public class LuasBidang {
    int p, l;

    public LuasBidang(int p, int l) {
        this.p = p;
        this.l = l;
    }
    
    int luas(){
        return p*l;
    }
    
    public static void main(String[] args) {
        LuasBidang b1 = new LuasBidang(10, 5);
        LuasBidang b2 = new LuasBidang(8, 4);
        int luasHitam = b1.luas()-b2.luas();
        System.out.println("===== Luas Bidang Dalam =====");
        System.out.println("B1    : P = 10, L = 5");
        System.out.println("B2    : P = 8, L = 4");
        System.out.println("Hasil : "+luasHitam);
    }
}
