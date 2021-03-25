package ro.ase.cts.factorymethod.clase;

public class FundasFactory implements JucatorFactory {

	@Override
	public Jucator creareJucator(String nume) {
		return new Fundas(nume);
	}

}
