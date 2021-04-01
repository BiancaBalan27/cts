package ro.ase.cts.builder.program;

import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder.clase.RezervareBuilder;
import ro.ase.cts.builder.clase.RezervareBuilderV2;

public class Main {

	public static void main(String[] args) {
		RezervareBuilder rezervareBuilder = new RezervareBuilder();
		Rezervare rezervare1 = rezervareBuilder.setAreBautura(true).build();
		Rezervare rezervare2 = new RezervareBuilder().setAreMancare(true).setAreBautura(true).build();
		System.out.println(rezervare1);
		System.out.println(rezervare2);
		
		RezervareBuilderV2 rezervareBuilder2 = new RezervareBuilderV2();
		Rezervare rezervare3 = rezervareBuilder2.setAreBautura(true).build();
		Rezervare rezervare4 = rezervareBuilder2.setAreMancare(true).setAreBautura(true).build();
		System.out.println(rezervare3);
		System.out.println(rezervare4);

	}

}
