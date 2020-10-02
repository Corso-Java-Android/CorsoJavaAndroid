package database.model;

public class Provincia {
	private int id;
	private int idRegione;
	private int codiceCittaMetropolitana;
	private String nome;
	private String siglaAutomobilistica;
	private double latitudine;
	private double longitudine;
	public Provincia(int id, int idRegione, int codiceCittaMetropolitana, String nome, String siglaAutomobilistica,
			double latitudine, double longitudine) {
		super();
		this.id = id;
		this.idRegione = idRegione;
		this.codiceCittaMetropolitana = codiceCittaMetropolitana;
		this.nome = nome;
		this.siglaAutomobilistica = siglaAutomobilistica;
		this.latitudine = latitudine;
		this.longitudine = longitudine;
	}
	
	public int getId() {
		return id;
	}
	public int getIdRegione() {
		return idRegione;
	}
	public int getCodiceCittaMetropolitana() {
		return codiceCittaMetropolitana;
	}
	public String getNome() {
		return nome;
	}
	public String getSiglaAutomobilistica() {
		return siglaAutomobilistica;
	}
	public double getLatitudine() {
		return latitudine;
	}
	public double getLongitudine() {
		return longitudine;
	}
	
}
