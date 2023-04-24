package DependencyInjection;

public class Mobile2 {
	
	private int id;
	private String name;
	private String ram;
	
	private Sim sim;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public Sim getSim() {
		return sim;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}

	@Override
	public String toString() {
		return "Mobile2 [id=" + id + ", name=" + name + ", ram=" + ram + ", sim=" + sim + "]";
	}
	
	

}
