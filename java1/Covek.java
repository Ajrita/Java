package java1;

/*    Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja objekta. Svi podaci mogu da se dohvate, ali ne i postave.

Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. 
Odredjena svota novca moze da mu se doda i/ili oduzme.Autobus poseduje naziv, vozaca, cenu karte i putnika koji se njime voze. 
Naziv i cena karte i zadaju se prilikom kreiranja. 
Moguce je dodati/ukloniti putnika kao i vozaca.Otezana verzija za vezbu:Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja objekta.
 Svi podaci mogu da se dohvate, ali ne i postave.Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
Putnik je covek koji poseduje novac.
 Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. 
 Odredjena svota novca moze da mu se doda i/ili oduzme, gde je potrebno vratiti indikator uspesnosti.
 Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se njime voze. Naziv i cena karte i zadaju se prilikom kreiranja.
  Moguce je dodati/ukloniti putnika kao i vozaca. Moguce je naplatiti kartu putnicima samo ako je vozac prisutan.*/

public class Covek {
	private String ime;
	private String prezime;

	public Covek(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	@Override
	public String toString() {
		return "Ime: " + ime + "Prezime: " + prezime;

	}
} //9.9.
