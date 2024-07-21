package lisaylesanded;

// Loo programm, mis genereerib suvalise Eesti autode numbrimärgi.
// Näide: 123ABC

import java.util.Random;

public class yl14 {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100, 999);
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder letters = new StringBuilder();

        while (letters.length() < 3) {
            int index = random.nextInt(0, characters.length());
            letters.append(characters.charAt(index));
        }

        System.out.println(String.valueOf(number) + letters);

    }
}
