package casuali;

import java.util.Random;

public class CasualOrder {
    private Object[] objects;
    private int dimension = 0;
    private Random random = new Random(System.currentTimeMillis());

    public CasualOrder(Object[] objects, int dimension)
    {
        this.objects = objects;
        this.dimension = dimension;
    }

    private void swap(Object[] obj, int index1, int index2)
    {
        Object o3 = obj[index1];
        obj[index1] = obj[index2];
        obj[index2] = o3;
    }

    public void printCasual()
    {
        Object[] obj2 = objects.clone();
        int dim = this.dimension;
        for(int i=0; i<obj2.length; i++)
        {
            System.out.print("[" + (i+1) + "] ");
            int index = random.nextInt(dim);
            System.out.println(obj2[index]);

            swap(obj2, index, dim-1);

            dim--;

        }
    }


}
