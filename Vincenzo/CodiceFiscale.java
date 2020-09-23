
public class CodiceFiscale {
	private String cf;
	
	public CodiceFiscale(String cf) throws Exception {
		if(cf.length()==16)
			this.cf = cf.toUpperCase();
		else throw new Exception("La lunghezza del codice fiscale deve essere 16!");
	}
	
	public String getCognome() {
		return cf.substring(0, 3);
	}
	
	public String getNome() {
		return cf.substring(3, 6);
	}
	
	public int getAnnoNascita() {
		return 1900+Integer.parseInt(cf.substring(6, 8));
	}
	
	public String getMese() {
		switch (cf.charAt(8)) {
		case 'A':
			return "01";
		case 'B':
			return "02";
		case 'C':
			return "03";
		case 'D':
			return "04";
		case 'E':
			return "05";
		case 'H':
			return "06";
		case 'L':
			return "07";
		case 'M':
			return "08";
		case 'P':
			return "09";
		case 'R':
			return "10";
		case 'S':
			return "11";
		case 'T':
			return "12";
		default:
			return "errore!";
		}
	}
	
	public String getSesso() {
		if(getGiorno()<=31)
			return "M";
		else return "F";
	}
	
	public int getGiorno() {
		return Integer.parseInt(cf.substring(9, 11));
	}
	
	public String toString() {
		return cf;
	}
	
	public String getComune() {
		return cf.substring(11, 15);
	}
	
	public String getCodiceControllo() {
		return cf.substring(15);
	}
	
	public String codiceInverso() {
		int giorno = getGiorno();
		if(giorno>31)
			giorno = giorno - 40;
		return "Nome: "+getNome() + " Cognome: "+getCognome()+" Anno Nascita: "+getAnnoNascita()+" Mese Nascita: "+getMese()+" Giorno Nascita: "+giorno+" Sesso: "+getSesso()+" Comune Nascita: "+getComune()+" Codice di Controllo: "+getCodiceControllo();
	}

}
