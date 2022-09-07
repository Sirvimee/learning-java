package yl_05;
import java.util.Scanner;

public class yl_05 {

	public static void main(String[] args) {
		//Teavita koodi nii, et jagamistehet saab teha 3 korda (tsükkel)
		for (int i = 0; i < 3; i++) {
		
			// Loo meetod, mis lubab kasutajal sisestada kahte arvu ja teostada jagamistehet
			Scanner scanner = new Scanner (System.in); //kasutaja sisestus
		
			System.out.print("Sisesta jagatav: "); //esimene number
			int jagatav = scanner.nextInt();
		
			System.out.print("Sisesta jagaja: "); //teine number
			int jagaja = scanner.nextInt();
		
			/*lisa kontroll, mis kontrollib kas mõlemad arvud on positiivsed. 
			 * Kusjuures esimene arv võib olla ka null aga teine (jagaja) mitte
			 * teavita kasutajat, kui midagi on valesti*/
		
			if (jagatav >= 0 && jagaja > 0) {
				System.out.println(jagatav+" / "+jagaja+" = "+jagatav/jagaja);
			} else if(jagatav < 0 || jagaja < 0) {
				System.out.println("Sisestavad numbrid peavad olema positiivsed.");
			} else {
				System.out.println("Jagaja ei tohi olla 0");
			}
		}
	}
}
