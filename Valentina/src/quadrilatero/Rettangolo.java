package quadrilatero;

public class Rettangolo extends Quadrilatero {

    public Rettangolo(int base, int altezza) {
        super(base, altezza, base, altezza);
    }

    @Override
    public int getArea()
    {
        return lato1*lato2;
    }
}
