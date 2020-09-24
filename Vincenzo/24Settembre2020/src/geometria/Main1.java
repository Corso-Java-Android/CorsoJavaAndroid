package geometria;

public class Main1 {

	public static void main(String[] args) {
		Rettangolo r1 = new Rettangolo(10, 50);
		Rettangolo r2 = new Rettangolo(20, 100);
		
		System.out.println("R1 Area = "+r1.area()+" Perimetro="+r1.perimetro());
		System.out.println("R2 Area = "+r2.area()+" Perimetro="+r2.perimetro());
	}

}
