package java1;

import java.util.Scanner;

public class SamoPozitivno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * While1:Napisati program koji unosi i sabira brojeve dokle god nije unesen
		 * negativan broj, i ispisuje njihov zbir (zbir pozitivnih brojeva).
		 */
		Scanner sken = new Scanner(System.in);
		int i = 0;
		int zbir = 0;

		i = sken.nextInt();

		while (i >= 0) {
			zbir = zbir + i;
			i = sken.nextInt();
		}
		System.out.println("Zbir brojeva je: " + zbir);
		sken.close();
	}

}
// 16.8.