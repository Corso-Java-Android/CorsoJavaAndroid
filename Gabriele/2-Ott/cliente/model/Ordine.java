package cliente.model;

public class Ordine {
	
	private Integer y;
	
	//private int id_ordine = y;
	
	private String data;
	
	private double valore;
	
	private int id_cliente;

	public Ordine(Integer id_ordine, String data, double valore, int id_cliente) {
		super();
		//this.y = y;
		this.y = id_ordine;
		this.data = data;
		this.valore = valore;
		this.id_cliente = id_cliente;
	}
	
	public Ordine(Integer id_ordine) {
		this.y = id_ordine;
	}
	

	public int getId_ordine() {
		return y;
	}


	public void setId_ordine(int id_ordine) {
		this.y = id_ordine;
	}

	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public double getValore() {
		return valore;
	}


	public void setValore(double valore) {
		this.valore = valore;
	}


	public int getId_cliente() {
		return id_cliente;
	}


	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}


	@Override
	public String toString() {
		return "Ordine [Id Ordine" + y + ", data=" + data + ", valore=" + valore + ", id_cliente=" + id_cliente
				+ "]";
	}
	
	

}
