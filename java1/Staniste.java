package java1;

import java.util.ArrayList;
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

public class Staniste {

	private String nazivStanista;
	private ArrayList<Zivotinje> lista = new ArrayList<>();

	public Staniste(String nazivStanista, ArrayList<Zivotinje> lista) {
		super();
		this.nazivStanista = nazivStanista;
		this.lista = lista;
	}

	public String getNazivStanista() {
		return nazivStanista;
	}

	public ArrayList<Zivotinje> getLista() {
		return lista;
	}

	public void setLista(Zivotinje zivotinja) {
		this.lista.add(zivotinja);
	}

	public void dodajZivotinju(Zivotinje zivotinja) {
		lista.add(zivotinja);
	}

	@Override
	public String toString() {

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista);
		}
		return "Naziv staništa: " + nazivStanista + " i listom stanovnika: " + lista;

	}
}
