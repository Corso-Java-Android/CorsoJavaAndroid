//0123456789012345
//VTTDNL97T15F138E
public class CodiceFiscale {
	private String codiceFiscale;
	
	
	public CodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public int giorno() {
		int temp=Integer.parseInt(codiceFiscale.substring(9, 11));
		if(temp<40)
			return temp;
		else
			return temp-40;		
	}
	
	public int mese() {
		System.out.println(codiceFiscale.substring(8, 9));
		switch (codiceFiscale.substring(8, 9)) {
		case "A": return 1;
		case "B": return 2;
		case "C": return 3;
		case "D": return 4;
		case "E": return 5;
		case "H": return 6;
		case "L": return 7;
		case "M": return 8;
		case "P": return 9;
		case "R": return 10;
		case "S": return 11;
		case "T": return 12;
		default: return 0;
		}		
		
	}
	
	public int anno() {
		return 1900+Integer.parseInt(codiceFiscale.substring(6, 8));
	}
	
	public String sesso() {
		if(Integer.parseInt(codiceFiscale.substring(9, 11))<40)
			return "Maschio";
		else
			return "Femmina";
	}
	
	public int età() {
		return 2020-this.anno();
	}
	
	public boolean isValid() {
		return codiceFiscale.length()==16;
	}

	public String toString() {
		return "\nData di Nascita: "+giorno()+"/"+mese()+"/"+anno()+"\nSesso: "+sesso()+ "\nEtà: "+età();
	}
}
