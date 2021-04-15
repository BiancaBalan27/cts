package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.FabricaFlyweight;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare1 = new Rezervare(3, 4, 2);
		Rezervare rezervare2 = new Rezervare(2, 5, 1);
		Rezervare rezervare3 = new Rezervare(5, 3, 4);
		
		FabricaFlyweight fabrica = new FabricaFlyweight();
		Client client = (Client)fabrica.getClient("0847464336");
		client.afiseazaInformatii(rezervare1);
		Client client1 = (Client)fabrica.getClient("0847464332");
		client.afiseazaInformatii(rezervare2);
		fabrica.getClient("0847464334").afiseazaInformatii(rezervare3);
	}

}
