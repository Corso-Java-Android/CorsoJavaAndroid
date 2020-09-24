import java.util.Random;

public class MorraCinese {
	
	public String morra() {
		Random rand = new Random(System.currentTimeMillis());
		int val = rand.nextInt(3);
		if(val==0)
			return "Sasso";
		else if(val==1)
			return "Carta";
		else return "Forbici";
	}
	
	public int confronto(String mossaUtente) {
		String mossaPC = morra();
		System.out.println("Il PC gioca "+mossaPC);
		if(mossaPC.equals("Sasso"))
			return pcSasso(mossaUtente);
		else if(mossaPC.equals("Carta"))
			return pcCarta(mossaUtente);
		else return pcForbici(mossaUtente);
	}
	
	private int pcSasso(String mossaUtente) {
		if(mossaUtente.equalsIgnoreCase("Sasso"))
			return 0;	//pareggio
		else if(mossaUtente.equalsIgnoreCase("Carta"))
			return 1;	//vince utente
		else return -1;	//vince il pc
	}
	
	private int pcCarta(String mossaUtente) {
		if(mossaUtente.equalsIgnoreCase("Carta"))
			return 0;	//pareggio
		else if(mossaUtente.equalsIgnoreCase("Forbici"))
			return 1;	//vince utente
		else return -1;	//vince il pc
	}
	
	private int pcForbici(String mossaUtente) {
		if(mossaUtente.equalsIgnoreCase("Forbici"))
			return 0;	//pareggio
		else if(mossaUtente.equalsIgnoreCase("Sasso"))
			return 1;	//vince utente
		else return -1;	//vince il pc
	}

}
