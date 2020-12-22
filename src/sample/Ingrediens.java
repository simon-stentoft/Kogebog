package sample;

public class Ingrediens {
    private String navn;
    private int kalorier;
    public int kalorieriAlt;

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getKalorier() {
        return kalorier;
    }

    public void setKalorier(int kalorier) {
        this.kalorier = kalorier;
    }

    public Ingrediens(String navn, int kalorier) {
        this.navn = navn;
        this.kalorier = kalorier;

        System.out.println("Ingrediens er oprettet: " + navn);
    }
    public Ingrediens(String navn) {
        this.navn = navn;
        System.out.println("Ingrediens er oprettet: " + navn);
    }
    public boolean rigPaaKalorier() {
        if (getKalorier() >= 100)
            System.out.println(navn + " er rig på kalorier");
        else
            System.out.println(navn + " er ikke rig på kalorier");
        return false;
    }
    Kalorierberegner kalorierberegner = new Kalorierberegner() {
        @Override
        public int kalorieriAlt() {
            return kalorieriAlt;
        }
    };

    public Diet diet;
}
