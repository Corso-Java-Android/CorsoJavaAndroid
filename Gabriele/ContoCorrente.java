
public class ContoCorrente {
	
	//ATTRIBUTI
	
	private String titolareConto;
	private double saldo;
	private int numeroConto;
	
	
	//COSTRUTTORE
	
	public ContoCorrente() {
		
	}
	
	public ContoCorrente(String titolareConto, double saldo, int numeroConto) {
		this.setTitolareConto(titolareConto);
		this.setSaldo(saldo);
		this.setNumeroConto(numeroConto);
	}
	
	//METODI
	
	
	
	
	public void setTitolareConto(String titolareConto) {
		this.titolareConto = titolareConto;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void setNumeroConto(int numeroConto) {
		this.numeroConto = numeroConto;
	}
	
	
	
	public String getTitolareConto() {
		return this.titolareConto;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getNumeroConto() {
		return this.numeroConto;
	}
	
	public void versamento(double somma) {
		saldo += somma;
	}
	
	/*
	public void prelievo(double importo) {
		
		if(importo<= saldo) {
			saldo -= importo;
		} else {
			System.out.println("Credito insufficiente");
		}
	}
	
	*/
	
	public boolean prelievo(double importo) {
		//boolean controlloSaldo = false;
		
		if(importo>=saldo) {
			return false;
		}
		saldo -= importo;
		return true;
	}
	
	
	
	
	
	public String toString() {
		return "Titolare Conto: " + this.getTitolareConto() + 
			   "\nSaldo: " + this.getSaldo() + 
			   "\nNumero Conto: " + this.getNumeroConto() + "\n";
	}
	
	

}
