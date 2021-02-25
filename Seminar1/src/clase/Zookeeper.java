package clase;

public class Zookeeper {
	
	private String name;
	
	public void feed(Animal a) {
		System.out.println(name + " hraneste animalul "+a.getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
