
public class ContoCorrente {
	//Attributi
	private String titolareConto;
	private double saldo;
	private int numeroConto;
	
	//Costruttore
	public ContoCorrente(String titolareConto, double saldo, int numeroConto) {
		setTitolareConto(titolareConto);
		setSaldo(saldo);
		setNumeroConto(numeroConto);
	}
	
	//Metodi
	public void setTitolareConto(String titolareConto) {
		this.titolareConto=titolareConto;
	}
	
	public String getTitolareConto() {
		return this.titolareConto;
	}
	
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumeroConto() {
		return this.numeroConto;
	}
	
	public void setNumeroConto(int numeroConto) {
		this.numeroConto = numeroConto;
	}
	
	public String toString() {
		return titolareConto+" "+numeroConto+" "+saldo;
	}
	
	public void versamento(double importo) {
		saldo+=importo;	
	}
	
	public boolean prelievo(double importo) {
		boolean controllo=saldo-importo<0;
		if(saldo>=importo)
			saldo-=importo;
		return controllo;
	}
	
	
	
	
	
	
	
}
