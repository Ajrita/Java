package java1;

import java.util.Scanner;

public class ImeMedalje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Napisati program gde deklarisete vase ime, prezime kao string, pol kao char i
		 * odstampajte adekvatno sva tri unosa. Nakon toga preko skenera treba da
		 * unesete ukupan broj medalja koliko je Srbija osvojila na olimpijskim igrama i
		 * ukupan broj zlatnih medalja koliko je Srbija osvojila na olimpijskim igrama,
		 * na kraju treba odstampati procenat zlatnih medalja u odnosu na ukupan broj
		 * medalja.
		 */

		String ime = "Jelena";
		String prezime = "Gvozden";
		char pol = 'f';
		System.out.println(ime + " " + prezime + " " + pol);

		Scanner sken = new Scanner(System.in);
		System.out.println("Unesite broj ukupno osvojenih medalja RS na OI: ");
		int ukupneMedalje = sken.nextInt();
		System.out.println("Unesite broj osvojenih zlatnih medalja RS na OI: ");
		int zlatneMedalje = sken.nextInt();
		double procenat = ((double) zlatneMedalje / ukupneMedalje) * 100;
		System.out.println("Procenat zlatnih medalja u odnosu na ukupan broj osvojenih medalja je " + procenat + "%");
		sken.close();
	}

}
//12.8.