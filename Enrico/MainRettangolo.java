package geometria;

public class MainRettangolo {
	public static void main(String[] args) {
		Rettangolo r1 = new Rettangolo(6, 12); // la parola new istanzia il rettangolo. lo rende disponobile
		Rettangolo r2 = new Rettangolo(20, 20);
		Cerchio c1 = new Cerchio(3);
		System.out.println("R1 Area=" + r1.area() + " Perimetro=" + r1.perimetro());
		System.out.println("R2 Area=" + r2.area() + " Perimetro=" + r2.perimetro());
		System.out.println("C1 Area=" + c1.area() + " Perimetro=" + c1.perimetro());

		
	}
}
