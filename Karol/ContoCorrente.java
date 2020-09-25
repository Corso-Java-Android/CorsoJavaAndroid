
public class ContoCorrente {
	
	private double saldo;
	private int numeroConto;
	private String titolareConto;
	
	public ContoCorrente(String titolareConto, int numeroConto, double saldo) {
		this.saldo=saldo;
		this.titolareConto=titolareConto;
		this.numeroConto=numeroConto;
	}

	public void setTitolareConto(String titolareConto) {
		this.titolareConto=titolareConto;
	}
	
	public String getTitolareConto() {
		return titolareConto;
	}
	
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public int getNumeroConto() {
		return numeroConto;
	}
	
	public void setNumeroConto(int numeroConto) {
		this.numeroConto =numeroConto;
	}
	
	public String toString() {
		return titolareConto + " " + numeroConto + " " + saldo;
	}
	
	public void versamento(double importo) {
		saldo = saldo + importo;
	}

	public Boolean controlloSaldo(double importo) {
		if(saldo<=importo)
			return false;
		else return true;
	}
	
	public void prelievo(double importo) {
		saldo = saldo - importo;
	}
	
	
	
}
