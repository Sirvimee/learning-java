package lisaylesanded;

// Koosta programm, mis koostab vastavalt kasutaja sisestatud täisarvule tärnidega kolmnurga suuruse.

import java.util.Scanner;

public class yl13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta kolmnurga suurus täisarvuna:");

        while (true) {
            try {
                int triangleSize = scanner.nextInt();
                triangle(triangleSize);
                break;
            } catch (Exception e) {
                System.out.println("Sisestada tuleb täisarv.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    public static void triangle(int size) {
        for (int i = 0; i < size + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
