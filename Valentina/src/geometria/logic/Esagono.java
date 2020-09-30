package geometria.logic;

public class Esagono extends FiguraGeometrica {

    protected double lato;
    protected static double numeroFisso = 0.866;

    public Esagono(double lato)
    {
        super();
        this.lato = lato;
    }

    public double apotema()
    {
        return numeroFisso*lato;
    }

    @Override
    public double area() {
        return (2.*perimetro()*apotema())/2.;
    }

    @Override
    public double perimetro() {
        return lato*6;
    }
}
