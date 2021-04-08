package ro.ase.cts.adapter.clase;

public class AdapterObiecte implements BiletOnline {
	
	private Bilet bilet;

	public AdapterObiecte(Bilet bilet) {
		super();
		this.bilet = bilet;
	}

	@Override
	public void vindeBilet() {
		bilet.vinde();
	}

	@Override
	public void rezervaBilet() {
		bilet.rezerva();
	}

}
