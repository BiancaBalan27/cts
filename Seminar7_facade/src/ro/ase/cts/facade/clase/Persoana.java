package ro.ase.cts.facade.clase;

public class Persoana {
	private String nume;
	private String CNP;
	
	public Persoana(String nume, String cNP) {
		super();
		this.nume = nume;
		CNP = cNP;
	}

	public String getNume() {
		return nume;
	}

	public String getCNP() {
		return CNP;
	}

}
