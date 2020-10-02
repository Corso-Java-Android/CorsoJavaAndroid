package database.model;

public class Comune {
	private int id;
	private int idProvincia;
	private int idRegione;
	private String nome;
	private boolean capoluogoProvincia;
	private String codiceCatastale;
	private double latitudine;
	private double longitudine;

	public Comune(int id, int idProvincia, int idRegione, String nome, boolean capoluogoProvincia,
			String codiceCatastale, double latitudine, double longitudine) {
		super();
		this.id = id;
		this.idProvincia = idProvincia;
		this.idRegione = idRegione;
		this.nome = nome;
		this.capoluogoProvincia = capoluogoProvincia;
		this.codiceCatastale = codiceCatastale;
		this.latitudine = latitudine;
		this.longitudine = longitudine;
	}

	public int getId() {
		return id;
	}

	public int getIdProvincia() {
		return idProvincia;
	}

	public int getIdRegione() {
		return idRegione;
	}

	public String getNome() {
		return nome;
	}

	public boolean isCapoluogoProvincia() {
		return capoluogoProvincia;
	}

	public String getCodiceCatastale() {
		return codiceCatastale;
	}

	public double getLatitudine() {
		return latitudine;
	}

	public double getLongitudine() {
		return longitudine;
	}

}
