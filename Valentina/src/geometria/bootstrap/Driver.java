package geometria.bootstrap;

import geometria.logic.Cerchio;
import geometria.logic.FiguraGeometrica;
import geometria.logic.Quadrato;
import geometria.logic.Rettangolo;

import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        for(int i=0; i<args.length; i++)
            System.out.println(args[i]);

        Random random = new Random(System.currentTimeMillis());
        FiguraGeometrica fg = null;
        for(int i=0; i<10; i++)
        {
            switch (random.nextInt(3))
            {
                case 0:
                    fg = new Cerchio(random.nextDouble()+5);
                break;

                case 1:
                    fg = new Quadrato(random.nextDouble()+5);
                    break;

                default:
                    fg = new Rettangolo(random.nextDouble()+5,
                            random.nextDouble()+5);
                    break;

            }
            System.out.println(fg.perimetro());
        }

    }
}
