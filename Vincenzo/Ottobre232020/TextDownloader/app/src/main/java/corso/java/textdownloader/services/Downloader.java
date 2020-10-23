package corso.java.textdownloader.services;

import java.io.IOException;
import java.io.InputStream;

/**
 * Definizione delle operazioni da implementare.
 */
public interface Downloader {
    /**
     * Carica un testo da uno stream.
     *
     * @param is stream da cui leggere.
     * @return il testo letto dallo stream.
     */
    String load(InputStream is) throws IOException;
}
