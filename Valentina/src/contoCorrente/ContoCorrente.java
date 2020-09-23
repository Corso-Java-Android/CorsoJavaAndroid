package contoCorrente;

public class ContoCorrente {
    // Attributi
    public String titolareConto;
    public double saldo;
    public int numeroConto;

    // Contruttore
    public ContoCorrente()
    {}

    public ContoCorrente(String tc, double s, int nc)
    {
        titolareConto = tc;
        saldo = s;
        numeroConto = nc;
    }

    // Metodi
    public void versamento(double importo)
    {
        saldo += importo;
    }

    public boolean prelevi(double importo)
    {
        if(saldo >= importo) {
            saldo -= importo;
            return true;
        }
        return false;
    }

    // Get e Set
    public String getTitolareConto() {
        return titolareConto;
    }

    public void setTitolareConto(String titolareConto) {
        this.titolareConto = titolareConto;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConto() {
        return numeroConto;
    }

    public void setNumeroConto(int numeroConto) {
        this.numeroConto = numeroConto;
    }

    @Override
    public String toString() {
        return "ContoCorrente{" +
                "titolareConto='" + titolareConto + '\'' +
                ", saldo=" + saldo +
                ", numeroConto=" + numeroConto +
                '}';
    }
}
