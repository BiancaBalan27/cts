package ro.ase.cts.decorator.clase;

public class DecoratorMesajLMA extends DecoratorAbstract {

	public DecoratorMesajLMA(BiletAbstract biletAbstract) {
		super(biletAbstract);
	}
	
	@Override
	public void rezervaBilet() {
		super.rezervaBilet();
		System.out.println("La multi ani!");
	}
}
