package yl_06;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/*Loo uus klassi fail ja lisa kõige ette oma nimega kommentaar
 * Loo alamprogramm, mis lubab kasutajal lisada erinevaid täisarve kuni ta soovib (kui kasutaja jätab sisestuse tühjaks, siis tsükkel katkestatakse).
 * Lisatud täisarvud lisatakse loendisse, leitakse kogu summa ja keskmine (kasuta alamprogramme)
 * Kõik arvud, summa ja keskmine salvestatakse tekstifaili*/

public class yl_06 {
	public static void main(String[] args) {
	 
	    Scanner s = new Scanner(System.in);

        System.out.println("enter number of elements");
        int n=s.nextInt();

        int arr[]=new int[n];

        System.out.println("enter elements");

        for(int i=0;i<n;i++){//for reading array
            arr[i]=s.nextInt();

        }

        for(int i: arr){ //for printing array

            System.out.println(i);

        }
	}
}