package sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SimpelTest {

    public static void main(String[] args) {
        System.out.println("Velkommen til min opskrift-applikations-dummy");

        //TODO Forskellige objekter med navn og kalorier:
        blankLine();
        Opskrifter glasurOpskrift = new Opskrifter("Glasur");
        Ingrediens flormelis = new Ingrediens("Flormelis",390);
        Ingrediens Vand = new Ingrediens("Vand",0);
        blankLine();
        Opskrifter teOpskrift = new Opskrifter("Te");
        Ingrediens teBrev = new Ingrediens("Tebrev",0);
        Ingrediens vand = new Ingrediens("Vand",0);
        Ingrediens citron = new Ingrediens("Citron",28);
        Ingrediens sukker = new Ingrediens("Sukker",390);

        blankLine();
        //TODO Arraylist glasur
        ArrayList<String> ingredienserGlasurOpskrift = new ArrayList<>();
        ingredienserGlasurOpskrift.add("Flormelis");
        ingredienserGlasurOpskrift.add("Vand");

        //TODO Arraylist te
        ArrayList<String> ingredienserTeOpskrift = new ArrayList<>();
        ingredienserTeOpskrift.add("Vand");
        ingredienserTeOpskrift.add("Tebrev");
        ingredienserTeOpskrift.add("Citron");
        ingredienserTeOpskrift.add("Sukker");

        //TODO 2 Fori loops der går igennem de to opskrifter
        System.out.println("Du skal til glasur bruge:");
        for (int i = 0; i < ingredienserGlasurOpskrift.size(); i++) {
            System.out.println(" - " + ingredienserGlasurOpskrift.get(i));
        }
        blankLine();
        System.out.println("Du skal til te bruge:");
        for (int i = 0; i < ingredienserTeOpskrift.size(); i++) {
            System.out.println(" - " + ingredienserTeOpskrift.get(i));
        }

        //TODO Objekt.Fremgangsmåde
        blankLine();
        glasurOpskrift.visFremgangsmaadeGlasur();
        blankLine();
        teOpskrift.visFremgangsmaadeTe();

        //TODO Objekt.visOpskrift
        blankLine();
        glasurOpskrift.visOpskriftGlasur();
        blankLine();
        teOpskrift.visOpskriftTe();

        //TODO Objekt.rigpåkalorier
        blankLine();
        citron.rigPaaKalorier();
        sukker.rigPaaKalorier();

        //TODO Ingridiens detaljer og om det er godt mod forkøelse.
        blankLine();
        IngrediensNedarvingsDetaljer citronDetaljer = new IngrediensNedarvingsDetaljer("Citron",53,8,26);
        citronDetaljer.godModForkoelse();

        blankLine();
        IngrediensNedarvingsDetaljer pølseDetaljer = new IngrediensNedarvingsDetaljer("Pølse",2,12,7);
        pølseDetaljer.godModForkoelse();

        blankLine();

        //TODO Sort ingredienserTeOpskrift
        Collections.sort(ingredienserTeOpskrift);
        //TODO søge algoritme: Binarysearch:
        int result = Arrays.binarySearch(new ArrayList[]{ingredienserTeOpskrift},"Sukker");
        if (result == -1) {
            System.out.println("Element is not present");
        } else
            System.out.println("Element is present at index " + result);
    }

    //TODO blankLine metode
    public static void blankLine() {
        System.out.println("");
    }
}
