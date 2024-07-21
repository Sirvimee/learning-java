package lisaylesanded;

// Prindi arvud 1-66, mis jagunevad 3.
//Näiteks: 3, 6, 9, 12 jne

import java.util.ArrayList;

public class yl11 {

    public static void main(String[] args) {

        areDivisibleByThree("1-66");

    }

    public static void areDivisibleByThree(String numbers) {
        String[] allNumbers = numbers.split("-");
        int firstNumber = Integer.parseInt(allNumbers[0]);
        int lastNumber = Integer.parseInt(allNumbers[1]);

        ArrayList<Integer> resultNumbers = new ArrayList<>();

        for (int i = firstNumber; i < lastNumber ; i++) {
            if (i % 3 == 0) {
                resultNumbers.add(i);
            }
        }

        System.out.println(resultNumbers.toString().replaceAll("[\\[\\]]", ""));
    }
}
