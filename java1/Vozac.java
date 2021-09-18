package java1;

public class Vozac extends Covek {
	private String zanimanje;

	public Vozac(String ime, String prezime, String zanimanje) {
		super(ime, prezime);
		this.zanimanje = zanimanje;
	}

	public String getZanimanje() {
		return zanimanje;
	}

	public void setZanimanje(String zanimanje) {
		this.zanimanje = zanimanje;
	}

	@Override
	public String toString() {
		return "Vozaè: " + super.getIme() + " " + super.getPrezime() + " " + zanimanje;

	}
} //9.9.

