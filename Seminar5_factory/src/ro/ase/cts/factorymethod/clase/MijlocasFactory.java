package ro.ase.cts.factorymethod.clase;

public class MijlocasFactory implements JucatorFactory {

	@Override
	public Jucator creareJucator(String nume) {
		return new Mijlocas(nume);
	}

}
