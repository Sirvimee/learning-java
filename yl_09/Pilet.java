package yl_09;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pilet {

    private LocalDate ostuAeg;
    private Reisija reisija;
    private Liin liin;
    private Istekoht istekoht;

    public Pilet() {
        ostuAeg = LocalDate.now();
    }

    public LocalDate getOstuAeg() {
        return ostuAeg;
    }

    public void setOstuAeg(LocalDate ostuAeg) {
        this.ostuAeg = ostuAeg;
    }

    public Reisija getReisija() {
        return reisija;
    }

    public void setReisija(Reisija reisija) {
        this.reisija = reisija;
    }

    public Liin getLiin() {
        return liin;
    }

    public void setLiin(Liin liin) {
        this.liin = liin;
    }

    public Istekoht getIstekoht() {
        return istekoht;
    }

    public void setIstekoht(Istekoht istekoht) {
        this.istekoht = istekoht;
    }
}
