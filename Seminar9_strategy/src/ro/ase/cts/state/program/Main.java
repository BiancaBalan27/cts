package ro.ase.cts.state.program;

import ro.ase.cts.state.clase.Masa;

public class Main {

	public static void main(String[] args) {
		Masa masa = new Masa(1);
		masa.rezervaMasa();
		masa.ocupaMasa();
		masa.rezervaMasa();
//		masa.setStare(new Libera());
//		masa.rezervaMasa();
		masa.elibereazaMasa();
	}

}
