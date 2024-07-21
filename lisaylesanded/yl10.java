package lisaylesanded;

// Kirjuta programm, mis väljastab arvud 1-66 viie kaupa reas.
// Näiteks:
// 12345
// 678910
// 1112131415
// jne

public class yl10 {

    public static void main(String[] args) {
        numbersInRow("1-66");

    }

    public static void numbersInRow(String numbers) {
        String[] allNumbers = numbers.split("-");
        int firstNumber = Integer.parseInt(allNumbers[0]);
        int lastNumber = Integer.parseInt(allNumbers[1]);

        int i = firstNumber;

        while (i <= lastNumber) {
            for (int j = 0; j < 5; j++) {
                if (i < lastNumber) {
                    System.out.print(i);
                    i++;
                } else if (i == lastNumber) {
                    System.out.println(i);
                    i++;
                    break;
                }
            }
            System.out.println();
        }
    }
}
