package ro.ase.cts.chainofresponsability.program;

import ro.ase.cts.chainofresponsability.clase.Cont;
import ro.ase.cts.chainofresponsability.clase.ContCredit;
import ro.ase.cts.chainofresponsability.clase.ContCurent;
import ro.ase.cts.chainofresponsability.clase.ContEconomii;
import ro.ase.cts.chainofresponsability.clase.ContIndisponibil;

public class Main {

	public static void main(String[] args) {
		Cont contCurent = new ContCurent("Gigel", 100);
		Cont contEconomii = new ContEconomii("Gigel", 200);
		Cont contCredit = new ContCredit("Gigel", 500);
		Cont contIndisponibil = new ContIndisponibil("Gigel");
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(contIndisponibil);
		
		contCurent.realizeazaPlata(100);
		contCurent.realizeazaPlata(50);
		contCurent.realizeazaPlata(300);
		contCurent.realizeazaPlata(600);
	}

}
