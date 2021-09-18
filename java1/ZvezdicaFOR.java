package java1;

import java.util.Scanner;

public class ZvezdicaFOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napisati program koji stampa sliku na ekranu za N redova. N unosi korisnik
		 * preko skenera. (Koristiti for petlju) Na primer N: 5
		 */
		Scanner sken = new Scanner(System.in);
		System.out.println("Unesite broj za velièinu slike ");
		int N = sken.nextInt();
		String s = "*";

		for (int i = 1; i <= N; i++) {
			System.out.println(s);
			s = s + "*";
		}

		sken.close();
	}

}
//19.8.