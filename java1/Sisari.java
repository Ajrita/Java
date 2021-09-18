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

public class Sisari extends Zivotinje {
	private String bojaDlake;
	private String nacinIshrane;
	private String covekovaPodela;

	public Sisari(String naziv, String hrana, String vrsta, String bojaDlake, String nacinIshrane,
			String covekovaPodela) {
		super(naziv, hrana, vrsta);
		this.bojaDlake = bojaDlake;
		this.nacinIshrane = nacinIshrane;
		this.covekovaPodela = covekovaPodela;
	}

	public String getBojaDlake() {
		return bojaDlake;
	}

	public void setBojaDlake(String bojaDlake) {
		this.bojaDlake = bojaDlake;
	}

	public String getNacinIshrane() {
		return nacinIshrane;
	}

	public void setNacinIshrane(String nacinIshrane) {
		this.nacinIshrane = nacinIshrane;
	}

	public String getCovekovaPodela() {
		return covekovaPodela;
	}

	public void setCovekovaPodela(String covekovaPodela) {
		this.covekovaPodela = covekovaPodela;
	}

	@Override
	public String toString() {

		return "Boja dlake: " + bojaDlake + " " + "Naèin ishrane: " + nacinIshrane + " " + "Èovekova podela: "
				+ covekovaPodela;
	}

}
