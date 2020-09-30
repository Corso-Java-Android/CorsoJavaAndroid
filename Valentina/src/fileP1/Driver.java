package fileP1;

import java.io.*;
import java.util.Random;

public class Driver {
    public static void main(String[] args) throws IOException {

        String path ="dati" + File.separator + "FileDiProva.txt";
        Random random = new Random(System.currentTimeMillis());
        int numero = random.nextInt(100)+20;
        // per scrivere...
        FileOutputStream fos = new FileOutputStream(path);
            PrintWriter fw = new PrintWriter(fos);

            for(int i = 0; i<numero; i++) {
                if(i%2 == 0)
                    fw.write("M'ama " + i + "\n");
                else
                    fw.write("Non m'ama " + i + "\n");
            }
            fw.close();
        fos.close();

        fw = null;
        fos = null;

        // per leggere...
        FileInputStream fis = new FileInputStream(path);
            InputStreamReader isr = new InputStreamReader(fis);
                BufferedReader br = new BufferedReader(isr);

                while (br.ready()){
                    String s = br.readLine();
                    System.out.println(s);
                }
                br.close();
            isr.close();
        fis.close();
    }
}
