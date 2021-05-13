package ro.ase.cts.observer.main;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.ManagerSala;
import ro.ase.cts.observer.clase.TipMeci;

public class Main {

	public static void main(String[] args) {
		ManagerSala manager = new ManagerSala();
		Client client1 = new Client("Gigel1");
		Client client2 = new Client("Gigel2");
		Client client3 = new Client("Gigel3");
		
		manager.adaugaObserver(client1);
		manager.adaugaObserver(client2);
		manager.adaugaObserver(client3);
		manager.anuntaMeci(TipMeci.fotbal);
		manager.stergeObserver(client3);
		manager.anuntaMeci(TipMeci.handbal);
	}

}
