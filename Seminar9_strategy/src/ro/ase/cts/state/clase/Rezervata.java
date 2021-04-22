package ro.ase.cts.state.clase;

class Rezervata implements Stare {

	@Override
	public void schimbaStare(Masa masa) {
		if(masa.getStare() instanceof Libera) {
			System.out.println("Ati rezervat masa cu codul " + masa.getNrMasa());
			masa.setStare(this);
		} else {
			System.out.println("Masa " + masa.getNrMasa() + " nu poate fi rezervata");
		}
	}

}
