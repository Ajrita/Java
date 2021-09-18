package java1;

public class GlavnaKlasa {
	/*
	 * Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja objekta.
	 * Svi podaci mogu da se dohvate, ali ne i postave.
	 * 
	 * Vozac je covek koji poseduje i zvanje (zanimanje -> sofer). Putnik je covek
	 * koji poseduje novac. Inicijalno poseduje odredjenu kolicinu novca koja mu se
	 * zadaje prilikom kreiranja. Odredjena svota novca moze da mu se doda i/ili
	 * oduzme.Autobus poseduje naziv, vozaca, cenu karte i putnika koji se njime
	 * voze. Naziv i cena karte i zadaju se prilikom kreiranja. Moguce je
	 * dodati/ukloniti putnika kao i vozaca.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vozac v1 = new Vozac("Margareta", "Pašteta,", " šoferka");

		Vozac v2 = new Vozac("Kanoli", "Sicilijani", "šofer");

		Putnik p1 = new Putnik("Krempita", "Šampita", 3000);

		Putnik p2 = new Putnik("Tulumba", "Šamrolna", 4000);
		Putnik p3 = new Putnik("Doboš", "Torta", 2500);

		Autobus a1 = new Autobus("Feniks", 2500);
		a1.dodatiVozac(v1);
		a1.dodatiPutnika(p3);
		a1.dodatiPutnika(p2);
		a1.dodatiPutnika(p1);
		System.out.println(a1);
		p1.dodavanjeNovca(1300);
		System.out.println(p1);
		p2.oduzimanjeNovca(1200);
		System.out.println(p2);
		a1.dodatiVozac(v2);
		a1.oduzetiPutnika(p3);
		System.out.println(a1);
		a1.oduzetiVozac(v1);
		System.out.println(a1);

	}

} //9.9.
