package database.model;

public class Cliente {
	private int ID_CLIENTE; 
	private String NOME; 
	private String COGNOME; 
	private String EMAIL;
	private String INDIRIZZO;
	private String CITTA; 
	private String PROVINCIA;
	private int CAP;
	
	public Cliente(int iD_CLIENTE, String nOME, String cOGNOME, String eMAIL, String iNDIRIZZO, String cITTA,
			String pROVINCIA, int cAP) {
		super();
		ID_CLIENTE = iD_CLIENTE;
		NOME = nOME;
		COGNOME = cOGNOME;
		EMAIL = eMAIL;
		INDIRIZZO = iNDIRIZZO;
		CITTA = cITTA;
		PROVINCIA = pROVINCIA;
		CAP = cAP;
	}

	@Override
	public String toString() {
		return "Cliente [ID_CLIENTE=" + ID_CLIENTE + ", NOME=" + NOME + ", COGNOME=" + COGNOME + ", EMAIL=" + EMAIL
				+ ", INDIRIZZO=" + INDIRIZZO + ", CITTA=" + CITTA + ", PROVINCIA=" + PROVINCIA + ", CAP=" + CAP + "]";
	}
	
}
