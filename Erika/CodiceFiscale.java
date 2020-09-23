
public class CodiceFiscale {

	// attributi
	private int annoNascita;
	private int meseNascita;
	private int giornoNascita;
	private String sesso;
	int eta;

	// Metodi
	public int annoNascita(String cf) {
		annoNascita = Integer.parseInt(cf.substring(6, 8));
		annoNascita = 1900 + annoNascita;
		return annoNascita;
	}

	public int meseNascita(String cf) {
		switch (cf.substring(8, 9)) {
		case "A": {

			meseNascita = 1;
			break;
		}
		case "B": {

			meseNascita = 2;
			break;
		}
		case "C": {

			meseNascita = 3;
			break;
		}
		case "D": {

			meseNascita = 4;
			break;
		}
		case "E": {

			meseNascita = 5;
			break;
		}
		case "H": {

			meseNascita = 6;
			break;
		}
		case "L": {

			meseNascita = 7;
			break;
		}
		case "M": {

			meseNascita = 8;
			break;
		}
		case "P": {

			meseNascita = 9;
			break;
		}
		case "R": {

			meseNascita = 10;
			break;
		}
		case "S": {

			meseNascita = 11;
			break;
		}
		case "T": {

			meseNascita = 12;
			break;
		}

		}
		return meseNascita;
	}
	
	
	

	public int giornoNascita(String cf) {
		if (Integer.parseInt(cf.substring(9, 11)) < 40) {

			giornoNascita = Integer.parseInt(cf.substring(9, 11));
		} else
			giornoNascita = Integer.parseInt(cf.substring(9, 11)) - 40;
		return giornoNascita;
	}
	
	
	

	public String sesso(String cf) {
		if (Integer.parseInt(cf.substring(9, 11)) < 40) {

			sesso = "Maschio";
		} else
			sesso = "Femmina";
		return sesso;
	}
	
	

	public int eta(String cf) {
		eta = 2020 - (1900 + Integer.parseInt(cf.substring(6, 8)));
		return eta;
	}

	
	
	public boolean lunghezza(String cf) {
		return cf.length() == 16;
	}
	
	
	public String soluzione() {
		
		return "Sei nato il " + giornoNascita + " " + meseNascita + " " 
		+ annoNascita + ", quindi hai " + eta + " anni. Inoltre sei " + sesso;
	}

}
