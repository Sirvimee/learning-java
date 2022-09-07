package yl_01;

/* - Koosta programm, mis väljastab sinu nime ja kursuse.
   - Lisa programmi täisarvuline muutuja oma vanuse jaoks, komaarv pikkuse jaoks meetrites ja muutuja hüüdnime jaoks. Moodusta nendest täislause ja väljasta lisaks eelmisele lausele.
   - Täienda iga loodud muutuja rida kommentaariga, et millega on tegemist.
   - Loo täisarvuline muutuja int minuArv ja ära anna talle mingit väärtust. Väljasta muutuja ja vaata mis on tulemus. */

public class yl_01 {

	public static void main(String[] args) {
		
		String nimi = new String();
		String kursus = new String();
		String hyydnimi = new String();
		int vanus = 45; //vanus täisarvudes
		double pikkus = 1.67; //pikkus komakohaga
		int minuArv; //ilma väärtuseta täisarv
		
		
		nimi = "Meeli Sirvi";
		kursus = "Java kursus";
		hyydnimi = "Mellu";
		
		System.out.println(nimi+ ", "+kursus+".");
		System.out.println("Ma olen "+vanus+" aastane ja "+pikkus+" cm pikk. Minu hüüdnimi on: "+hyydnimi+".");
		//System.out.println(minuArv); //annab vastuseks errori

	}

}
