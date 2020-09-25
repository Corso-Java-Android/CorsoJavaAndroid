package geometriaV2;

public abstract class Quadrilatero extends FiguraGeometrica {

	protected double latoUno;
	protected double latoDue;
	protected double latoTre;
	protected double latoQuattro;

	public Quadrilatero(double latoUno, double latoDue, double latoTre, double latoQuattro) {
		this.latoUno = latoUno;
		this.latoDue = latoDue;
		this.latoTre = latoTre;
		this.latoQuattro = latoQuattro;
	}

	public double getPerimetro() {
		return latoUno + latoDue + latoTre + latoQuattro;
	}

	public abstract double getArea();

}