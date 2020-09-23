
public class ContoCorrente {

// costruttore
	public ContoCorrente(String tc, int nc, double saldo) {
		titolareConto = tc;
		numeroConto = nc;
		this.saldo = saldo;

	}

// Attributi
//	non mettendo un modificatore di visibilità --> public di default	
	private String titolareConto;
	private double saldo;
	private int numeroConto;

// metodi

//return --> restituiscono un valore che il contenuto di getTitolareConto
//un metodo tipato ha bisogno di un return
	public String getTitolareConto() {
		return titolareConto;
	}

	public void setTitolareConto(String tc) {
		titolareConto = tc;
	}

	public int getNumeroConto() {
		return numeroConto;
	}

	public void setNumeroConto(int nc) {
		numeroConto = nc;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setsaldo(double saldo) {
		this.saldo = saldo;
	}

//quando viene visualizzata una freccetta verde significa
//che si fa un override
	public String toString() {
		return titolareConto + " " + numeroConto + " " + saldo;
	}

	public void versamento(double importo) {
		saldo = saldo + importo;

	}

	public void prelievo(double importo) {

		saldo = saldo - importo;
		// System.out.println("L'importo da prelevare è superiore al saldo");

	}

	public Boolean controlloSaldo(double importo) {
		return importo <= saldo;

	}

}
