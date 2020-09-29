package files;

import java.io.Serializable;

public class GestoreTrapano  {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Trapano t = new Trapano();
		PersistenzaTrapano pt = new PersistenzaTrapano();
		String fileName = "dati/salvataggioTrapano.obj";
		
		System.out.println(t.isActive());
		
		t.incrementaVelocità(); //500
		t.incrementaVelocità(); //500
		t.decrementaVelocita(); //-500
		//t.decrementaVelocita();
		
		//
		// RENDERE PERSISTENTE L'OGGETTO, SCRIVENDO SU UN FILE LO STATO DELL'OGGETTO
		//
		
		pt.salvaTrapano(t, fileName);
		System.out.println("Dopo la serializzazione");
		
		t.incrementaVelocità();
		t.incrementaVelocità();
		
		t = pt.deserializzaTrapano(fileName);
		System.out.println("Dopo la deserializzazione");
		
		
		System.out.println(t.isActive());
		System.out.println(t.isStopped());
		
	}

}
