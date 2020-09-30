package geometria.logic;

public class Rettangolo extends FiguraGeometrica{
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public double perimetro()
    {
        return (base+altezza)*2;
    }

    @Override
    public double area()
    {
        return base*altezza;
    }
}