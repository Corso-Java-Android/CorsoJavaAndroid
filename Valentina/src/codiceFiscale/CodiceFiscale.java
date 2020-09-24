package codiceFiscale;
/*
Dato in input un codice fiscale:
es. NNNCCC 66C11 C111C
estrarre dalla 7 (6 pos) cifra alla 11 (10 pos):

Un codice fiscale ha:
Giorno di nascita
Mese di nascita
Anno di nascita
Sesso
Eta
 */
public class CodiceFiscale {
    int giorno;
    String mese;
    int anno;
    String sesso;
    int eta;

    public CodiceFiscale(String codice)
    {
        // avevo fretta
        if(codice.length() > 16)
            System.exit(-1);

        int giornoN = Integer.parseInt(codice.substring(9,11));
        setGiorno(giornoN>40? giornoN-40:giornoN);
        setMese(codice.charAt(8));
        setAnno(1900 + Integer.parseInt(codice.substring(6,8)));
        setSesso(giornoN>40? "FEMMINA":"MASCHIO");
        eta = 2020 - anno;
    }

    private void setMese(char c) {
        switch (c)
        {
            case 'A':
                mese = "Gennaio";
                break;
            case 'B':
                mese = "Febbraio";
                break;
            case 'C':
                mese = "Marzo";
                break;
            case 'D':
                mese = "Aprile";
                break;

            case 'E':
                mese = "Maggio";
                break;
            case 'H':
                mese = "Giugno";
                break;
            case 'L':
                mese = "Luglio";
                break;
            case 'M':
                mese = "Agosto";
                break;

            case 'P':
                mese = "Settembre";
                break;
            case 'R':
                mese = "Ottobre";
                break;
            case 'S':
                mese = "Novembre";
                break;
            case 'T':
                mese = "Dicembre";
                break;
        }
    }

    public int getGiorno() {
        return giorno;
    }

    public void setGiorno(int giorno) {
        this.giorno = giorno;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public String getMese() {
        return mese;
    }

    public void setMese(String mese) {
        this.mese = mese;
    }

    @Override
    public String toString() {
        return "CodiceFiscale{" +
                "giorno=" + giorno +
                ", mese='" + mese + '\'' +
                ", anno=" + anno +
                ", sesso='" + sesso + '\'' +
                ", eta=" + eta +
                '}';
    }
}
