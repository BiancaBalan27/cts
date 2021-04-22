package ro.ase.cts.state.clase;

class Ocupata implements Stare {

	@Override
	public void schimbaStare(Masa masa) {
		if(!(masa.getStare() instanceof Ocupata)) {
			System.out.println("Ati ocupat masa cu codul " + masa.getNrMasa());
			masa.setStare(this);
		} else {
			System.out.println("Masa " + masa.getNrMasa() + " este deja ocupata sau rezervata");
		}
		
	}

}
