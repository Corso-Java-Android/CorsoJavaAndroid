package geometria;
/**
 * classe che rappresenta un rettangolo
 * @author enrico
 *
 */
public class Rettangolo { //class sarebbe il progetto. Modello, TIPO

	private double base;
	private double altezza;
	/**
	 * Costruisce un rettangolo a partire da base e altezza
	 * @param base, double base del rettangolo
	 * @param altezza, double altezza del rettangolo
	 */
	public Rettangolo(double base, double altezza){ //costruttore, serve per creare lo stato iniziale dell'ogetto
		this.base= base;
		this.altezza = altezza;
		
	}
	/**
	 * Calcolo perimetro
	 * @return
	 */
	public double perimetro() {return (base+altezza)*2;}
	public double area() {return (base*altezza);}
	
}
	