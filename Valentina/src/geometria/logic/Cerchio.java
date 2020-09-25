package geometria.logic;


public class Cerchio {
    private double raggio = 1;

    /**
     * prova
     */
    public Cerchio() {

    }

    public Cerchio(double raggio) {
        if(raggio > 0)
            this.raggio = raggio;
    }

    public double area() {
        return Math.PI*raggio*raggio;
    }

    public double circonferenza() {
        return 2*Math.PI*raggio;
    }

    public double getDiametro()
    {
        return raggio*2;
    }

    public double getRaggio() {
        return raggio;
    }
}
