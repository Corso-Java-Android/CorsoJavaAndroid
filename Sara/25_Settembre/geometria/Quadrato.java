public  class  Quadrato extends Quadrilatero {
	public Quadrato(double lato) {
		super(lato,lato,lato,lato);
	}
	
	public double getArea() {
		return super.lato1*super.lato1;
	}
	 public void print() {
		 System.out.println("Figura geometrica: Quadrato");
		 System.out.println("Lato: "+super.lato1);
		 super.print();
		 
	 }
	
}
