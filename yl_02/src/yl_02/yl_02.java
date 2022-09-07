package yl_02;

public class yl_02 {

	public static void main(String[] args) {
		tollidMeetriteks(2);
		ellipsiPindala(2, 3);
		tunnidMinutiteks(20);

		String sportlane1 = new String();
		String sportlane2 = new String();
		
		sportlane1 = "Mati";
		sportlane2 = "Kalle";
		
		int kiirus1 = kiirus(10, 1); //esimese sportlase kiirus
		int kiirus2 = kiirus(10, 0.83); //teise sportlase kiirus
		int v = vahe(kiirus1, kiirus2);
		
		System.out.println(sportlane1+" kiirus oli "+kiirus1+" km/h.");
		System.out.println(sportlane2+" kiirus oli "+kiirus2+" km/h.");
		
		System.out.println("Nende kiiruste vahe on "+Math.abs(v)+" km/h.");

	}
	
	// Koosta alamprogramm (meetod), mis teisendab tollid meetriteks ja kuvab vastuse
	static void tollidMeetriteks(double t) {
		double meetrid = t * 0.0254;
		
		System.out.println(t+" tolli on "+meetrid+" meetrit.");
	}
	
	/* Koosta alamprogramm ellipsi pindala leidmiseks. 
	 * Ümarda vastus kaks komakohta ning PI leidmiseks kasuta Math klassi. 
	 * Väljasta täislause.
	 */
	static void ellipsiPindala(double a, double b){
		double pindala = Math.round(Math.PI * a * b*100.0)/100.0;
		
		System.out.println("Ellipsi pindala on "+pindala+".");
	}
	
	//Loo alamprogramm, mis teisendab etteantud minutid tundideks ja minutiteks.
	static void tunnidMinutiteks(int h) {
		int minutid = 60 * h;
		
		System.out.println(h+" tundi on "+minutid+" minutit.");
	}
	
	/*Koosta kaks alamprogrammi, kus esimene aitab leida kahe sportlase kiiruse (distants (km), aeg (h)) ning 
	 * teine väljastab nende kiiruste vahe. Kusjuures vahe leidmisel on vastus alati positiivne (abosoluutväärtus).
	 */
	static int kiirus(double dist, double aeg) {
		double value = dist / aeg; 
		int kiirus = (int)value; //ümardus täisarvuni
		return kiirus;
	}
	
	static int vahe(int valueA, int valueB) {
		int vahe = valueA - valueB;
		return vahe;
		
	}

}
