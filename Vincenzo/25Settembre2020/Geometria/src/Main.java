
public class Main {

	public static void main(String[] args) throws Exception {
		//Creo un Quadrato
		Quadrato q = new Quadrato(2);
		System.out.println("Perimetro Quadrato: "+q.getPerimetro());
		System.out.println("Area Quadrato: "+q.getArea());
		//Creo un Rettangolo
		Rettangolo r = new Rettangolo(4, 2);
		System.out.println("Perimetro Rettangolo: "+r.getPerimetro());
		System.out.println("Area Rettangolo: "+r.getArea());

	}

}
