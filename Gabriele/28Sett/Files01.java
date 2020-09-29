package files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Files01 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String nomeFile = "dati/FileDiProva.txt";
		
		FileOutputStream fos = new FileOutputStream(nomeFile);
		PrintWriter fw = new PrintWriter(fos);
		
		for(int i =0; i<100; i++) {
			fw.write("Sto Scrivendo la riga: "+i);
		}
		
		
		fw.close();
		fos.close();
		
		/*
		byte chrs[] = new byte[256];
		//FileInputStream fis = new FileInputStream(nomeFile);
		int nreads = fis.read(chrs,0,chrs.length);
		while(nreads >0 ) {
			String s = new String(chrs);
			System.out.println(s);
			nreads = fis.read(chrs,0,chrs.length);
		}
		*/
		
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
