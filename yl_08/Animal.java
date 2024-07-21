package yl_08;

public class Animal {

    public String color;
    public String sex;
    public Boolean mammal;

    public Animal(String color, String sex, Boolean mammal) {
        this.color = color;
        this.sex = sex;
        this.mammal = mammal;
    }

    public void varv() {
        System.out.println("Ma olen " + color + ".");
    }

    public void makeNoise(String noise) {
        System.out.println(noise + " " + noise);
    }

    public void areYouMammal() {
        if (mammal) {
            System.out.println("Ma olen imetaja.");
        } else {
            System.out.println("Ma ei ole imetaja.");
        }

    }
}
