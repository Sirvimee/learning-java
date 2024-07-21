package lisaylesanded;

// Küsi kasutajalt kahte arvu ning väljasta liitmise vastus

import java.util.Scanner;

public class yl01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Sisesta kaks täisarvu: ");

            try {
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println("Nende arvude summa on: " + (a + b));
                break;
            } catch (Exception e) {
                System.out.println("Sisestada võib ainult täisarve.");
                scanner.nextLine();
            }

        }

        scanner.close();
    }

}
