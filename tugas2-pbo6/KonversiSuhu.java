public class KonversiSuhu {
    public static void main(String[] args) {
        int c=10;
        int f=15;
        int r=5;
        double cF=(c*9.0/5.0)+32;
        double fC=(5.0/9.0)*(f-32);
        double cR=4.0/5.0*c;
        double rC=5.0/4.0*r;
        double fR=(4.0/9.0)*(f-32);
        double rF=(9.0/4.0*r)+32;
        System.out.println("Celcius    : "+c);
        System.out.println("Fahrenheit : "+f);
        System.out.println("Reamur     : "+r);
        System.out.println("\nCelcius ke Fahrenheit   : "+cF);
        System.out.println("Fahrenheit ke Celcius   : "+fC);
        System.out.println("Celcius ke Reamur       : "+cR);
        System.out.println("Reamur ke Celcius       : "+rC);
        System.out.println("Fahrenheit ke Reamur    : "+fR);
        System.out.println("Reamur ke Fahrenheit    : "+rF);
    }
}
