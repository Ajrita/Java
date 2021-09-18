package java1;

import java.util.Scanner;

public class MetodProizvod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Funkcije2: Napisati program koji ce procitati 3 cela broja sa standardnog
		 * ulaza i taj program treba da pozove i vrati (u mainu) proizvod unetih
		 * brojeva.
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
		int broj = proizvod(brojX, brojY, brojZ);

		System.out.println("Proizvod je: " + broj);
	}

	public static int proizvod(int x, int y, int z) {

		return x * y * z;

	}

} //23.8.
