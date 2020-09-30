package files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class File01 {

	public static void main(String[] args) throws IOException {
		String nomeFile = "data/FileProva.txt";

		FileOutputStream fos = new FileOutputStream(nomeFile);
		PrintWriter pw = new PrintWriter(fos);

		for (int i = 0; i < 100; i++) {
			pw.write("Sto scrivendo la riga " + (i + 1) + "\n");
		}

		pw.close();
		fos.close();

		FileInputStream fis = new FileInputStream(nomeFile);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader bf = new BufferedReader(isr);
		while (bf.ready()) {
			String s = bf.readLine();
			System.out.println(s);
		}

		bf.close();
		isr.close();
		fis.close();
	}

}
