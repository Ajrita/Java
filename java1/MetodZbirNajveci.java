package java1;

import java.util.Scanner;

public class MetodZbirNajveci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napisati program koji ce procitati 3 cela broja sa standardnog ulaza i poziva
		 * i ispisuje dve metode. Prva ispisuje zbir tri unesena broja, a druga vraca
		 * najveci od unetih brojeva.
		 */

		Scanner sken = new Scanner(System.in);

		int brojX = 0;
		System.out.print("Unesite prvi broj: ");
		brojX = sken.nextInt();
		int brojY = 0;
		System.out.print("Unesite drugi broj: ");
		brojY = sken.nextInt();
		int brojZ = 0;
		System.out.print("Unesite treæi broj: ");
		brojZ = sken.nextInt();
		int najveci = najveci(brojX, brojY, brojZ);
		System.out.println("Najveæi broj je: " + najveci);
		int broj = zbir(brojX, brojY, brojZ);
		System.out.println("Zbir je: " + broj);

	}

	public static int najveci(int x, int y, int z) {
		if (x < y) {
			if (y < z) {
				return z;
			} else
				return y;

		} else if (x > z) {
			return x;

		}

		else {
			return z;

		}

	}

	public static int zbir(int x, int y, int z) {

		return x + y + z;

	}

} //23.8.
