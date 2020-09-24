package geometria;

public class Rettangolo {

	private double base;
	private double altezza;

	/**
	 * Costruisce un rettangolo a partire da base e altezza
	 * 
	 * @param base,    double base del rettangolo
	 * @param altezza, double altezza del rettangolo
	 */
	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}

	/**
	 * Calcolo del perimetro
	 * @return il perimetro del rettangolo
	 */
	public double perimetro() {
		return (base + altezza) * 2;
	}

	public double area() {
		return base * altezza;
	}

}
