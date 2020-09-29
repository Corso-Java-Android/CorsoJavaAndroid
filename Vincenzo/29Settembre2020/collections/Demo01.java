package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo01 {

	public static void main(String[] args) {
		String[] nomi = {"Luigi", "Mario", "Andrea", "Rosalba", "Carmen"};
		System.out.println("Nomi.lenght = "+nomi.length);
		List<String> lista = new ArrayList<String>();
		
		for(String nome : nomi) {
			lista.add(nome);
			System.out.println("Lista.size() = "+lista.size());
		}
		List<String> lista2 = Arrays.asList(nomi.clone());	//crea una lista a lunghezza fissa
		
		Collections.addAll(lista, nomi);
		lista.remove(3);
		
		for(int i=0; i<lista2.size(); i++) {
			System.out.println(lista2.get(i));
		}
		
		System.out.println("-------------------");
		
		for(Object o : lista) {
			String str = (String) o;
			System.out.println(str.toUpperCase());
		}
		
		System.out.println("-------------------");
		lista.forEach(x -> {System.out.print(x + " - "); System.out.println(x.toString());});

	}

}
