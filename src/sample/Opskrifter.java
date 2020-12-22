package sample;

import java.util.ArrayList;

import static sample.SimpelTest.blankLine;

public class Opskrifter {
    //TODO Varialber
    private String navn;
    private String fremgangsmaade;
    private int antalPortioner;
    private double tilberedningstid;
    private String ingredienser;

    // TODO Getter og Setters
    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getFremgangsmaade() {
        return fremgangsmaade;
    }

    public void setFremgangsmaade(String fremgangsmaade) {
        this.fremgangsmaade = fremgangsmaade;
    }

    public int getAntalPortioner() {
        return antalPortioner;
    }

    public void setAntalPortioner(int antalPortioner) {
        this.antalPortioner = antalPortioner;
    }

    public double getTilberedningstid() {
        return tilberedningstid;
    }

    public void setTilberedningstid(double tilberedningstid) {
        this.tilberedningstid = tilberedningstid;
    }

    public String getIngredienser() {
        return ingredienser;
    }

    public void setIngredienser(String ingredienser) {
        this.ingredienser = ingredienser;
    }
// TODO Opskrift metoder
    public Opskrifter(String navn, String fremgangsmaade, int antalPortioner, double tilberedningstid, String ingredienser) {
        this.navn = navn;
        this.fremgangsmaade = fremgangsmaade;
        this.antalPortioner = antalPortioner;
        this.tilberedningstid = tilberedningstid;
        this.ingredienser = ingredienser;

        System.out.println("Opskrift er oprettet: " + navn);
    }
    public Opskrifter(String navn) {
        this.navn = navn;
        System.out.println("Opskrift er oprettet: " + navn);
    }

   public void addIngrediens(Ingrediens ingrediens) {

   }

   public void addIngrediens(String navn, int kalorier) {

   }
/* Ikke sikker:
   public void visIngredienser() {
       System.out.println("Du skal til " + navn + " bruge:");
       for (int i = 0; i < ingredienserTeOpskrift.size(); i++) {
           System.out.println(" - " + ingredienserTeOpskrift.get(i));
       }
   }
*/
    //TODO Fremgangsmaade og visOpskrift metoder: Vidste ikke hvordan jeg kunne adskille de to fremgangsmåder i én metode.
    public void visFremgangsmaadeGlasur(){
        System.out.println("Opskriften for " + navn + ":");
        System.out.println("- Du blander flormelis og sukker, og smører det på kagen.");
    }
    public void visFremgangsmaadeTe() {
        System.out.println("Opskriften for " + navn + ":");
        System.out.println("- Put teen i kogende vand, vent 2 minutter og server.");
    }
    public void visOpskriftGlasur(){
        ArrayList<String> ingredienserGlasurOpskrift = new ArrayList<>();
        ingredienserGlasurOpskrift.add("Flormelis");
        ingredienserGlasurOpskrift.add("Vand");
        System.out.println("Du skal til " + navn +" bruge:");
        for (int i = 0; i < ingredienserGlasurOpskrift.size(); i++) {
            System.out.println(" - " + ingredienserGlasurOpskrift.get(i));
        }
        blankLine();
        visFremgangsmaadeGlasur();
    }
    public void visOpskriftTe(){
        ArrayList<String> ingredienserTeOpskrift = new ArrayList<>();
        ingredienserTeOpskrift.add("Vand");
        ingredienserTeOpskrift.add("Tebrev");
        ingredienserTeOpskrift.add("Citron");
        ingredienserTeOpskrift.add("Sukker");
        System.out.println("Du skal til " + navn + " bruge:");
        for (int i = 0; i < ingredienserTeOpskrift.size(); i++) {
            System.out.println(" - " + ingredienserTeOpskrift.get(i));
        }
        blankLine();
        visFremgangsmaadeTe();
    }
    //TODO Kalorieberegner:
/*Ikke sikker på hvordan man beregner kalorier sammen
    Kalorierberegner kalorierberegner = new Kalorierberegner() {
        @Override
        public int kalorieriAlt() {
            for (int i = 0; i < ; i++) {

            }
            return kalorieriAlt();
        }
    };
 */
}
