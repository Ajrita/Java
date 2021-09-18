package java1;

import java.util.Scanner;

public class Kviz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napisati program koji oponasa kviz za pogadjanje glavnog grada. Program treba
		 * da ispisuje 3 opcije za izbor drzave + 1 opciju kao izlaz z programa. 1.
		 * Francuska 2. Italija 3. Srbija 4. Izlaz- Nakon odabira drzave, potrebno je
		 * postaviti pitanje 'Koji je glavni grad drzave xxxxxxx ?' Ako korisnik
		 * odgovori tacno, ispisuje se poruka 'Odgovor je tacan' Ako korisnik odgovori
		 * netacno, ispisuje se poruka 'Odgovor nije tacan'. Nakon davanja odgovora
		 * (bilo da je tacan ili netacan), ponovo treba da se postave sve pocetne opcije
		 * i ponudi korisniku da odabere neku od njih. Program se zavrsava kad korisni
		 * odabere 4. opciju 'Izlaz. Program uraditi koriscenjem dosad naucenog +
		 * do-while petlje
		 */
		Scanner sken = new Scanner(System.in);
		System.out.println("Kviz \"Pogodite glavni grad\"");

		String capital;
		int state;

		do {
			System.out.println("Izaberi opciju kliknuvši na broj ispred nje: ");
			System.out.println("1. Francuska");
			System.out.println("2. Italija");
			System.out.println("3. Srbija");
			System.out.println("4. Izlaz");

			state = sken.nextInt();

			if (state == 1) {
				System.out.println("Koji je glavni grad Francuske?");
				capital = sken.next();
				if (capital.equalsIgnoreCase("pariz")) {
					System.out.println("Odgovor je taèan.");

				} else {
					System.out.println("Odgovor nije taèan.");
				}
			} else if (state == 2) {
				System.out.println("Koji je glavni grad Italije?");
				capital = sken.next();
				if (capital.equalsIgnoreCase("rim")) {
					System.out.println("Odgovor je taèan.");
				} else {
					System.out.println("Odgovor nije taèan.");
				}
			} else if (state == 3) {
				System.out.println("Koji je glavni grad Srbije?");
				capital = sken.next();
				if (capital.equalsIgnoreCase("beograd")) {
					System.out.println("Odgovor je taèan.");
				} else {
					System.out.println("Odgovor nije taèan.");
				}

			}
		} while (state != 4);
		sken.close();
	}
} // 17.8.
