package ro.ase.cts.program;

import ro.ase.cts.clase.ManagerSpital;
import ro.ase.cts.clase.ManagerSpitalLazy;

public class Main {

	public static void main(String[] args) {
		ManagerSpital m1 = ManagerSpital.getInstance();
		ManagerSpital m2 = ManagerSpital.getInstance();
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		
		ManagerSpitalLazy ml1 = ManagerSpitalLazy.getInstance("Gigel", 43, 1000);
		ManagerSpitalLazy ml2 = ManagerSpitalLazy.getInstance("Dorel", 43, 1001);
		
		ml1.setVarsta(21);
		ml2.setNume("Ionel");
		
		System.out.println(ml1.toString());
		System.out.println(ml2.toString());
	}

}
