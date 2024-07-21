package yl_10;

public class Kala extends Loom {

    private String nimi;

    public Kala(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    @Override
    public void temp() {
        System.out.println("kõigusoojane");
    }

    @Override
    public void toit() {
        System.out.println("Toitun erinevat tüüpi toidust.");
    }

}
