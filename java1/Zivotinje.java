package java1;

public class Zivotinje {
	/*
	 * Zooloski vrtU zoovrtu obitavaju razne zivotinje. Sve imaju svoju vrstu
	 * (kicmenjaci, beskicmenjaci), konkretan naziv i cime se hrane.Ribe su
	 * kicmenjaci koje karakterise mesto obitavanja (slatka, slana voda), broj
	 * peraja, vrsta peraja Sisari su kicmenjaci koje se razlikuju po boji dlake,
	 * nacinu ishrane (biljojedi, mesojedi, svastojedi), i covekovoj podeli na
	 * divlje i domace.Napraviti klasu Staniste u kom se nalazi lista zivotinja koje
	 * u tom stanistu zive. Staniste takodje ima naziv koji moze da se dohvati ali
	 * ne i postavi.Ispisati bar jednog sisara i jednu ribu kao vrstu zivotinje.
	 * Ispisati bar jedno staniste. //Jednom sisaru zameniti ulogu koju mu je covek
	 * dodelio.
	 */
	private String naziv;
	private String hrana;
	private String vrsta;

	public Zivotinje(String naziv, String hrana, String vrsta) {
		super();
		this.naziv = naziv;
		this.hrana = hrana;
		this.vrsta = vrsta;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getHrana() {
		return hrana;
	}

	public void setHrana(String hrana) {
		this.hrana = hrana;
	}

	public String getVrsta() {
		return vrsta;
	}

	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}

	@Override
	public String toString() {
		return "Vrsta: " + vrsta + "Naziv: " + naziv + "Ishrana: " + hrana;
	}
}