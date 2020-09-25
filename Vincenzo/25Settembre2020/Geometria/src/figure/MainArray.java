package figure;

import java.util.Random;

public class MainArray {

	public static void main(String[] args) {
		Random random = new Random(System.currentTimeMillis());
		FiguraGeometrica[] figure = new FiguraGeometrica[10];
		int val;

		for(int i=0;i<figure.length;i++) {
			val = random.nextInt(3);
			switch (val) {
			case 0:
				figure[i] = new Cerchio(12);
				break;
			case 1:
				figure[i] = new Quadrato(10);
				break;

			default:
				figure[i] = new Rettangolo(23, 12);
				break;
			}
			System.out.println("*****"+i);
			System.out.println(figure[i]);
			System.out.println("Area = "+figure[i].area());
			System.out.println("Perimetro = "+figure[i].perimetro());
			System.out.println("========");
		}

	}

}
