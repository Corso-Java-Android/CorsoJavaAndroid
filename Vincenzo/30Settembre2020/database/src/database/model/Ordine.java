package database.model;

public class Ordine {

	private Integer ID_ORDINE;
	private String data;	//2020-MM-GG 00:00:00
	private double valore;	//compreso tra 10000 e 20000 in java double
	private int ID_CLIENTE;
	
	public Ordine(Integer i, String data, double valore, int iD_CLIENTE) {
		super();
		ID_ORDINE = i;
		this.data = data;
		this.valore = valore;
		ID_CLIENTE = iD_CLIENTE;
	}

	public Integer getID_ORDINE() {
		return ID_ORDINE;
	}

	public String getData() {
		return data;
	}

	public double getValore() {
		return valore;
	}

	public int getID_CLIENTE() {
		return ID_CLIENTE;
	}

	@Override
	public String toString() {
		return "Ordine [ID_ORDINE=" + ID_ORDINE + ", data=" + data + ", valore=" + valore + ", ID_CLIENTE=" + ID_CLIENTE
				+ "]";
	}
	
}
