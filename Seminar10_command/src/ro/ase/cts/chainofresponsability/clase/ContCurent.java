package ro.ase.cts.chainofresponsability.clase;

public class ContCurent extends Cont{

	public ContCurent(String detinator, float sold) {
		super(detinator, sold);
	}

	@Override
	public void realizeazaPlata(float suma) {
		if(super.getSold() >= suma) {
			System.out.println("S-a realizat plata de " + suma + " lei din contul curent");
			super.setSold(super.getSold()-suma);
		} else {
			super.getSuccesor().realizeazaPlata(suma);
		}
	}

}
