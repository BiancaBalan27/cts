package ro.ase.cts.state.clase;

class Libera implements Stare {

	@Override
	public void schimbaStare(Masa masa) {
		if(!(masa.getStare() instanceof Libera)) {
			System.out.println("Masa cu codul " + masa.getNrMasa() + " a fost eliberata");
			masa.setStare(this);
		} else {
			System.out.println("Masa " + masa.getNrMasa() + " este deja libera");
		}
		
	}

}
