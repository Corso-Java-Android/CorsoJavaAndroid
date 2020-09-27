public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		Animale a=new Animale("Alexis");
		System.out.println(a.dorme());
		System.out.println(a.mangia());
		
		//Istanzio Gazzella
		Gazzella zorba=new Gazzella("Zorba");
		System.out.println(zorba.dorme());
		System.out.println(zorba.mangia());
		
		//Istanzio Leone
		Leone simba=new Leone("Simba");
		System.out.println(simba.dorme());
		System.out.println(simba.mangia());
		
		System.out.println(simba.ruggisce());
		System.out.println(zorba.scappa());
		System.out.println(simba.mangia());
	}

}
