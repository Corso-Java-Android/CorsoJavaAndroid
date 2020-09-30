package fileP2;

import java.io.File;

public class GestoreTrapano {
    public static void main(String[] args) throws Throwable{
        Trapano trapano = new Trapano();
        Trapano trapano1 = new Trapano();

        PersistenzaTrapano persistenzaTrapano = new PersistenzaTrapano();
        String filename = "dati" + File.separator + "trapanoShot.obj";
        String filename1 = "dati" + File.separator + "trapano1Shot.obj";

        for(int i=0; i<5; i++) {
            trapano.incrementaVelocita();
            trapano1.incrementaVelocita();
        }
        System.out.println("post Incrementa: " + trapano);
        System.out.println("post Incrementa: " + trapano1);

        trapano.setDirection(Trapano.REVERSE);
        for (int i=0; i<3; i++){
            trapano.decrementaVelocita();
            trapano1.incrementaVelocita();
        }
        System.out.println("post Decrementa: " + trapano);
        System.out.println("post Incrementa: " + trapano1);

        // rendere persistente l'oggetto
        System.out.println();
        System.out.println("Prima della serializzazione");
        System.out.println(trapano);
        System.out.println(trapano1);

        persistenzaTrapano.salvaTrapano(trapano,filename);
        persistenzaTrapano.salvaTrapano(trapano1,filename1);

        System.out.println("Dopo la serializzazione");
        System.out.println();

        trapano.stop();
        System.out.println("Stop trapano: " + trapano);

        // inizio secondo giro...
        for(int i=0; i<10; i++){
            trapano.incrementaVelocita();
            trapano1.decrementaVelocita();
        }

        System.out.println("post Incrementa: " + trapano);
        System.out.println("post Decrementa: " + trapano1);

        trapano1.stop();
        System.out.println("Stop trapano1: " + trapano1);

        trapano = persistenzaTrapano.deserializzaTrapano(filename1);
        trapano1 = persistenzaTrapano.deserializzaTrapano(filename);
        System.out.println("Dopo la deserializzazione");
        System.out.println(trapano);
        System.out.println(trapano1);
    }
}
