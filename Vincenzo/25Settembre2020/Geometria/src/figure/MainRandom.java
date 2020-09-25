package figure;
import java.util.Random;

public class MainRandom {

	public static void main(String[] args) {
		Random random = new Random(System.currentTimeMillis());
		FiguraGeometrica fig;
		int val;

		for(int i=0;i<10;i++) {
			val = random.nextInt(3);
			switch (val) {
			case 0:
				fig = new Cerchio(2);
				break;
			case 1:
				fig = new Quadrato(2);
				break;

			default:
				fig = new Rettangolo(2, 4);
				break;
			}
			System.out.println(fig);
			System.out.println("Area = "+fig.area());
			System.out.println("========");
		}

	}

}
