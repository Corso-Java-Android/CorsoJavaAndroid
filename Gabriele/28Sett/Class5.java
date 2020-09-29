package bootstrap;

import java.util.Arrays;

import test.PassByValue;

public class Class5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valore = 100;
		int arr[] = {100,200,300};
		int arr2[] = new int[arr.length];
		
		//COPIA DELL'ARRAY>> SHALLOW COPY E'una copia superficiale che sposta gli elemtni in una nuova struttura
		for(int i =0; i<arr.length; i++) {
			arr2[i] = arr[i];
		}
		//OPPURE
		arr2 = arr.clone();
		
		//Per gli oggetti si deve fare una deep copy
		
		
		
		PassByValue pbv = new PassByValue(valore,arr2);   //Se passo un array come parametro non ho la sicurezza che esso non venga modificato
														 //Per ovviare devo creare un nuovo oggetto
		
		System.out.println("Valore: " + valore);
		System.out.println("Array: " + Arrays.toString(arr));
		
		
	}

}
