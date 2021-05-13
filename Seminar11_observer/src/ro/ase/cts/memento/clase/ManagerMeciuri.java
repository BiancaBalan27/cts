package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMeciuri {
	private List<Memento> lista;
	
	public ManagerMeciuri() {
		super();
		this.lista = new ArrayList<>();
	}

	public void adaugaMemento(Memento memento) {
		lista.add(memento);
	}
	
	public Memento getMemento(int pozitie) {
		if(pozitie >= 0 && pozitie < lista.size()) {
			return lista.get(pozitie);
		} else {
			throw new IndexOutOfBoundsException();
		}

	}
}
