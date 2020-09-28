public class CasualeTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   String [] nomi= {"Davide Pasquali",
			   "Enrico Macrì",
			   "Tommaso Segato",
			   "Daniele Vittore",
			   "Danis Moretta",
			   "Erika Corallo",
			   "Gabriele Lo Piccolo",
			   "Giovanni Battista Cortese",
			   "Karol Khaira",
			   "Olivia Nadia Djeugove",
			   "Sara Vizzaccaro",
			   "Valentina De Miglio",
			   "Vincenzo Santoro",
			   "Alessio Angelo Liotta"};
	   OrdineCasualeGenerato g=new OrdineCasualeGenerato(nomi);
	   
	   g.printOrdineCasuale();
	   System.out.println("*****************");
	
	}
}
