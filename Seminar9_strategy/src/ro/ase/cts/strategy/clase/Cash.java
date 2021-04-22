package ro.ase.cts.strategy.clase;

public class Cash implements ModPlata {
	
	private float sold;

	public Cash(float sold) {
		super();
		this.sold = sold;
	}

	@Override
	public void achita(float suma) {
		if(suma <= sold) {
			System.out.println("S-a realizat plata cash pentru suma " + suma);
			sold-=suma;
		} else {
			System.out.println("Nu aveti fonduri suficiente");
		}
	}

}
