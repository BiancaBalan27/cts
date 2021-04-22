package ro.ase.cts.strategy.clase;

public class Card implements ModPlata {

	@Override
	public void achita(float suma) {
		System.out.println("S-a realizat plata cu cardul pentru suma " + suma);
	}

}
