package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.BazaDeDateHuligani;
import ro.ase.cts.facade.clase.Bilet;
import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Persoana;
import ro.ase.cts.facade.clase.Politie;

public class Main {

	public static void main(String[] args) {
		Persoana persoana = new Persoana("Andrei", "1234567890113");
		Bilet bilet = new Bilet("Andrei","loc");
		
		if(persoana.getNume().equals(bilet.getNume())) {
			if(!Politie.esteUrmarita(persoana)) {
				if(!BazaDeDateHuligani.esteInListaDeHuligani(persoana)) {
					System.out.println("Poftiti!");
				}
			}
		}
		
		Persoana persoana2 = new Persoana("Maria" , "2345678901234");
		Bilet bilet2 = new Bilet("Maria", "loc2");
		if(Facade.sePermiteAccesulPeStadion(persoana2, bilet2)) {
			System.out.println("Poftiti!");
		} else {
			System.out.println("Nu aveti voie!");
		}
	}

}
