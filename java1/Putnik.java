package java1;

public class Putnik extends Covek {
	private int novac;

	public Putnik(String ime, String prezime, int novac) {
		super(ime, prezime);
		this.novac = novac;

	}

	public int getNovac() {
		return novac;
	}

	public void setNovac(int novac) {
		this.novac = novac;
	}

	public void dodavanjeNovca(int novac) {
		this.novac += novac;
	}

	public void oduzimanjeNovca(int novac) {
		this.novac -= novac;
	}

	@Override
	public String toString() {
		return "Putnik: " + super.getIme() + " " + super.getPrezime() + " " + novac + "din.";

	}
} //9.9.

