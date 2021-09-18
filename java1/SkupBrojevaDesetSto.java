package java1;

import java.util.Scanner;

public class SkupBrojevaDesetSto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napisati program gde preko skenera unesete broj, ako je broj manji od 10 onda
		 * ga pomnoziti sa 100, ako je broj veci od 100 onda ga podeliti sa 10. Na kraju
		 * zakomentarisite koje brojeve ste koristili za proveru programa.
		 */

		Scanner sken = new Scanner(System.in);
		System.out.println("Unesi broj : ");
		int broj = sken.nextInt();

		if (broj < 10) {
			int proizvod = broj * 100;
			System.out.println("Broj pomnožen sa sto : " + proizvod);
		} else if (broj > 100) {
			double kolicnik = (double) broj / 10;
			System.out.println("Broj podeljen sa deset : " + kolicnik);
		} else {
			System.out.println("Broj nije pokriven zadatakom.");
		}
		sken.close();
	}
}
/* Za proveru programa sam koristila brojeve: 0, -2, 7.8, 50, 10, 100, 123 */
//13.8.
