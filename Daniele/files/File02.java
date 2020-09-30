package files;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class File02 {

	public static void main(String[] args) throws IOException {
		
		String nomeFile= "data/fileProva2.txt";
		
		FileOutputStream file = new FileOutputStream(nomeFile);
		PrintWriter print = new PrintWriter(file);

		print.write("Ciao!\nQuesto file è stato scritto tramite print.write!");

		print.close();
		file.close();

		FileInputStream fileToRead = new FileInputStream(nomeFile);
		InputStreamReader inputStream = new InputStreamReader(fileToRead);
		BufferedReader buffer = new BufferedReader(inputStream);
		
		while (buffer.ready()) {
			String s = buffer.readLine();
			System.out.println(s);
		}

		buffer.close();
		inputStream.close();
		fileToRead.close();
		
		
		
		
	}

}
