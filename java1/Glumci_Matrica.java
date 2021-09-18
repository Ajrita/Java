package java1;

import java.util.ArrayList;

public class Glumci_Matrica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		Glumci_Class actor = new Glumci_Class();

		actor.ime = "Johnny";
		actor.prezime = "Depp";
		actor.pol = "M";
		actor.rodjendan = 1963;
		actor.setStatus(false);
		actor.setProsecnaZarada(45.000);
		actor.setBrojSnimljenih(94);
		actor.stampanje();

		ArrayList<String> Movies = new ArrayList<String>();
		Movies.add("Minamata (7.8)");
		Movies.add("Waiting for the Barbarians (5.9)");
		Movies.add("City of Lies (6.5)");
		Movies.add("Fantastic Beasts: The Crimes of Grindelwald (6.5)");
		Movies.add("The Professor (6.7)");

		Object alt = Movies.get(0);
		Movies.set(0, Movies.get(0));
		Movies.set(0, (String) alt);
		alt = Movies.get(1);
		Movies.set(1, Movies.get(4));
		Movies.set(4, (String) alt);
		alt = Movies.get(2);
		Movies.set(2, Movies.get(3));
		Movies.set(3, (String) alt);
		alt = Movies.get(3);
		Movies.set(3, Movies.get(2));
		Movies.set(2, (String) alt);

		for (int i = 0; i < Movies.size(); i++) {

			System.out.println(Movies.get(i));

		}
	}

} // 3.9.
