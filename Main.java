public class Main{
    public static void main(String args[]){
        Bottiglia b1 = new Bottiglia("vetro", 2, "verde");
        Bottiglia b2 = new Bottiglia(b1);
        Bottiglia b3 = new Bottiglia(b2);
        b1.riempi("vino");
        b2.riempi("vino");
        b3.riempi("olio");
        Bottiglia b4 = new Bottiglia("plastica", 1.5, "trasparente");
        b4.riempi("birra");
        /*System.out.println(b1.info());
        System.out.println(b2.info());
        System.out.println(b3.info());
        System.out.println(b4.info());*/
        b1.usa(1.2);b1.usa(1);
        b3.usa(2);
        b3.riempi("vino");
        b1.riempi("acqua");
        /*System.out.println(b1.info());
        System.out.println(b2.info());
        System.out.println(b3.info());
        System.out.println(b4.info());*/
        
        System.out.println(b1.toString());
        System.out.println(b1);
    }
}