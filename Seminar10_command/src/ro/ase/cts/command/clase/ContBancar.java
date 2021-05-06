package ro.ase.cts.command.clase;

public class ContBancar {
	private String detinator;
	private float sold;
	
	public ContBancar(String detinator) {
		super();
		this.detinator = detinator;
		this.sold = 0;
	}
	
	public void constituire(float suma) {
		System.out.println("A fost constituita suma: " + suma);
		sold = suma;
	}
	
	public void retragere(float suma) {
		if(suma<=sold) {
			System.out.println("A fost retrasa suma: " + suma);
			sold-=suma;
		} else {
			System.out.println("Sold insuficient");
		}
	}
	
	public void depunere(float suma) {
		System.out.println("A fost depunere suma: " + suma);
		sold+=suma;
	}
}
