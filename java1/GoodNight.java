package java1;

import java.util.Scanner;

public class GoodNight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napisati program koji ce na standardnom izlazu ispisati poruku “Laku noc!”
		 * onoliko puta koliko je korisnik zadao preko konzole. Primer: ako korisnik
		 * unese broj 20, poruku Laku noc! treba ispisati 20 puta
		 */
		Scanner sken = new Scanner(System.in);
		System.out.println("Koliko puta želite laku noæ?");
		int spavaj = sken.nextInt();
		int brojac = 0;
		while (spavaj > brojac) {
			System.out.println("Laku noæ!");
			brojac++;
		}

		sken.close();
	}

} // 16.8.
/*
 * Scanner sken = new Scanner(System.in);
 * System.out.println("Unesite koliko puta želite \'laku noæ\' "); int ln =
 * sken.nextInt(); for (int i = 0; i < ln; i++)
 * {System.out.println("Laku noæ!");
 */