package LibroEsercizio;
public class LibroMain {

	public static void main(String[] args) {
		
		Libro l = new Libro("Enrico","Ciao a tutti","Enrico Srl",1000000);
		
		System.out.println(l.stampa());
		
		//System.out.println("L'autore è: " + l.getAutore() + "  e il Titolo del libro è: " + l.getTitolo()+ " L'editore è : "+l.getEditore()+ " e il prezzo è: "+l.getPrezzo());

	}

}
