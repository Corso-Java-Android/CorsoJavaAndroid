package quadrilatero;

public abstract class Quadrilatero {
    protected int lato1;
    protected int lato2;
    protected int lato3;
    protected int lato4;


    public Quadrilatero(int lato1, int lato2, int lato3, int lato4) {
        this.lato1 = lato1;
        this.lato2 = lato2;
        this.lato3 = lato3;
        this.lato4 = lato4;
    }

    public int getPerimetro()
    {
        return lato1 + lato2 + lato3 + lato4;
    }

    public abstract int getArea();
}
