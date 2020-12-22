package sample;

import java.util.ArrayList;

public class SimpelTest {

    public static void main(String[] args) {
        System.out.println("Velkommen til min opskrift-applikations-dummy");
        blankLine();
        Opskrifter glasurOpskrift = new Opskrifter("Glasur");
        Ingrediens flormelis = new Ingrediens("Flormelis");
        Ingrediens Vand = new Ingrediens("Vand");
        blankLine();
        Opskrifter teOpskrift = new Opskrifter("Te");
        Ingrediens teBrev = new Ingrediens("Tebrev");
        Ingrediens vand = new Ingrediens("Vand");
        Ingrediens citron = new Ingrediens("Citron",28);
        Ingrediens sukker = new Ingrediens("Sukker",200);

        blankLine();

        ArrayList<String> ingredienserGlasurOpskrift = new ArrayList<>();
        ingredienserGlasurOpskrift.add("Flormelis");
        ingredienserGlasurOpskrift.add("Vand");

        ArrayList<String> ingredienserTeOpskrift = new ArrayList<>();
        ingredienserTeOpskrift.add("Vand");
        ingredienserTeOpskrift.add("Tebrev");
        ingredienserTeOpskrift.add("Citron");
        ingredienserTeOpskrift.add("Sukker");

        System.out.println("Du skal til glasur bruge:");
        for (int i = 0; i < ingredienserGlasurOpskrift.size(); i++) {
            System.out.println(" - " + ingredienserGlasurOpskrift.get(i));
        }
        blankLine();
        System.out.println("Du skal til te bruge:");
        for (int i = 0; i < ingredienserTeOpskrift.size(); i++) {
            System.out.println(" - " + ingredienserTeOpskrift.get(i));
        }
        blankLine();
        glasurOpskrift.visFremgangsmaadeGlasur();
        blankLine();
        teOpskrift.visFremgangsmaadeTe();

        blankLine();
        glasurOpskrift.visOpskriftGlasur();
        blankLine();
        teOpskrift.visOpskriftTe();

        blankLine();
        citron.rigPaaKalorier();
        sukker.rigPaaKalorier();
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
}
