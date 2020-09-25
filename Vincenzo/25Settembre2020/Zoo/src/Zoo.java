
public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animale a = new Animale("Michele");
		System.out.println(a.Dorme());
		System.out.println(a.Mangia());

		//Istanzio un Leone
		Leone simba = new  Leone("Simba");
		System.out.println(simba.Dorme());
		System.out.println(simba.Mangia());

		//Istanzio una gazzella
		Gazzella maria = new  Gazzella("Maria");
		System.out.println(maria.Dorme());
		System.out.println(maria.Mangia());
		
		System.out.println(simba.Ruggisce());
		System.out.println(maria.Scappa());
		System.out.println(simba.Mangia());
	}

}
