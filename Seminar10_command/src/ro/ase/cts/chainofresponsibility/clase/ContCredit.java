package ro.ase.cts.chainofresponsibility.clase;

public class ContCredit extends Cont{

	public ContCredit(String detinator, float sold) {
		super(detinator, sold);
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(super.getSold() >= suma) {
			System.out.println("S-a realizat plata de " + suma + " lei din contul de credit");
			super.setSold(super.getSold()-suma);
		} else {
			super.getSuccesor().realizeazaPlata(suma);
		}
	}

}
