package lisaylesanded;

// Kirjuta programm, mis leiab etteantud arvude summa ja keskmise
// Näiteks: 3,5,3,12,5 –>Summa: 28 Keskmine: 5.6

import java.util.ArrayList;
import java.util.Arrays;

public class yl16 {
    public static void main(String[] args) {
        String numbers = "3,5,3,12,5";
        String[] digits = numbers.split(",");
        System.out.println("Summa: " + sumOfNumbers(digits) + " Keskmine: " + average(digits));
    }

    private static int sumOfNumbers(String[] digits) {
        int[] ints = Arrays.stream(digits).mapToInt(Integer::parseInt).toArray();
        int sumOfnumbers = 0;

        for (int anInt : ints) {
            sumOfnumbers += anInt;
        }

        return sumOfnumbers;
    }

    private static float average(String[] digits) {
        return (float) sumOfNumbers(digits) / digits.length;
    }


}
