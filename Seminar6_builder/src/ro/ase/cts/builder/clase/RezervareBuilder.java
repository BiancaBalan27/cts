package ro.ase.cts.builder.clase;

public class RezervareBuilder implements Builder {
	
	private Rezervare rezervare;

	public RezervareBuilder() {
		super();
		this.rezervare = new Rezervare(0, false, false, false, false,"Clasica");
	}

	@Override
	public Rezervare build() {
		return rezervare;
	}
	
	public RezervareBuilder setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare);
		return this;
	}

	public RezervareBuilder setAreMancare(boolean areMancare) {
		rezervare.setAreMancare(areMancare);
		return this;
	}

	public RezervareBuilder setAreScaunErgonomic(boolean areScaunErgonomic) {
		rezervare.setAreScaunErgonomic(areScaunErgonomic);
		return this;
	}

	public RezervareBuilder setAreBautura(boolean areBautura) {
		rezervare.setAreBautura(areBautura);
		return this;
	}

	public RezervareBuilder setAreMuzica(boolean areMuzica) {
		rezervare.setAreMuzica(areMuzica);
		return this;
	}

	public RezervareBuilder setGenMuzica(String genMuzica) {
		rezervare.setGenMuzica(genMuzica);
		return this;
	}
}
