package ro.ase.cts.flyweight.clase;

public class Rezervare {
	private int numarMasa;
	private int nrPersoane;
	private int oraRezervare;
	public Rezervare(int numarMasa, int nrPersoane, int oraRezervare) {
		super();
		this.numarMasa = numarMasa;
		this.nrPersoane = nrPersoane;
		this.oraRezervare = oraRezervare;
	}
	@Override
	public String toString() {
		return "Rezervare [numarMasa=" + numarMasa + ", nrPersoane=" + nrPersoane + ", oraRezervare=" + oraRezervare
				+ "]";
	}
}
