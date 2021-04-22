package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Card;
import ro.ase.cts.strategy.clase.Cash;
import ro.ase.cts.strategy.clase.Client;

public class Main {

	public static void main(String[] args) {
		
		Cash cash = new Cash(500);
		Client client = new Client("Gigel", cash);
		client.platesteNota(300);
		client.setModPlata(new Card());
		client.platesteNota(220);
		client.setModPlata(cash);
		client.platesteNota(250);
	}

}
