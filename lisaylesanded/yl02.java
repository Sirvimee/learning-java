package lisaylesanded;

// Genereeri suvaline täisarv 1-6

import java.util.Random;

public class yl02 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(6) + 1);
    }
}
