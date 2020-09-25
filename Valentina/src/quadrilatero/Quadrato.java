package quadrilatero;

public class Quadrato extends Quadrilatero {
    public Quadrato(int lato) {
        super(lato, lato, lato, lato);
    }

    @Override
    public int getArea()
    {
        return lato1*lato1;
    }
}
