package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.Bilet;
import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorMesajLMA;
import ro.ase.cts.decorator.clase.DecoratorMesajSustinere;

public class Main {

	public static void main(String[] args) {
		Bilet bilet = new Bilet("Gigel","Echipa1", "Echipa2");
		bilet.rezervaBilet();
		DecoratorMesajSustinere decorator = new DecoratorMesajSustinere(bilet);
		decorator.rezervaBilet();
		
		DecoratorMesajLMA decorator2 = new DecoratorMesajLMA(bilet);
		System.out.println();
		decorator2.rezervaBilet();
		
		DecoratorAbstract decorator3 = new DecoratorMesajLMA(decorator);
		System.out.println();
		decorator3.rezervaBilet();
	}

}
