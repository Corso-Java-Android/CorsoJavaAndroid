package geometria;

public class Rettangolo { //TIPO, Rettangolo è un modello inventato da noi ed è un tipo di base
	
	
	//una classe è un modello descrittivo
	//contenitore che include descrizione di dati
	//quando definiamo un modello --> definiamo un tipo
	
	//double e long contengono sempre 64 bit
	//int e float sono 32 bit
	//se non dichiariamo public/private...di default sono variabili di package
	//che vuol dire visibile all'interno delle classi del package
	
	//INCAPSULAMENTO
	//consente di raggruppare variabile di istanza e metodi in grado modificare lo stato
	//dell'oggetto
	
	/*un COSTRUTTORE serve a creare lo stato iniziale dell'oggetto
	 *quando crea un'instanza passa dei valori che vanno a customizzare
	 * quell'istanza.  
	 * */
	
	private double base; //variabile di istanza, non può essere static
	private double altezza;
	
	public Rettangolo(double b, double a){
		base = b;
		altezza = a;
	}
	
	public double perimetro() { return (base+altezza)*2;}
	public double area() { return (base*altezza);}
	
	
	
	
	
	
}
