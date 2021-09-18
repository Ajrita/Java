package java1;



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

public class Ribe extends Zivotinje {
	private String vodenoOkruženje;
	private int brojPeraja;
	private String vrstaPeraja;

	public Ribe(String naziv, String hrana, String vrsta, String vodenoOkruženje, int brojPeraja, String vrstaPeraja) {
		super(naziv, hrana, vrsta);
		this.vodenoOkruženje = vodenoOkruženje;
		this.brojPeraja = brojPeraja;
		this.vrstaPeraja = vrstaPeraja;
	}

	public String getVodenoOkruženje() {
		return vodenoOkruženje;
	}

	public void setVodenoOkruženje(String vodenoOkruženje) {
		this.vodenoOkruženje = vodenoOkruženje;
	}

	public int getBrojPeraja() {
		return brojPeraja;
	}

	public void setBrojPeraja(int brojPeraja) {
		this.brojPeraja = brojPeraja;
	}

	public String getVrstaPeraja() {
		return vrstaPeraja;
	}

	public void setVrstaPeraja(String vrstaPeraja) {
		this.vrstaPeraja = vrstaPeraja;
	}

	@Override
	public String toString() {
		return "Živi u: " + vodenoOkruženje + " Ima " + brojPeraja + " " + vrstaPeraja + " peraja";

	}

}
