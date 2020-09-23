
public class ContoCorrente {
	//Costruttore
	public ContoCorrente(String tc, int nc, double saldo) {
		titolareConto = tc;
		numeroConto = nc;
		this.saldo = saldo;
	}

	//Attributi
	private String titolareConto;
	private double saldo;
	private int numeroConto;

	//Metodi
	public String getTitolareConto() {
		return titolareConto;
	}
	public void setTitolareConto(String titolareConto) {
		this.titolareConto = titolareConto;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getNumeroConto() {
		return numeroConto;
	}
	public void setNumeroConto(int numeroConto) {
		this.numeroConto = numeroConto;
	}

	public String toString() {
		return titolareConto + " " + numeroConto + " " + saldo;
	}

	public void versamento(double importo) {
		saldo = saldo+importo;
	}

	public void prelievo(double importo) {
			saldo = saldo-importo;
	}
	
	public Boolean controlloSaldo(double importo) {
		return importo<=saldo;
	}

}
