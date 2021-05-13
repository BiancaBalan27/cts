package ro.ase.cts.memento.main;

import ro.ase.cts.memento.clase.ManagerMeciuri;
import ro.ase.cts.memento.clase.MeciJucat;

public class Main {

	public static void main(String[] args) {
		MeciJucat meci = new MeciJucat("gazda", "oaspete", 10, 30, 40, 40);
		ManagerMeciuri manager = new ManagerMeciuri();
		manager.adaugaMemento(meci.salvareMemento());
		
		meci.setNrSpectatori(300);
		meci.setEchipaGazda("alta gazda");
		meci.setEchipaOaspete("alt oaspete");
		manager.adaugaMemento(meci.salvareMemento());
		
		System.out.println(meci.toString());
		meci.undo(manager.getMemento(0));
		System.out.println(meci.toString());
	}

}
