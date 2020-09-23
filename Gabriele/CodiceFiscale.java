
public class CodiceFiscale {
	
	//0123456789
	//LPCGRL98E10G273K
	
	private int annoDiNascita;
	private int meseDiNascita;
	private int giornoDiNascita;
	private final int LUNGHEZZA = 16;
	private String sesso;
	private int eta;
	
	
	public boolean verificaCodice(String codice) {
		if(codice.length() == LUNGHEZZA) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public CodiceFiscale() {
		
	}
	
	
	public int annoDiNascita(String codice) {
		 annoDiNascita = Integer.parseInt(codice.substring(6, 8)) +1900;
		 return annoDiNascita;
	}
	
	public int meseDiNascita(String codice) {
		
		switch (codice.substring(8, 9)) {
		case "A": { meseDiNascita = 1; break;}
		case "B": { meseDiNascita = 2; break;}
		case "C": { meseDiNascita = 3; break;}
		case "D": { meseDiNascita = 4; break;}
		case "E": { meseDiNascita = 5; break;}
		case "H": { meseDiNascita = 6; break;}
		case "L": { meseDiNascita = 7; break;}
		case "M": { meseDiNascita = 8; break;}
		case "P": { meseDiNascita = 9; break;}
		case "R": { meseDiNascita = 10; break;}
		case "S": { meseDiNascita = 11; break;}
		case "T": { meseDiNascita = 12; break;}
		
		
		}
		return meseDiNascita;
	}
	
	public int giornoDiNascita(String codice) {
		if(Integer.parseInt(codice.substring(9, 11)) <40 ) {
			giornoDiNascita = Integer.parseInt(codice.substring(9, 11));
		} else {
			giornoDiNascita = Integer.parseInt(codice.substring(9, 11)) -40;
		}
	  return giornoDiNascita;
	}
	
	public String sesso(String codice) {
		if(Integer.parseInt(codice.substring(9, 11)) <40) {
			sesso = "Maschio";
		} else {
			sesso = "Femmina";
		}
		return sesso;
	}
	
	/*
	public int eta(String codice) {
		return eta = 2020 - Integer.parseInt(codice.substring(6, 8));
	}
	*/
	
	public int eta(String codice) {
		return eta = 2020 - this.annoDiNascita;
	}
	
	
	public String toString() {
		return "Il tuo giorno di nascita è: " + giornoDiNascita + 
			   "\nIl tuo mese di nascita è: " + this.meseDiNascita + 
			   "\nIl tuo anno di nascita è: " + this.annoDiNascita + 
			   "\nLa tua età è: " + this.eta + 
			   "\nIl tuo sesso è: " + this.sesso;
	}
	
	
	
	
	
	
	
}
