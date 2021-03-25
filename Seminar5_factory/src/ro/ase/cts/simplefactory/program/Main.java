package ro.ase.cts.simplefactory.program;

import ro.ase.cts.simplefactory.clase.Jucator;
import ro.ase.cts.simplefactory.clase.JucatorFactory;
import ro.ase.cts.simplefactory.clase.TipJucator;

public class Main {

	public static void main(String[] args) {

		try {
			Jucator jucator1 = JucatorFactory.createJucator(TipJucator.Fundas, "Gigel");
			Jucator jucator2 = JucatorFactory.createJucator(TipJucator.Portar, "Ionel");
			System.out.println(jucator1.toString());
			System.out.println(jucator2.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
