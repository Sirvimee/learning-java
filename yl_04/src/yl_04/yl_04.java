package yl_04;
import java.util.Scanner;
import java.util.*;

public class yl_04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in); {
		System.out.print("Sisesta lause: "); //Luba kasutajal sisestada suvalist teksti
		String lause = scanner.nextLine();
		System.out.println(lause.toUpperCase());//Muuda kasutaja tekst suurtähtedeks ja väljasta kogu lause
		System.out.println("Lauses on "+lause.length()+" tähemärki koos tühikutega.");//Väljasta kasutaja teksti märkide arv
		
		//Väljasta kasutaja tekstide sõnade arv
		StringTokenizer st = new StringTokenizer(lause);
		System.out.println("Lauses on "+st.countTokens()+" sõna.");
		
		//Väljasta kasutaja sisestatud lause esimene sõna ja kasuta teksti vormindamist ‘%s’
		String[] tykeldus = lause.split(" ");
		String esimene = tykeldus[0];
		System.out.printf("Lause esimene sõna on: %s.", esimene);
		
		}

	}

}
