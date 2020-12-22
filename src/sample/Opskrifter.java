package sample;

public class Opskrifter {
    private String navn;
    private String fremgangsmaade;
    private int antalPortioner;
    private double tilberedningstid;
    private String ingredienser;

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

   public void addIngredients(Ingrediens ingrediens) {
   }
   public void addIngrediens(String navn, int kalorier) {
   }
}
