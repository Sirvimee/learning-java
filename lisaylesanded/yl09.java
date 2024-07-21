package lisaylesanded;

// Kirjuta programm, mis väljastab arvud 1-66 reana.
// Näiteks: 1234567891011121314 jne

public class yl09 {

    public static void main(String[] args) {
        numbersInRow("1-66");

    }

    public static void numbersInRow(String numbers) {
        String[] allNumbers = numbers.split("-");
        int firstNumber = Integer.parseInt(allNumbers[0]);
        int lastNumber = Integer.parseInt(allNumbers[1]);

        for (int i = firstNumber; i <= lastNumber ; i++) {
            System.out.print(i);
        }
    }
}
