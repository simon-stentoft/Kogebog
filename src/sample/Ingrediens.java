package sample;

public class Ingrediens {
    private String navn;
    private int kalorier;

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
}
