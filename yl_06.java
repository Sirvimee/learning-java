import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class yl_06 {

    /* Loo alamprogramm, mis lubab kasutajal lisada erinevaid täisarve kuni ta soovib (kui kasutaja jätab sisestuse tühjaks, siis tsükkel katkestatakse).
  Lisatud täisarvud lisatakse loendisse, leitakse kogu summa ja keskmine (kasuta alamprogramme)
  Kõik arvud, summa ja keskmine salvestatakse tekstifaili */

	public static void main(String[] args) {
	 
	    Scanner s = new Scanner(System.in);

        System.out.println("Enter an integer or press enter to finish:");

        ArrayList<Integer> numbers = new ArrayList<>();

        while (true) {
            String input = s.nextLine();
            if (input.isEmpty()) {
                break;
            }

            int number = Integer.parseInt(input);
            numbers.add(number);
        }

        s.close();

        try {
            FileWriter w = new FileWriter("numbers.txt");
            w.write("Numbers are: " + numbers.toString() + "\n" +
                    "The sum of the numbers is: " + sum(numbers) + "\n" +
                    "The average of the numbers is: " + average(numbers));

            w.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public static int sum(ArrayList<Integer> numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }

        return sum;
    }

    public static double average(ArrayList<Integer> numbers) {
        return (double) sum(numbers) / numbers.size();
    }
}
