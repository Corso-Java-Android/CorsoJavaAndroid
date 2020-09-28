package dati;

import java.io.IOException;

public class GestoreTrapano {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Trapano t = new Trapano();
		Trapano t2 = new Trapano();
		PersistenzaTrapano pt = new PersistenzaTrapano();
		String fileName = "salvataggio-trapano.obj";
		String fileName2 = "salvataggio-trapano2.obj";
		pt.salvaTrapano(t, fileName);
		pt.salvaTrapano(t2, fileName2);
		
		//1a Fase
		for(int i=0;i<5;i++) {t.incrementaVelocita();}
		t2.incrementaVelocita();
		System.out.println(t);
		System.out.println(t2);

		t.setDirection(Trapano.REVERSE);
		for(int i=0;i<3;i++) {t.decrementaVelocita();}
		t2.incrementaVelocita();
		System.out.println(t);
		System.out.println(t2);
		
		//
		// rendere persistente l'oggetto
		//
		pt.salvaTrapano(t, fileName);
		pt.salvaTrapano(t2, fileName2);
		System.out.println("Dopo la serializzazione.");
		//2a fase
		t.stop();
		t2.setDirection(t.REVERSE);
		System.out.println(t);
		System.out.println(t2);
		for(int i=0; i<10; i++) {
			t.incrementaVelocita();
		}
		t2.decrementaVelocita();
		System.out.println(t);
		System.out.println(t2);
		
		t= pt.deserializzaTrapano(fileName);
		t2= pt.deserializzaTrapano(fileName2);
		System.out.println("Dopo la de-serializzazione.");
		System.out.println(t);
		System.out.println(t2);

	}

}
