package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaFlyweight {
	private Map<String, FlyweightAbstract> clienti;

	public FabricaFlyweight() {
		super();
		this.clienti = new HashMap<>();
	}
	
	public FlyweightAbstract getClient(String numarTelefon) {
		Client client = (Client)clienti.get(numarTelefon);
		if(client==null) {
			client = new Client("Popescu",numarTelefon, "popescu@gmail.com");
			clienti.put(numarTelefon, client);
		}
		return client;
	}
}
