package sample;

public class IngrediensNedarvingsDetaljer extends Ingrediens{
    //TODO Variabler
    int cVitamin;
    int magnesium;
    int kalk;

    //TODO Getter og setters
    public int getcVitamin() {
        return cVitamin;
    }

    public void setcVitamin(int cVitamin) {
        this.cVitamin = cVitamin;
    }

    public int getMagnesium() {
        return magnesium;
    }

    public void setMagnesium(int magnesium) {
        this.magnesium = magnesium;
    }

    public int getKalk() {
        return kalk;
    }

    public void setKalk(int kalk) {
        this.kalk = kalk;
    }

    //TODO IngrediensNedarvingsdetaljer metoder
    public IngrediensNedarvingsDetaljer(String navn, int kalorier, int cVitamin, int magnesium, int kalk) {
        super(navn, kalorier);
        this.cVitamin = cVitamin;
        this.magnesium = magnesium;
        this.kalk = kalk;

        System.out.println("Ingrediens er oprettet: " + navn);
    }

    public IngrediensNedarvingsDetaljer(String navn, int cVitamin, int magnesium, int kalk) {
        super(navn);
        this.cVitamin = cVitamin;
        this.magnesium = magnesium;
        this.kalk = kalk;

    }
    //TODO godModforkoelse metode
    public boolean godModForkoelse() {
        if (getcVitamin() > 5)
            System.out.println(getNavn() + " er god mod forkølelse.");
        else
            System.out.println(getNavn() + " er ikke god mod forkølelse.");
        return false;
    }

}
