package java1;

import java.util.Scanner;

public class MetodNajmanji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Funkcije1: Napisati program koji ce procitati 3 cela broja sa standardnog
		 * ulaza (znaci da korisnik unosi tri broja) i taj program treba da pozove i
		 * ispise (u mainu) najmanji od ta tri unesena broja.
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
		int najmanji = najmanji(brojX, brojY, brojZ);
		System.out.println("Najmanji broj je: " + najmanji);
	}

	public static int najmanji(int x, int y, int z) {
		if (x > y) {
			if (y > z) {
				return z;
			} else
				return y;

		} else if (x < z) {
			return x;

		}

		else {
			return z;

		}
		
}

} //23.8.
