package lisaylesanded;

// Koosta programm, mis joonistab tsüklite abil samasuguse kolmnurga
// *
// ***
// *****
// ***
// *

public class yl12 {

    public static void main(String[] args) {
        int n = 3; // Keskmine rida

        // Ülemine osa
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Alumine osa
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
