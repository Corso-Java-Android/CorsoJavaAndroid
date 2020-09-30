package files;

public class GestoreTrapano {

	public static void main(String[] args) throws Exception {

		Trapano t = new Trapano();
		Trapano t2 = new Trapano();

		PersistenzaTrapano pt = new PersistenzaTrapano();
		String fileName = "data/salvataggio_trapano.obj";
		String fileNameDue = "data/salvataggio_trapanoDue.obj";

		pt.salvaTrapano(t, fileName);
		pt.salvaTrapano(t2, fileNameDue);

		// 1^ fase
		for (int i = 0; i < 5; i++) {
			t.incrementaVelocità();
		}

		

		t.setDirection(Trapano.REVERSE);
		for (int i = 0; i < 3; i++) {
			t.decrementaVelocità();
		}

		pt.salvaTrapano(t, fileName);
		pt.salvaTrapano(t2, fileNameDue);
		
		// 2^ fase
		t.stop();
		System.out.println(t);

		for (int i = 0; i < 10; i++) {
			t.incrementaVelocità();
		}

		t = pt.deserializzaTrapano(fileName);
		System.out.println("Dopo deserializzazione");

		System.out.println(t);

	}

}
