package ro.ase.cts.observer.clase;

public class ManagerSala extends Subiect {
	public void anuntaMeci(TipMeci tip) {
		super.notificaClienti("A aparut un nou meci de: " + tip);
	}
}
