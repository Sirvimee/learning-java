package yl_10;

public class Lind extends Loom {

    private String nimi;

    public Lind(String nimi) {
        this.nimi = nimi;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public void laula() {
        System.out.println("Tsirtsirr tsirtsirr...");
    }

    @Override
    public void toit() {
        System.out.println("Söön nii taimetoitu kuid osad meist on ka röövtoidulised.");
    }

}
