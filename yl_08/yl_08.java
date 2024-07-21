package yl_08;

/* Loo klass, mis jäljendab mingit eset, nähtust, elukat vms
Antud asja kirjelda vähemalt kolme omadusega ja kolme tegevusega (näiteks küsib mingit omadust, lubab lisada mingit omadust, teostab mingit arvutust jne)
Kasuta konstruktorit
Loo näitena kaks objekti */

public class yl_08 {

    public static void main(String[] args) {

        Animal dog = new Animal("valge", "isane", true);
        dog.varv();
        dog.areYouMammal();
        dog.makeNoise("Auh");

        System.out.println(" ");

        Animal frog = new Animal("roheline", "emane", false);
        frog.varv();
        frog.areYouMammal();
        frog.makeNoise("Krooks");
    }

}
