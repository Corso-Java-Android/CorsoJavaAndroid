package zoo;

public class TestZoo {

	public static void main(String[] args) {

		Leone simba = new Leone("Simba");
		Gazzella g = new Gazzella("Raffaella");
		
		System.out.println(simba.ruggisce());
		System.out.println(g.scappa());
		System.out.println(simba.mangia());
	}

}
