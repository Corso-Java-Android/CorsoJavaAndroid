/*** This class draws a bar chart.
* @author Sara Vizzaccaro
*/
public class ContoCorrente {
//Attributi	
private String titolareConto;
private double saldo;
private int numConto;


public ContoCorrente(String titolare, int nc, double s) {
	titolareConto=titolare;
	numConto=nc;
	saldo=s;
}

//Metodi 
public String getTitolareConto() {return titolareConto;}
public void setTitolareConto(String tc) {titolareConto=tc;}

public int getNumConto() {return numConto;}
public void setNumConto(int nc) {numConto=nc;}

public double getSaldo() {return saldo;}
public void setSaldo(double saldo) {this.saldo=saldo;}

public String toString() {
	return titolareConto+" "+numConto+" "+saldo+".";
 }

public void versamento(double importo) {
	saldo=saldo+importo;
}
/**
 * 
 * @param importo
 * @return se il saldo è minore del importo restuisce false altrimenti true
 */
public boolean prelievo(double importo) {
	boolean controllo= importo<=saldo;
	if(controllo)  saldo=saldo-importo; 
    return controllo;
}

public void stampa() {
	System.out.println("Titolare del conto: "+titolareConto);
	System.out.println("Numero Conto: "+numConto);
	System.out.println("Saldo del Conto: "+saldo);
}


}
