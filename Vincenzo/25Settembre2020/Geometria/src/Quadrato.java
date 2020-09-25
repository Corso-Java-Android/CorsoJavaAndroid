
public class Quadrato extends Quadrilatero {

	public Quadrato(double lato) {
		super(lato, lato, lato, lato);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getArea() {
		return super.lato1*super.lato1;	//Area Quadrato = lato * lato
	}

}
