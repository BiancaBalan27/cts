package ro.ase.cts.chainofresponsibility.program;

import ro.ase.cts.chainofresponsibility.clase.Cont;
import ro.ase.cts.chainofresponsibility.clase.ContCredit;
import ro.ase.cts.chainofresponsibility.clase.ContCurent;
import ro.ase.cts.chainofresponsibility.clase.ContEconomii;
import ro.ase.cts.chainofresponsibility.clase.ContIndisponibil;

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
