package ro.ase.cts.template.clase;

public class SpectatorHandicap extends TemplateStadion {
	
	private String nume;

	public SpectatorHandicap(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareCoada() {
		System.out.println(nume + " a fost asezat la coada");
	}

	@Override
	public void prezentareBilet() {
		System.out.println(nume + " a prezentat biletul");
	}

	@Override
	public void controlCorporal() {
		System.out.println(nume + " a fost controlat. A fost controlat si caruciorul");
	}

	@Override
	public void ocupareLoc() {
		System.out.println(nume + " a ocupat locul special");
	}

}
