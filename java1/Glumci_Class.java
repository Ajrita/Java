package java1;

public class Glumci_Class {
	/*
	 * Napraviti klasu Glumci koja ce imati public atribute: Ime i prezime, godina
	 * rodjenja, pol. Private atributi su: da li su ozenjeni ili udati (boolean),
	 * prosecna zarada po filmu, broj snimljenih filmova. Potrebno je izracunati i
	 * odstampati sve atribute, koliko su ukupno zaradili u svim filmovima, koliko
	 * godina pune u 2022. godini, ako su muskog pola preko atributa treba pre imena
	 * da se doda "Mr." ili "Mrs." ako su zenskog pola. Nakon toga napraviti Array
	 * listu gde ce se ubaciti poslednjih 5 snimljenih filmova (pored naslova
	 * napisati ocenu sa imdb-a) i odstampati od najbolje ocenjenog do najgore
	 * ocenjenog filma od tih pet (preko getera i setera).
	 */

	public String ime;
	public String prezime;
	public int rodjendan;
	public String pol;
	private boolean status;
	private double prosecnaZarada;
	private int brojSnimljenih;
	public double ukupnaZarada;

	public Glumci_Class() {

	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public double getProsecnaZarada() {
		return prosecnaZarada;
	}

	public void setProsecnaZarada(double prosecnaZarada) {
		this.prosecnaZarada = prosecnaZarada;
	}

	public int getBrojSnimljenih() {
		return brojSnimljenih;
	}

	public void setBrojSnimljenih(int brojSnimljenih) {
		this.brojSnimljenih = brojSnimljenih;
	}

	public double ukupnaZarada() {

		double ukupnaZarada = this.prosecnaZarada * this.brojSnimljenih;
		return ukupnaZarada;
	}

	public int sledeceGodine() {

		int sledeceGodine = 2022 - this.rodjendan;
		return sledeceGodine;

	}

	public void stampanje() {

		if (pol.equals("M")) {

			System.out.println("Name: Mr. " + ime + "\n" + "Last name: " + prezime + "\n" + "Gender: " + pol + "\n"
					+ "Married: " + status + "\n" + "Average salary: " + prosecnaZarada + "$" + "\n"
					+ "Number of movies filmed: " + brojSnimljenih + "\n" + "Estimated worth: " + ukupnaZarada() + "$"
					+ "\n" + "Age next year: " + sledeceGodine() + "\n" + "Last five movies: ");

		} else {

			System.out.println("Name: Mrs. " + ime + "\n" + "Last name: " + prezime + "\n" + "Gender: " + pol + "\n"
					+ "Married: " + status + "\n" + "Average salary: " + prosecnaZarada + "$" + "\n"
					+ "Number of movies filmed: " + brojSnimljenih + "\n" + "Estimated worth: " + ukupnaZarada() + "$"
					+ "\n" + "Age next year: " + sledeceGodine() + "\n" + "Last five movies: ");

		}

	}

} //3.9.
