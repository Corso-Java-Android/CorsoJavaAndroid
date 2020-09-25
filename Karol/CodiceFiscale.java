
public class CodiceFiscale {
	
	//Attributi
	private int annoNascita;
	private int meseNascita;
	private int giornoNascita;
	private char sesso;
	private int età;	

	//Metodi
	
	public int annoNascita(String codFis) {
		annoNascita=Integer.parseInt(codFis.substring(6,8));
		return 1900+annoNascita;
	}
	
	public int meseNascita(String codFis) {
		switch (codFis.substring(8,9)) {
		case "A":{ meseNascita=1;break;}
		case "B":{ meseNascita=2;break;}
		case "C":{ meseNascita=3;break;}
		case "D":{ meseNascita=4;break;}
		case "E":{ meseNascita=5;break;}
		case "H":{ meseNascita=6;break;}
		case "L":{ meseNascita=7;break;}
		case "M":{ meseNascita=8;break;}
		case "P":{ meseNascita=9;break;}
		case "R":{ meseNascita=10;break;}
		case "S":{ meseNascita=11;break;}
		case "T":{ meseNascita=12;break;}
		}
		return meseNascita;
	}
	
	
	public int giornoNascita(String codFis) {
		
		if(Integer.parseInt(codFis.substring(9,11)) >= 40)
			giornoNascita = Integer.parseInt(codFis.substring(9,11))-40;
		else giornoNascita = Integer.parseInt(codFis.substring(9,11));
		return giornoNascita;
		
	}
	
	public char sesso(String codFis) {
		
		if(Integer.parseInt(codFis.substring(9,11)) >= 40)
			sesso='F';
		else
			sesso='M';
		return sesso;
		
	}
	
	public int età(String codFis) {
		
		età=2020-(1900+Integer.parseInt(codFis.substring(6,8)));
		return età;
		
	}
	
	public boolean controllo(String codFis) {
		
		return codFis.length()==16;
		
	}
	
}
