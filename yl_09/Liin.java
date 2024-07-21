package yl_09;

public class Liin {

    private String lahteKoht;
    private String sihtKoht;
    private int liiniNumber;

    public Liin(String lahteKoht, String sihtKoht, int liiniNumber) {
        this.lahteKoht = lahteKoht;
        this.sihtKoht = sihtKoht;
        this.liiniNumber = liiniNumber;
    }

    public String getLahteKoht() {
        return lahteKoht;
    }

    public void setLahteKoht(String lahteKoht) {
        this.lahteKoht = lahteKoht;
    }

    public String getSihtKoht() {
        return sihtKoht;
    }

    public void setSihtKoht(String sihtKoht) {
        this.sihtKoht = sihtKoht;
    }

    public int getLiiniNumber() {
        return liiniNumber;
    }

    public void setLiiniNumber(int liiniNumber) {
        this.liiniNumber = liiniNumber;
    }
}
