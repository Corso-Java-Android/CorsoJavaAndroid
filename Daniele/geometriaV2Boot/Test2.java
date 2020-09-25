package geometriaV2Boot;
import java.util.Random;

import geometriaV2.*;

public class Test2 {

	public static void main(String[] args) {
		Random random = new Random();
		int randomInt=0;
		FiguraGeometrica fg=null;
		
		for(int i=0; i<10; i++) {
			randomInt=random.nextInt(3);
			System.out.println(randomInt);
			switch (randomInt) {
			case 0: fg = new Cerchio(5);
				break;
			case 1: fg = new Quadrato(5);
				break;
			case 2: fg = new Rettangolo(5, 10);
				break;
			default:
				break;
			}
			System.out.println(fg);
		}
	}

}
