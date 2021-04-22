package ro.ase.cts.state.clase;

public class Masa {
	private int nrMasa;
	private Stare stare;
	
	public Masa(int nrMasa) {
		super();
		this.nrMasa = nrMasa;
		this.stare = new Libera();
	}

	public int getNrMasa() {
		return nrMasa;
	}

	public void setNrMasa(int nrMasa) {
		this.nrMasa = nrMasa;
	}

	public Stare getStare() {
		return stare;
	}

	void setStare(Stare stare) {
		this.stare = stare;
	}
	
	public void rezervaMasa() {
		Rezervata rezervata = new Rezervata();
		rezervata.schimbaStare(this);
	}
	
	public void ocupaMasa() {
		Ocupata ocupata = new Ocupata();
		ocupata.schimbaStare(this);
	}
	
	public void elibereazaMasa() {
		Libera libera = new Libera();
		libera.schimbaStare(this);
	}
}
