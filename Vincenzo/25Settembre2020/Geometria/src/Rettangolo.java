
public class Rettangolo extends Quadrilatero {

	public Rettangolo(double base, double altezza) throws Exception {
		super(base, base, altezza, altezza);
		if(base==altezza)
			throw new Exception("Base ed altezza devono essere diverse!");
	}

	@Override
	public double getArea() {
		// Base * Altezza
		return super.lato1*super.lato3;
	}

}
