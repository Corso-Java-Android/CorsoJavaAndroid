public class Libro {
	private String autore;
	private String titolo;
	private double prezzo=0;
	private String editore="";
	 
	 public Libro(String autore, String titolo) {
		 this.autore=autore;
		 this.titolo=titolo;
	 }
	 
	 public Libro(String autore, String titolo, String editore, double prezzo) {
		 this.autore=autore;
		 this.titolo=titolo;
		 this.editore=editore;
		 this.prezzo=prezzo;

	 }
	 
	 public String getAutore() {return autore;} 
	 public String getTitolo() {return titolo;} 
	 public double getPrezzo() {return prezzo;} 
	 public String getEditore() {return editore;} 
	 
	 public void setAutore(String autore) { this.autore=autore;} 
	 public void setTitolo(String titolo) {this.titolo=titolo;} 
	 public void setPrezzo(double prezzo) {this.prezzo=prezzo;} 
	 public void setEditore(String editore) {this.editore=editore;} 
	 
	 
	 public void stampa() {
		 System.out.println("Titolo: "+titolo);
		 System.out.println("Autore: "+autore);
		 System.out.println("Prezzo: "+prezzo);
		 if(!(editore.equals(""))) System.out.println("Editore: "+editore);
		 else System.out.println("Non c'è nessun editore");
	 }

}
