package java1;

import java.util.Scanner;

public class SpaziGresku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Uoèiti grešku u kodu ne prebacujuæi u Eclipse */
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesi polupreènik: ");

		double r = sc.nextDouble();
		double površinaKruga = r * r * 3.14;

		if (r > 0) {
			System.out.println("Površina kruga je: " + površinaKruga);
		}

		else {
			System.out.println("Greška u unosu!");
		}
		sc.close();
	}
}
//16.8 