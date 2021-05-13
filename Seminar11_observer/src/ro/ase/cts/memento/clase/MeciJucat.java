package ro.ase.cts.memento.clase;

public class MeciJucat {
	private String echipaGazda;
	private String echipaOaspete;
	private int nrSpectatori;
	private int nrBileteVandute;
	private int nrSticleApaVandute;
	private int nrJandarmi;
	
	public MeciJucat(String echipaGazda, String echipaOaspete, int nrSpectatori, int nrBileteVandute,
			int nrSticleApaVandute, int nrJandarmi) {
		super();
		this.echipaGazda = echipaGazda;
		this.echipaOaspete = echipaOaspete;
		this.nrSpectatori = nrSpectatori;
		this.nrBileteVandute = nrBileteVandute;
		this.nrSticleApaVandute = nrSticleApaVandute;
		this.nrJandarmi = nrJandarmi;
	}
	
	public Memento salvareMemento() {
		Memento memento = new Memento(nrSpectatori, echipaGazda, echipaOaspete);
		return memento;
	}
	
	public void undo(Memento memento) {
		this.nrSpectatori = memento.getNrSpectatori();
		this.echipaGazda = memento.getEchipaGazda();
		this.echipaOaspete = memento.getEchipaOaspete();
	}

	public void setEchipaGazda(String echipaGazda) {
		this.echipaGazda = echipaGazda;
	}

	public void setEchipaOaspete(String echipaOaspete) {
		this.echipaOaspete = echipaOaspete;
	}

	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}

	public void setNrBileteVandute(int nrBileteVandute) {
		this.nrBileteVandute = nrBileteVandute;
	}

	public void setNrSticleApaVandute(int nrSticleApaVandute) {
		this.nrSticleApaVandute = nrSticleApaVandute;
	}

	public void setNrJandarmi(int nrJandarmi) {
		this.nrJandarmi = nrJandarmi;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MeciJucat [echipaGazda=");
		builder.append(echipaGazda);
		builder.append(", echipaOaspete=");
		builder.append(echipaOaspete);
		builder.append(", nrSpectatori=");
		builder.append(nrSpectatori);
		builder.append(", nrBileteVandute=");
		builder.append(nrBileteVandute);
		builder.append(", nrSticleApaVandute=");
		builder.append(nrSticleApaVandute);
		builder.append(", nrJandarmi=");
		builder.append(nrJandarmi);
		builder.append("]");
		return builder.toString();
	}
}
