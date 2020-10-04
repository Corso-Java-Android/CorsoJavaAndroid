package cliente.model;

public class Cliente {

	private int id_cliente;
	private String nome;
	private String cognome;
	private String email;
	private String indirizzo;
	private String citta;
	private String provincia;
	private int cap;
	
	
	public Cliente(int id_cliente, String nome, String cognome, String email, String indirizzo, String citta,
			String provincia, int cap) {
		super();
		this.id_cliente = id_cliente;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.indirizzo = indirizzo;
		this.citta = citta;
		this.provincia = provincia;
		this.cap = cap;
	}
	
	
	
	
	public int getId() {
		return id_cliente;
	}
	
	public void setId(int id) {
		this.id_cliente = id;
	}


	@Override
	public String toString() {
		return "Cliente [id_cliente=" + id_cliente + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email
				+ ", indirizzo=" + indirizzo + ", citta=" + citta + ", provincia=" + provincia + ", cap=" + cap + "]";
	}
	
	
	
	
}
