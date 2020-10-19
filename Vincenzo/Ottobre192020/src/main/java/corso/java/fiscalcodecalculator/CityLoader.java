package corso.java.fiscalcodecalculator;

import android.os.AsyncTask;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.loader.content.AsyncTaskLoader;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.AsynchronousChannelGroup;
import java.util.ArrayList;
import java.util.List;

import corso.java.fiscalcodecalculator.model.CityModel;

public class CityLoader {

    private final String istatPermalink = "https://www.istat.it/storage/codici-unita-amministrative/Elenco-comuni-italiani.csv";

    private final int ID_FIELD = 4;
    private final int NAME_FIELD = 6;
    private final int AREA_FIELD = 9;
    private final int REGION_FIELD = 10;
    private final int PROVINCE_FIELD = 11;
    private final int CAPITAL_FIELD = 13;
    private final int ACRONYM_FIELD = 14;
    private final int FISCALCODE_FIELD = 19;

    public List<CityModel> load() {
        List<CityModel> result = new ArrayList<>();
//        CityModel napoli = new CityModel.Builder()
//                .withName("Napoli")
//                .withProvince("Napoli")
//                .withAcronym("NA")
//                .build();
//        result.add(napoli);
//
//        CityModel.Builder builder = new CityModel.Builder();
//        builder.withName("Roma");
//        builder.withProvince("Roma").withAcronym("RM");
//        CityModel roma = builder.build();
//        result.add(roma);

        try {
            // 1. apro una connessione con il sito remoto
            // 1.1. creo un riferimento all'URL remoto
            URL url = new URL(istatPermalink);
            // 1.2. apro una connessione
            URLConnection conn = url.openConnection();
            // 1.3. accedo ad un canale di comunicazione con l'endpoint remoto
            //      mi interessa il canale di comunicazione che dal server arriva alla mia app
            //      devo accedere allo inputStream() che la connessione mi mette a disposizione
            //      un reader su uno stream traduce i bytes in qualcos'altro... per esempio stringhe
            // 2. leggo il file ottenuto byte a byte
            // sullo stream leggo solo bytes
            // uno streamreader trasforma i bytes in chars
            InputStreamReader i = new InputStreamReader(conn.getInputStream());
            Log.w("CITYLOADER", "" +
                    ((HttpURLConnection) conn).getResponseCode() + "\t" +
                    ((HttpURLConnection)conn).getContentType() + "\t" +
                    ((HttpURLConnection)conn).getContentLength());
            // un bufferedreader trasforma i chars in stringhe
            BufferedReader r = new BufferedReader(i);
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
                Log.w("CITYLOADER", "" + result.size() + "\t" + name);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
