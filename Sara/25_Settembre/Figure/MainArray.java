import java.util.Random;


public class MainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r=new Random(System.currentTimeMillis());
		int val;
		FiguraGeometrica [] geo= new FiguraGeometrica[10];
		
		for(int i=0;i<geo.length;i++){
			val=r.nextInt(3)+1;
			
			switch(val){
			case 1:{//Cerchio
				    geo[i]=new Cerchio(2);
					break;
					}
			case 2:{//Quadrato
				    geo[i]=new Quadrato(2);
					break;
				}
			default:{//Rettangolo
					geo[i]=new Rettangolo(2,4);
				break;
				}
			}
			
			System.out.println(geo[i]);
			System.out.println("Area: "+geo[i].area());
			System.out.println("Perimetro"+geo[i].perimetro());
			System.out.println("*************************************************");
		}
		
	}

}
