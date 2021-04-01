package ro.ase.cts.builder.clase;

public class Rezervare {
	private int codRezervare;
	private boolean areMancare;
	private boolean areScaunErgonomic;
	private boolean areBautura;
	private boolean areMuzica;
	private String genMuzica;
	
	public Rezervare(int codRezervare, boolean areMancare, boolean areScaunErgonomic, boolean areBautura,
			boolean areMuzica, String genMuzica) {
		super();
		this.codRezervare = codRezervare;
		this.areMancare = areMancare;
		this.areScaunErgonomic = areScaunErgonomic;
		this.areBautura = areBautura;
		this.areMuzica = areMuzica;
		this.genMuzica = genMuzica;
	}

	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}

	public void setAreMancare(boolean areMancare) {
		this.areMancare = areMancare;
	}

	public void setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
	}

	public void setAreBautura(boolean areBautura) {
		this.areBautura = areBautura;
	}

	public void setAreMuzica(boolean areMuzica) {
		this.areMuzica = areMuzica;
	}

	public void setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
	}

	@Override
	public String toString() {
		return "Rezervare [codRezervare=" + codRezervare + ", areMancare=" + areMancare + ", areScaunErgonomic="
				+ areScaunErgonomic + ", areBautura=" + areBautura + ", areMuzica=" + areMuzica + ", genMuzica="
				+ genMuzica + "]";
	}

}
