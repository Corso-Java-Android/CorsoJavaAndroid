package dati;

import java.io.IOException;

public class GestoreTrapano {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Trapano t = new Trapano();
		PersistenzaTrapano pt = new PersistenzaTrapano();
		String fileName = "salvataggio-trapano.obj";
		
		
		//1a Fase
		for(int i=0;i<5;i++) {t.incrementaVelocita();}
		System.out.println(t);

		t.setDirection(Trapano.REVERSE);
		for(int i=0;i<3;i++) {t.decrementaVelocita();}
		System.out.println(t);
		
		//
		// rendere persistente l'oggetto
		//
		pt.salvaTrapano(t, fileName);
		System.out.println("Dopo la serializzazione.");
		//2a fase
		t.stop();
		System.out.println(t);
		for(int i=0; i<10; i++) {
			t.incrementaVelocita();
		}
		System.out.println(t);
		
		t= pt.deserializzaTrapano(fileName);
		System.out.println("Dopo la de-serializzazione.");
		System.out.println(t);

	}

}
