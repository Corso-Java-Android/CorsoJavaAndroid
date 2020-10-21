package corso.java.fiscalcodecalculator.persistence;

import android.util.Log;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

import corso.java.fiscalcodecalculator.model.CityModel;

public class CityLoader {

    //private final static  String istatPermalink = "https://www.istat.it/storage/codici-unita-amministrative/Elenco-comuni-italiani.csv";

    private final static int ID_FIELD = 4;
    private final static int NAME_FIELD = 6;
    private final static int AREA_FIELD = 9;
    private final static int REGION_FIELD = 10;
    private final static int PROVINCE_FIELD = 11;
    private final static int CAPITAL_FIELD = 13;
    private final static int ACRONYM_FIELD = 14;
    private final static int FISCALCODE_FIELD = 19;

    /**
     * Carica l'elenco delle città da uno stream di bytes.
     * @param s stream da cui leggere.
     * @return l'elenco delle città presenti nello stream.
     */
    public List<CityModel> load(InputStream s) {
        List<CityModel> result = new ArrayList<>();
        try {
//            // 1. apro una connessione con il sito remoto
//            // 1.1. creo un riferimento all'URL remoto
//            URL url = new URL(istatPermalink);
//            // 1.2. apro una connessione
//            URLConnection conn = url.openConnection();
//            // 1.3. accedo ad un canale di comunicazione con l'endpoint remoto
//            //      mi interessa il canale di comunicazione che dal server arriva alla mia app
//            //      devo accedere allo inputStream() che la connessione mi mette a disposizione
//            //      un reader su uno stream traduce i bytes in qualcos'altro... per esempio stringhe
//            // 2. leggo il file ottenuto byte a byte
//            // sullo stream leggo solo bytes
//            // uno streamreader trasforma i bytes in chars
            InputStreamReader i = new InputStreamReader(s);
            // un bufferedreader trasforma i chars in stringhe
            // TRY WITH RESOURCE - utilizzabili con classi Closeable
//            Closeable c = new Closeable() {
//                @Override
//                public void close() throws IOException {
//
//                }
//            };
            try (BufferedReader r = new BufferedReader(i)) { // BufferedReader fa da WRAPPER su InputStreamReader
                String nextLine = null;
                int headerLines = 3;
                while (headerLines-- > 0) r.readLine(); // leggo (e scarto) le righe di intestazione

                while ((nextLine = r.readLine()) != null) { // questa è la PROSSIMA riga utile del file
                    // devo scompormi la riga in tutti i campi che ottengo separando i ;
                    // il metodo split() di una stringa separa la stringa secondo una regola di
                    //           individuazione di un separatore e restituisce un array di String
                    //           nel quale ci sono tutti i "pezzi" della stringa originaria!
                    String[] fields = nextLine.split(";");
                    long id = Long.parseLong(fields[ID_FIELD]);
                    String name = fields[NAME_FIELD];
                    String area = fields[AREA_FIELD];
                    String region = fields[REGION_FIELD];
                    String province = fields[PROVINCE_FIELD];
                    boolean capital = fields[CAPITAL_FIELD].charAt(0) == '1';
                    String acronym = fields[ACRONYM_FIELD];
                    String fc = fields[FISCALCODE_FIELD];
                    CityModel c = new CityModel.Builder()
                            .withId(id).withAcronym(acronym).withArea(area).withFiscalCode(fc).withName(name)
                            .withProvince(province).withRegion(region).isCapital(capital)
                            .build();
                    result.add(c);
                }
            }
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
