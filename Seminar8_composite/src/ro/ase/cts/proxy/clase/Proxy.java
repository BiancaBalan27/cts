package ro.ase.cts.proxy.clase;

public class Proxy implements IOperatorRezervare {
	
	private OperatorRezervare operator;
	private int nrMinimPersoane;

	public Proxy(OperatorRezervare operator, int nrMinimPersoane) {
		super();
		this.operator = operator;
		this.nrMinimPersoane = nrMinimPersoane;
	}

	@Override
	public void rezerva(int nrPersoane) {
		if(nrPersoane>=nrMinimPersoane) {
			operator.rezerva(nrPersoane);
		} else {
			System.out.println("Nu se poate realiza rezervarea pentru " + nrPersoane + " persoane");
		}
		
	}

}
