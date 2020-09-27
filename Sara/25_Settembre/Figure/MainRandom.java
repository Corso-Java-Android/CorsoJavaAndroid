import java.util.Random;

public class MainRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r= new Random(System.currentTimeMillis());
		FiguraGeometrica geo;
		int val;
		
		for(int i=0; i<10;i++){
			val=r.nextInt(3)+1;
			
			
			switch(val){
				case 1:{ //Cerchio 
						geo=new Cerchio(2);
						break;}
				case 2:{//Quadrato
						geo=new Quadrato(2);
						break;}
				default:{//Rettangolo
						geo=new Rettangolo(2,4);
						break;}
				
			}
			
			System.out.println(geo);
			System.out.println("Area="+geo.area());
			System.out.println("Perimetro="+geo.perimetro());
			System.out.println("****************************************");
			
			
		}

	}

}
