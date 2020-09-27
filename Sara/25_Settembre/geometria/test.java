public class test {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		
		//Crchio
		Cerchio c=new Cerchio(10);
        System.out.println(c);
        
        System.out.println("Raggio: "+c.getRaggio());
        System.out.println("Diametro: "+c.diametro());
        System.out.println("Circonferenza: "+c.circonferenza());
        System.out.println("Area: "+c.area());
		
		//Quadrilatero
        
        Rettangolo r=new Rettangolo(5,10);        
        Quadrato q = new Quadrato(2);
        r.print();
        q.print();
        
        

	}

}
