package ro.ase.cts.decorator.clase;

public class Bilet implements BiletAbstract {
	
	private String numeClient;
	private String numeGazda;
	private String numeOaspeti;

	public Bilet(String numeClient, String numeGazda, String numeOaspeti) {
		super();
		this.numeClient = numeClient;
		this.numeGazda = numeGazda;
		this.numeOaspeti = numeOaspeti;
	}

	public String getNumeClient() {
		return numeClient;
	}

	public String getNumeGazda() {
		return numeGazda;
	}

	public String getNumeOaspeti() {
		return numeOaspeti;
	}

	@Override
	public void rezervaBilet() {
		System.out.println(numeClient + " are bilet la meciul " + numeGazda + " " + numeOaspeti);
	}

}
