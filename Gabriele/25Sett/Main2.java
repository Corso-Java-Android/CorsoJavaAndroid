package geometria;

import java.util.Random;

public class Main2 {

	public static void main(String[] parametri) {
		
		Random random = new Random();
		
		for(int i = 0; i<parametri.length; i++) {
			System.out.println("#CELLA " + i + " = " +  parametri[i]);
		}
		
		int array[] = new int[10];
		
		for(int i = 0; i<array.length; i++) {
			
			array[i] = random.nextInt(10);
			
			System.out.println(array[i]);
		}
		
		Figurageometrica array1[] = new Figurageometrica[10];
		
		for(int i = 0; i<array1.length; i++) {
			System.out.println(array1[i]);
		}
		
		
		System.exit(0);
		
		Random rand = new Random();
		
		for(int i =0; i<10; i++) {
			
			int z = rand.nextInt(3);
			Figurageometrica fg = null;
			
			System.out.println("Il pc ha scelto: " + z);
			
			/*
			
			if( z == 0) {
				Cerchio cerc = new Cerchio(5);
				System.out.println("E' stato creato un " + cerc + "\n");
			} else if(z == 1 ) {
				Quadrato quad = new Quadrato(10);
				System.out.println("E' stato creato un " + quad + "\n");
			} else {
				Rettangolo rett = new Rettangolo(10, 5);
				System.out.println("E' stato creato un " + rett + "\n");
			}
			
			
			
			switch(z) {
			case 0: 
				Cerchio cerc = new Cerchio(5);
				System.out.println("E' stato creato un " + cerc + "\n");
				break;
			case 1:
				Quadrato quad = new Quadrato(10);
				System.out.println("E' stato creato un " + quad + "\n");
				break;
			case 2:
				Rettangolo rett = new Rettangolo(10, 5);
				System.out.println("E' stato creato un " + rett + "\n");
			}
			
			*/
			
			switch(z) {
			case 0: 
				fg = new Cerchio(5);
				System.out.println("E' stato creato un " + fg + "");
				break;
			case 1:
				fg = new Quadrato(10);
				System.out.println("E' stato creato un " + fg + "");
				break;
			case 2:
				fg =  new Rettangolo(10, 5);
				System.out.println("E' stato creato un " + fg + "");
			}
			
			//System.out.println(fg);
			System.out.println("L'area è: " + fg.area() + "\nIl perimetro è: " + fg.perimetro() + "\n");
			
			//Incapsulamento: capacità di racchiudere dentro un contenitore dati e metodi che lavorano sui dati stessi
			
			//Ereditarietà: capacità di creare dei livelli e gerarchie tra le classi. Consente di definire in maniera differente
			//i comportamenti della classe più elevata(padre)
			
			//Polimorfismo: capacità di maneggiare gli oggetti ad alto livello(come in questo caso 
			//ottenendone il comportamento specifico in fase di istanza
			//ci permette di usare il telefono indipendentemente se sia iphone, samsung o altro

		}

	}

}


//Array è una sequenza di una serie di variabili
