package java1;

import java.util.Scanner;

public class SpaziGresku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Uo�iti gre�ku u kodu ne prebacuju�i u Eclipse */
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesi polupre�nik: ");

		double r = sc.nextDouble();
		double povr�inaKruga = r * r * 3.14;

		if (r > 0) {
			System.out.println("Povr�ina kruga je: " + povr�inaKruga);
		}

		else {
			System.out.println("Gre�ka u unosu!");
		}
		sc.close();
	}
}
//16.8 