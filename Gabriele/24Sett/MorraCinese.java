import java.lang.Math;
import java.util.Random;

public class MorraCinese {
	
	
	public String morra() {
		Random rand = new Random(System.currentTimeMillis());
		
		int val = rand.nextInt(3);
		if(val == 0)
			return "Sasso";
		else if(val == 1)
			return "Carta";
		else 
			return "Forbici";
		
	}
	
	public int confronto(String mossaUtente) {
		String mossaPc = this.morra();
		System.out.println("Il pc gioca " + mossaPc);
		
		if(mossaPc.equalsIgnoreCase(mossaPc)) 
			return 0; 	//Pareggio;
		else {
			if(mossaUtente.equalsIgnoreCase("Sasso")) {
				if(mossaPc.equals("Carta")) {
					return -1;  //Vince il PC
				} else
					return +1;  //Vince l'utente
			} else if(mossaUtente.equalsIgnoreCase("Carta")) {
				if(mossaPc.equals("Carta")) {
					return 1;
				} else
					return -1;
			} else {
				if(mossaPc.equals("Sasso")) {
					return -1;
				} else {
					return 1;
				}
			}
		}
		
	}
	
	
	public int Confronto1(String mossaUtente) {
		String mossaPc = this.morra();
		System.out.println("Il pc gioca " + mossaPc);
		
		if(mossaPc.equals("Sasso")) {
			return this.pcSasso(mossaUtente);
		} else if(mossaPc.equals("Carta")) {
			return this.pcCarta(mossaUtente);
		} else {
			return this.pcForbici(mossaUtente);
		}
	}
	
	
	
	public int pcSasso(String mossaUtente) {
		if(mossaUtente.equalsIgnoreCase("Sasso")) {
			return 0;
		} else if(mossaUtente.equalsIgnoreCase("Carta")) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	public int pcCarta(String mossaUtente) {
		if(mossaUtente.equalsIgnoreCase("Carta")) {
			return 0;
		} else if(mossaUtente.equalsIgnoreCase("Forbici")) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	public int pcForbici(String mossaUtente) {
		if(mossaUtente.equalsIgnoreCase("Forbici")) {
			return 0;
		} else if(mossaUtente.equalsIgnoreCase("Sasso")) {
			return 1;
		} else {
			return -1;
		}
	}
	
	
};