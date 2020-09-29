package files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Files02 {

	public static void main(String[] args) throws IOException {
		
		
		
		//SCRITTURA SU FILE
		
		String nomeFile = "dati/FileDiProva2.txt";
		
		FileOutputStream fos = new FileOutputStream(nomeFile);
		PrintWriter fw = new PrintWriter(fos);
		
		for(int i = 0; i<10; i++) {
			fw.write("HelloWord\n");
		}
		
		
		
		fw.close();
		fos.close();
		
		//LETTURA DA FILE
		
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
