package yl_10;

public class App {

    public static void main(String[] args) {

        Imetaja koer = new Imetaja("Pauka");

        koer.setSugu("M");
        System.out.println("Sugu: " + koer.sugu);
        koer.toit();
        koer.temp();

        System.out.println("Nimi: " + koer.getNimi());
        koer.haugu();

        System.out.println("......................");

        Lind varblane = new Lind("Linnuke");

        varblane.setSugu("N");
        System.out.println("Sugu: " + varblane.getSugu());
        varblane.toit();
        varblane.temp();

        System.out.println("Nimi: " + varblane.getNimi());
        varblane.laula();

    }
}
