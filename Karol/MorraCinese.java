import java.util.Random;

public class MorraCinese {
	
	
	public String mossaPC() {
		Random rand =  new Random (System.currentTimeMillis());
		int val = rand.nextInt(3);
		if(val==0)
			return "Sasso";
		else if (val==1)
			return "Carta";
		else return "Forbici";
		}
	
	public int confronto(String mossaUtente) {
		String mossaPC = mossaPC();
		System.out.println("Mossa PC: " + mossaPC);
		if(mossaPC.equals("Sasso"))
			return pcSasso(mossaUtente);
		else if(mossaPC.equals("Carta"))
			return pcCarta(mossaUtente);
		else 
			return pcForbici(mossaUtente);
		}
		
		public int pcSasso(String mossaUtente) {
			if(mossaUtente.equalsIgnoreCase("Sasso"))
				return 0;
			else if(mossaUtente.equalsIgnoreCase("Carta"))
				return 1;
			else return -1;
		}
		
		public int pcCarta(String mossaUtente) {
			if(mossaUtente.equalsIgnoreCase("Carta"))
				return 0;
			else if(mossaUtente.equalsIgnoreCase("Forbici"))
				return 1;
			else return -1;
		}
		
		public int pcForbici(String mossaUtente) {
			if(mossaUtente.equalsIgnoreCase("Forbici"))
				return 0;
			else if(mossaUtente.equalsIgnoreCase("Sasso"))
				return 1;
			else return -1;
		}
	}
	
