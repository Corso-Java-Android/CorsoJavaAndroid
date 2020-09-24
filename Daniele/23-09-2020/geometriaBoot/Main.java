package geometriaBoot;

import geometria.*;

public class Main {

	public static void main(String[] args) {
		Cerchio c1 = new Cerchio(5.3);

		System.out.println("C1\nArea: " + c1.area() + "\nPerimetro: " + c1.perimetro());
		System.out.println("Diametro: " + c1.diametro() + "\nRaggio: " + c1.getRaggio());

	}

}
