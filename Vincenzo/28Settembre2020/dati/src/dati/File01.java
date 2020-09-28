package dati;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class File01 {

	public static void main(String[] args) throws IOException {
		String nomeFile = "FileDiProva.txt";
		
		FileOutputStream fos = new FileOutputStream(nomeFile);
		PrintWriter fw = new PrintWriter(fos);
		
		for(int i=0; i<100; i++) {
			fw.write("Sto scrivendo la riga "+i+"\n");
		}
		fw.close();
		fos.close();
		
		fw = null;
		fos = null;
		
		FileInputStream fis = new FileInputStream(nomeFile);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		while(br.ready()) {
			String s = br.readLine();
			System.out.println(s);
		}
		br.close();
		isr.close();
		fis.close();
	}

}
