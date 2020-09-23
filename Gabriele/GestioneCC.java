import java.util.Scanner;

public class GestioneCC {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ContoCorrente cc = new ContoCorrente();
		ContoCorrente cc1 = new ContoCorrente("Gabriele Lo Piccolo", 2500, 61);
		
		cc.setTitolareConto("Carlo Mazza");
		
		cc.setSaldo(2500);
		
		cc.setNumeroConto(60); 	
		
		System.out.println(cc);
		
			
		//OPPURE
		
		
		System.out.println("Titolare Conto: " + cc.getTitolareConto());
		System.out.println("Saldo: " + cc.getSaldo());
		System.out.println("Numero Conto: " + cc.getNumeroConto() + "\n");
		
		
		System.out.println(cc1);
		
		
		
		String nome = new String("Luisa Rossi");
		
		//nome.length();
		
		System.out.println(nome.length());
		
		cc.versamento(5000);
		
		System.out.println(cc.prelievo(4000));
		
		
		ContoCorrente cc2 = new ContoCorrente();
		
		System.out.println("Inserisci il nome: ");
		String nomeIntestatario = sc.nextLine();
		cc2.setTitolareConto(nomeIntestatario);
		
		System.out.println("Inserisci il saldo: ");
		double saldoIntestatario = sc.nextDouble();
		cc2.setSaldo(saldoIntestatario);
		
		System.out.println("Inserisci il Numero del Conto: ");
		int numeroIntestatario = sc.nextInt();
		cc2.setNumeroConto(numeroIntestatario);
		int scelta = 0;
		
		while(scelta != 3) {
		
		System.out.println("1)Versamento \n2)Prelievo \n3)Esci e Stampa");
		scelta = sc.nextInt();
		
		if(scelta == 1) {
			System.out.println("Inserisci il credito da versare");
			double somma = sc.nextInt();
			cc2.versamento(somma);
			
			} else if (scelta == 2) {
				System.out.println("Inserisci il credito da prelevare");
					double importo = sc.nextDouble();
					boolean risultato = cc2.prelievo(importo);
						if(risultato == false) {
							System.out.println("Operazione negata");
						}
					} else if(scelta == 3) {
						System.out.println("Ciao " + nomeIntestatario + ". Ecco la tua stampa\n " );
				}	
		
		}
		
		System.out.println(cc2);
		
		sc.close();
	}

}
