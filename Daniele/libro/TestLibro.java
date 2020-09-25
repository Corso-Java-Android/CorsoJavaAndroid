package libro;

public class TestLibro {

	public static void main(String[] args) {
		Libro eco = new Libro("Il nome della rosa", "Umberto Eco");

		System.out.println(eco);

		eco.setEditore("Bompiani");
		eco.setPrezzo(10.5);

		Libro diavolo = new Libro("Il diavolo in cattedra", "Piergiorgio Odifreddi", "Einaudi", 12);

		System.out.println(eco);
		System.out.println(diavolo);
	}

}
