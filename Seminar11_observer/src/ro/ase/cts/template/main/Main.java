package ro.ase.cts.template.main;

import ro.ase.cts.template.clase.SpectatorHandicap;
import ro.ase.cts.template.clase.SpectatorUzual;

public class Main {

	public static void main(String[] args) {
		SpectatorUzual spectator1 = new SpectatorUzual("gigel");
		spectator1.intrareStadion();
		SpectatorHandicap spectator2 = new SpectatorHandicap("Gigel");
		spectator2.intrareStadion();
	}

}
