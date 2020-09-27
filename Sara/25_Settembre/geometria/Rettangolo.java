public class Rettangolo extends Quadrilatero {
	
	
	public Rettangolo(double base, double altezza) throws Exception {
		super(base,base,altezza,altezza);
		if(base==altezza) throw new Exception("Base ed altezza devono essere diverse");
	}
   public double getArea() {
	   //Base per altezza
	  
	   return super.lato1 * super.lato3;
   }

 public void print() {
	 System.out.println("Figura geometrica: Rettangolo");
	 System.out.println("Base: "+super.lato1);
	 System.out.println("Altezza: "+super.lato3);
	 super.print();
	 
 }
