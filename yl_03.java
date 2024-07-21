public class yl_03 {

	public static void main(String[] args) {
		//Loo järgmistest arvudest ühemõõtmeline massiiv
		int[] numbrid = {12,5,10,10,28,17,5,19,0,13,0,22,7,0,17,2,24,1,13,29,0,7,16,8,7,4,27,8,8,23,26,25,15,2,26,1};
		
		/*Koosta programm, mis (täislausega):
		  - väljastab esimese elemendi väärtuse
		  - väljastab viimase elemendi väärtuse
		  - leiab elementide arvu massiivis
		  - leiab elementide summa massiivis
		  - leiab arvude aritmeetilise keskmise*/
		System.out.println("Esimene number on: "+numbrid[0]+"."); //väljastab esimese elemendi väärtuse
		System.out.println("Viimane number on: "+numbrid[numbrid.length-1]+"."); //väljastab viimase elemendi väärtuse
		System.out.println("Massiivis on arve kokku: "+numbrid.length+" tk.");//leiab elementide arvu massiivis
		
		int sum = 0;
		for (int i = 0; i < numbrid.length; i++) {
			sum = sum + numbrid[i];
		}
		System.out.println("Elementide summa massiivis on: "+sum+"."); //leiab elementide summa massiivis
		System.out.println("Arvude aritmeetiline keskmine on: "+(double)sum / numbrid.length+".");//leiab arvude aritmeetilise keskmise
		
		//Loo mitmemõõtmeline massiiv. Tegemist on kuupäevade ja temperatuuridega. Sinu ülesandeks on väljastada ainult temperatuurid!
		int[][] arvud = {{1,23},{2,15},{3,29},{4,15},{5,26},{6,17},{7,26},{8,15},{9,28},{10,12},{11,24},{12,16},{13,21},{14,10},{15,10},{16,26},{17,27},{18,19},{19,14},{20,14},{21,14},{22,26},{23,20},{24,28},{25,29},{26,11},{27,28},{28,19},{29,25},{30,12}};
		
		for (int i = 0; i < arvud.length; i++) { 
				System.out.println(arvud[i][1]); //väljastame ainult temperatuurid
		}
	}

}
