package bootstrap;

import geometria.Rettangolo;
import geometria.Cerchio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// static: esiste a prescindere --> non fa parte di un oggetto
		// il codice � sempre eseguibile se catalogato come static

		// la JVM garantisce l'esecuzione di un metodo che � static, pubblico, si chiama
		// main
		// e deve avere come parametri String[] args, quindi array di stringhe
		// altrimenti main non � eseguibile

		
		// new crea un'instanza
		// d� istruzione al compilatore di allocare la memoria
		// ...rendere disponibile il rettangolo

		// IN JAVA NON C'� L'ARITMETICA DEI PUNTATORI
		// posso avere pi� riferimenti allo stesso oggetto

		Rettangolo r1 = new Rettangolo(10, 50); // rettangolo � un riferimento
		Rettangolo r2 = new Rettangolo(20, 100);
		
		
		Cerchio c1 = new Cerchio(4.19);

		// r1.base = 20; --> se metto le variabili in private sulla classe modello, non funziona
		

		// in java il + � l'unico operatore overloaded
		System.out.println("R1 Area= " + r1.area() + " Perimetro= " + r1.perimetro());
		System.out.println("R2 Area= " + r2.area() + " Perimetro= " + r2.perimetro());

		
		System.out.println("C1 Area= " + c1.area() + " Perimetro= " + c1.perimetro());

		
	}

}
