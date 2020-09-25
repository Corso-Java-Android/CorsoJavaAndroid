package geometriaV2Boot;

import geometriaV2.*;

public class TestGeometriaV2 {

	public static void main(String[] args) {

		Quadrato q = new Quadrato(5.0);

		System.out.println("Area quadrato :" + q.getArea() + "\tPerimetro quadrato: " + q.getPerimetro());

		Rettangolo r = new Rettangolo(2.1, 3.5);

		System.out.println("Area rettangolo: " + r.getArea() + "\tPerimetro rettangolo: " + r.getPerimetro());

		Cerchio c = new Cerchio(2);

		System.out.println("Area cerchio: " + c.getArea() + "\tCirconferenza cerchio: " + c.getPerimetro()
				+ "\tDiametro: " + c.getDiametro());
		
	}

}
