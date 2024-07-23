package lisaylesanded;

// Kasutaja sisestab isikukoodi, mille põhjal ütleb programm tema soo ja täpse sünniaja.
// Vihjed: Esimene number näitab sugu. Paaris on naine ja paaritu on mees; 3 ja 4 hakkavad isikukoodid on enne 2000 aastat.
// Näiteks: 37807110001  –> mees, 11.07.1978

import java.util.Scanner;

public class yl15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sisesta isikukood: ");

        while (true) {
            String number = scanner.nextLine();

            if (number.length() != 11) {
                System.out.println("Numbreid võib olla täpselt 11.");
                continue;
            }

            try {
                Long.parseLong(number); // Kontrollib, kas sisestatud väärtus on number
                sexAndBirthday(number);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sisestada võib ainult numbreid.");
            }
        }
        scanner.close();
    }

    private static void sexAndBirthday(String number) {
        char[] numbers = number.toCharArray();
        int century = Character.getNumericValue(numbers[0]);
        String day = String.valueOf(numbers[5]) + numbers[6];
        String month = String.valueOf(numbers[3]) + numbers[4];
        int year = Character.getNumericValue(numbers[1]) * 10 + Character.getNumericValue(numbers[2]);
        String sex;

        if (century < 5) {
            year += 1900;
        } else {
            year += 2000;
        }

        if (century % 2 == 0) {
            sex = "naine";
        } else {
            sex = "mees";
        }

        System.out.printf("%s, %s.%s.%s", sex, day, month, year);
    }
}