package ro.ase.cts.clase;

public class Elev extends Aplicant {
	private int clasa;
	private String tutore;
	private static float sumaFinantata = 30;
	
	public Elev() {
		super();
	}

	public Elev(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect,
			int clasa, String tutore) {
		super(nume, prenume, varsta, punctaj, nr_proiecte, denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	public int getClasa() {
		return clasa;
	}

	public void setClasa(int i) {
		this.clasa = i;
	}

	public String getTutore() {
		return tutore;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	public static void setSumaFinantata(float sumaFinantata) {
		Elev.sumaFinantata = sumaFinantata;
	}

	public static float getFinantare() {
		return sumaFinantata;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("Elev: ");
		str.append(super.toString()).append(" clasa ").append(clasa).append(" tutore ").append(tutore);
		return str.toString();
	}

	@Override
	public float getSumaFinantata() {
		return sumaFinantata;
	}
}
