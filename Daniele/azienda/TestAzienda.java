package azienda;

public class TestAzienda {

	public static void main(String[] args) {

		Dipendente p = new Dipendente("Daniele", "Vittore");

		System.out.println(p);
		
		System.out.println(p.saluta());
		
		Direttore dir = new Direttore("Mega", "Galattico");
		
		System.out.println(dir.saluta());
		
		
	}

}
