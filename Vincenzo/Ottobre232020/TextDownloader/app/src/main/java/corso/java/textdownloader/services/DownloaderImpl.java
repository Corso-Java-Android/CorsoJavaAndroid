package corso.java.textdownloader.services;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Implementazione del sistema di lettura di un file.
 */
public class DownloaderImpl implements Downloader {
    /**
     * Carica un testo da uno stream.
     *
     * @param is stream da cui leggere.
     * @return il testo letto dallo stream.
     */
    @Override
    public String load(InputStream is) throws IOException {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader r = new BufferedReader(new InputStreamReader(is))) {
            String line = null;
            while ((line = r.readLine()) != null) {
                sb.append(r.readLine());
            }
        }
        return sb.toString();
    }
}
