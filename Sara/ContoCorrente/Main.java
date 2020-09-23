import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner (System.in);
		
		System.out.println("Inserisci NomeConto:");
		String titolareConto=in.nextLine();
		System.out.println("Inserisci Numero Conto:");
		int numConto=in.nextInt();
		System.out.println("Inserisci Saldo Conto:");
		double saldo=in.nextDouble();
		
		ContoCorrente cc=new ContoCorrente(titolareConto, numConto, saldo);
		int scelta=0;
		while(scelta<3) {
		System.out.println("Digita 1 per Prelievo e 2 per Versamento");
		scelta=in.nextInt();
		if(scelta>2)System.out.println("Ciao ");
		else {System.out.println("Importo:");
		      double importo=in.nextDouble();
		      if(scelta==1) {if(!(cc.prelievo(importo))) System.out.println("Importo superiore del Saldo.");
		                     
		                     }
			  if(scelta==2) cc.versamento(importo);
			  cc.stampa();
			  
		}
		
		
		}in.close();
	
	
	}

}
