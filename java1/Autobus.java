package java1;

import java.util.ArrayList;

public class Autobus {
	// Autobus poseduje naziv, vozaca, cenu karte i putnika koji se njime voze.
	// Naziv i cena karte i zadaju se prilikom kreiranja.
	private String naziv;
	private Vozac vozac;
	private int cenaKarte;
	private ArrayList<Putnik> listaPutnika;

	public Autobus(String naziv, int cenaKarte) {
		super();
		this.naziv = naziv;
		this.cenaKarte = cenaKarte;
		this.vozac = vozac;
		this.listaPutnika = new ArrayList<Putnik>();
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public void dodatiVozac(Vozac a) {
		this.vozac = a;
	}

	public void oduzetiVozac(Vozac a) {
		this.vozac = null;
	}

	public int getCenaKarte() {
		return cenaKarte;
	}

	public void setCenaKarte(int cenaKarte) {
		this.cenaKarte = cenaKarte;
	}

	public ArrayList<Putnik> getListaPutnika() {
		return listaPutnika;
	}

	public void setListaPutnika(ArrayList<Putnik> listaPutnika) {
		this.listaPutnika = listaPutnika;
	}

	public void dodatiPutnika(Putnik a) {
		this.listaPutnika.add(a);
	}

	public void oduzetiPutnika(Putnik a) {
		this.listaPutnika.remove(a);
	}

	@Override
	public String toString() {
		return "Autobus prevoznika: " + naziv + " " + "sa cenom karte " + cenaKarte + " din." + " i putnicima: "
				+ listaPutnika + vozac;

	}
} //9.9.
