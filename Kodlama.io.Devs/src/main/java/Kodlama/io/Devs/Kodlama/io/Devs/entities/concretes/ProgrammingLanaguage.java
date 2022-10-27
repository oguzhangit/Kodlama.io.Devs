package Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes;

public class ProgrammingLanaguage {

	private int id;
	private String name;
	
	public ProgrammingLanaguage() {
		
	}

	public ProgrammingLanaguage(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
