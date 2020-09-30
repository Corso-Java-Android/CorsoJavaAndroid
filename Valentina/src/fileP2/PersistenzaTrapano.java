package fileP2;

import java.io.*;

public class PersistenzaTrapano {
    public void salvaTrapano(Trapano trapano, String filename) throws IOException {
        OutputStream os = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(os);

        oos.writeObject(trapano);

        oos.close();
        os.close();
    }

    public Trapano deserializzaTrapano(String filename) throws IOException, ClassNotFoundException {
        Trapano trapano = null;

        InputStream is = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(is);

        Object t = ois.readObject();
        if (t instanceof Trapano)
            trapano = (Trapano) t;

        ois.close();
        is.close();

        return trapano;
    }
}
