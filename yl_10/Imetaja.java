package yl_10;

public class Imetaja extends Loom {

    private String nimi;

    public Imetaja(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void haugu() {
        System.out.println("Auh auh auh...");
    }
}
