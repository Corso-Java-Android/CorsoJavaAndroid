package geometria;

public class Rettangolo {
	
	private double base;
	private double altezza;
	
	/**
	 * Costruisce un rettangolo a partire da base e altezza
	 * @param base, double base del  rettangolo
	 * @param altezza, double altezza del rettangolo
	 */
	public Rettangolo(double base, double altezza) {
		this.altezza = altezza;
		this.base = base;
	}
	
	/**
	 * Calcolo del perimetro
	 * @return
	 */
	public double perimetro() {
		return (base + altezza)*2;
	}
	
	public double area() {
		return (base * altezza);
	}
	
}
