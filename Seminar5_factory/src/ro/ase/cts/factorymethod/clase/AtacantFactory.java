package ro.ase.cts.factorymethod.clase;

public class AtacantFactory implements JucatorFactory {

	@Override
	public Jucator creareJucator(String nume) {
		return new Atacant(nume);
	}

}
