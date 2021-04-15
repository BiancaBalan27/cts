package ro.ase.cts.composite.clase;

public interface ComponentaMeniu {
	void adaugareNod(ComponentaMeniu componenta) throws Exception;
	void stergereNod(ComponentaMeniu componenta) throws Exception;
	void afisareInformatii();
	ComponentaMeniu getComponenta(int index) throws Exception;
}
