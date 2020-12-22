package sample;

public class SimpelTest {

    public static void main(String[] args) {
        System.out.println("Velkommen til min opskrift-applikations-dummy");
        blankLine();

        glasurOpskrift();
        blankLine();

        teOpskrift();
    }
    public static void blankLine() {
        System.out.println("");
    }
/*
    private static String glasurOpskrift;
    private static String teOpskrift;

    public static String getGlasurOpskrift() {
        return glasurOpskrift;
    }

    public static void setGlasurOpskrift(String glasurOpskrift) {
        SimpelTest.glasurOpskrift = glasurOpskrift;
    }

    public static String getTeOpskrift() {
        return teOpskrift;
    }

    public static void setTeOpskrift(String teOpskrift) {
        SimpelTest.teOpskrift = teOpskrift;
    }
*/
    public static void glasurOpskrift() {
        Opskrifter glasurOpskrift = new Opskrifter("Glasur");
        Ingrediens flormelis = new Ingrediens("Flormelis");
        Ingrediens Vand = new Ingrediens("Vand");
    }
    public static void teOpskrift() {
        Opskrifter te = new Opskrifter("Te");
        Ingrediens teBrev = new Ingrediens("Tebrev");
        Ingrediens vand = new Ingrediens("Vand");
        Ingrediens citron = new Ingrediens("Citron");
    }

}
