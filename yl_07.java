import java.util.Scanner;

public class yl_07 {

/* Loo lihtne alamprogramm, mis küsib kasutajalt kahte arvu ning üritad teha mingit aritmeetilist tehet.
Programm töötab kuni kasutaja on lisanud kenasti arvud. Kui kasutaja lisab arvude asemel kogemata teksti,
siis annad sellest viisakalt teada ja töötad edasi (tsükkel). Kasuta vea tuvastamiseks erindeid.
*/

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while (true) {

            System.out.print("Sisesta kaks numbrit: ");

            try {
                int a = s.nextInt();
                int b = s.nextInt();
                System.out.println("Nende arvude korrutis on: " + a * b);
                break;
            } catch (Exception e) {
                System.out.println("Sisestada võib ainult numbreid.");
                s.nextLine();
            }
        }

        s.close();

    }
}


