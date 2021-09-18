package java1;

import java.util.Scanner;

public class XYZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napisati program gde korisnik unosi pozitivne brojeve, kad unese negativan
		 * broj prikaze mu se suma svih prethodno unetih brojeva i na kraju
		 * zakomentarisati koje ste brojeve sve unosili po testu na primer: test 1 x, y,
		 * z test 2 x, y, z test 3 x, y, z
		 */
		Scanner sken = new Scanner(System.in);
		int n = 0;
		int zbir = 0;

		do {
			zbir += n;
			System.out.println("Unesi broj:");
			n = sken.nextInt();
		} while (n >= 0);
		System.out.println("Zbir je: " + zbir);
		sken.close();
		// x = 3, y = -3, rezultat: 3; x = 5, y = 0; z = 5; q = -10, rezultat: 10; x =
		// 0, y = 1, z = -1, rezultat: 1

	}
} // 19.8.