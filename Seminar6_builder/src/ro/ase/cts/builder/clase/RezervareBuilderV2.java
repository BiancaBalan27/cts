package ro.ase.cts.builder.clase;

public class RezervareBuilderV2 implements Builder {
	
	private int codRezervare;
	private boolean areMancare;
	private boolean areScaunErgonomic;
	private boolean areBautura;
	private boolean areMuzica;
	private String genMuzica;
	
	public RezervareBuilderV2() {
		super();
		this.codRezervare = 0;
		this.areMancare = false;
		this.areScaunErgonomic = false;
		this.areBautura = false;
		this.areMuzica = false;
		this.genMuzica = " ";
	}
	
	public RezervareBuilderV2 setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}

	public RezervareBuilderV2 setAreMancare(boolean areMancare) {
		this.areMancare = areMancare;
		return this;
	}

	public RezervareBuilderV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
		return this;
	}

	public RezervareBuilderV2 setAreBautura(boolean areBautura) {
		this.areBautura = areBautura;
		return this;
	}

	public RezervareBuilderV2 setAreMuzica(boolean areMuzica) {
		this.areMuzica = areMuzica;
		return this;
	}

	public RezervareBuilderV2 setGenMuzica(String genMuzica) {
		this.genMuzica = genMuzica;
		return this;
	}

	@Override
	public Rezervare build() {
		return new Rezervare(codRezervare, areMancare, areScaunErgonomic, areBautura,
				areMuzica, genMuzica);
	}
}
