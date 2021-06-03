package dubluri;

import java.util.List;

import clase.IStudent;

public class StudentFake implements IStudent {
	
	private String valoareGetNume;
	private float valoareGetMedie;
	private int valoareGetNota;
	private boolean valoareGetAreRestante;

	public void setValoareGetNume(String valoareGetNume) {
		this.valoareGetNume = valoareGetNume;
	}

	public void setValoareGetMedie(float valoareGetMedie) {
		this.valoareGetMedie = valoareGetMedie;
	}

	public void setValoareGetNota(int valoareGetNota) {
		this.valoareGetNota = valoareGetNota;
	}

	public void setValoareGetAreRestante(boolean valoareGetAreRestante) {
		this.valoareGetAreRestante = valoareGetAreRestante;
	}

	@Override
	public String getNume() {
		return valoareGetNume;
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		return valoareGetMedie;
	}

	@Override
	public int getNota(int index) {
		return valoareGetNota;
	}

	@Override
	public boolean areRestante() {
		return valoareGetAreRestante;
	}

}
