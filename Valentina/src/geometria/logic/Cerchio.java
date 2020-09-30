package geometria.logic;


public class Cerchio extends FiguraGeometrica {
    private double raggio = 1;

    public Cerchio() {

    }

    public Cerchio(double raggio) {
        if(raggio > 0)
            this.raggio = raggio;
    }

    @Override
    public double area() {
        return Math.PI*raggio*raggio;
    }

    @Override
    public double perimetro(){ return circonferenza(); }

    public double circonferenza() { return 2*Math.PI*raggio; }

    public double getDiametro()
    {
        return raggio*2;
    }

    public double getRaggio() {
        return raggio;
    }
}
