package database.model;

// DTO, Entity (ORM/JPA)
public class Regione {
	

	private int id;
	private String nome;
	private double latitudine;
	private double longitudine;
	
	
	public Regione(int id, String nome, double latitudine, double longitudine) {
		super();
		this.id = id;
		this.nome = nome;
		this.latitudine = latitudine;
		this.longitudine = longitudine;
	}


	@Override
	public String toString() {
		return "Regione [id=" + id + ", nome=" + nome + ", latitudine=" + latitudine + ", longitudine=" + longitudine
				+ "]";
	}
	
	
}