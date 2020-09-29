package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class PersistenzaTrapano {
	public void salvaTrapano(Trapano trapano, String fileName) throws IOException {
		OutputStream os = new FileOutputStream(fileName);
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(trapano);
		oos.close();
		os.close();
	}
	
	
	public Trapano deserializzaTrapano(String fileName) throws IOException, ClassNotFoundException {
		Trapano trapano = null;
		
		InputStream is = new FileInputStream(fileName);
		ObjectInputStream ois = new ObjectInputStream(is);
		//Object o = is.read
		trapano = (Trapano) ois.readObject();
		
		ois.close();
		is.close();
		
		return trapano;
	}
}
