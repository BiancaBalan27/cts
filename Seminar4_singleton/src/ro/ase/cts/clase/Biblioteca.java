package ro.ase.cts.clase;

public class Biblioteca {
	private int numarCarti;
	private String nume;
	private boolean esteDeschisa;
	
	private static Biblioteca biblioteca = null;
	
	private Biblioteca(int numarCarti, String numeBiblioteca, boolean esteDeschisa) {
		super();
		this.numarCarti = numarCarti;
		this.nume = numeBiblioteca;
		this.esteDeschisa = esteDeschisa;
	}

	public void setNumarCarti(int numarCarti) {
		this.numarCarti = numarCarti;
	}

	public void setNumeBiblioteca(String numeBiblioteca) {
		this.nume = numeBiblioteca;
	}

	public void setEsteDeschisa(boolean esteDeschisa) {
		this.esteDeschisa = esteDeschisa;
	}

	@Override
	public String toString() {
		return "Biblioteca [numarCarti=" + numarCarti + ", nume=" + nume + ", esteDeschisa="
				+ esteDeschisa + "]";
	}
	
	public static synchronized Biblioteca getInstance(int numarCarti, String numeBiblioteca, boolean esteDeschisa) {
		if(biblioteca == null) {
			biblioteca = new Biblioteca(numarCarti, numeBiblioteca, esteDeschisa);
		}
		return biblioteca;
	}
	
}
