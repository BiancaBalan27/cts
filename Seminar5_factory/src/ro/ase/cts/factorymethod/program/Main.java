package ro.ase.cts.factorymethod.program;

import ro.ase.cts.factorymethod.clase.AtacantFactory;
import ro.ase.cts.factorymethod.clase.Jucator;
import ro.ase.cts.factorymethod.clase.JucatorFactory;
import ro.ase.cts.factorymethod.clase.MijlocasFactory;
import ro.ase.cts.factorymethod.clase.PortarFactory;

public class Main {
	
	public static void afiseazaJucator(JucatorFactory fabrica, String nume) {
		Jucator jucator = fabrica.creareJucator(nume);
		System.out.println(jucator);
	}

	public static void main(String[] args) {
		afiseazaJucator(new PortarFactory(), "Gigel");
		afiseazaJucator(new AtacantFactory(), "Ionel");
		afiseazaJucator(new MijlocasFactory(), "Dorel");
	}

}
