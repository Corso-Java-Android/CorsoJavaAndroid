package LibroEsercizio;
public class LibroMain {

	public static void main(String[] args) {
		
		Libro l = new Libro("Enrico","Ciao a tutti","Enrico Srl",1000000);
		
		System.out.println(l.stampa());
		
		//System.out.println("L'autore �: " + l.getAutore() + "  e il Titolo del libro �: " + l.getTitolo()+ " L'editore � : "+l.getEditore()+ " e il prezzo �: "+l.getPrezzo());

	}

}
