package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo01 {

	public static void main(String[] args) {

		String nomi[] = { "Luigi", "Mario", "Andrea", "Rosalba", "Carmen" };
		System.out.println("nomi.length= " + nomi.length);

		List<String> lista = new ArrayList<String>();

		for (String nome : nomi) {
			lista.add(nome);
		}

//		lista = Arrays.asList(nomi.clone()); //crea lista a lunghezza fissa, impossibile aggiungere/togliere elementi

		Collections.addAll(lista, nomi);

		lista.remove(3);
		System.out.println("lista.size()= " + lista.size());

		for (String str : lista) {
			System.out.println(str.toUpperCase());
		}

		lista.forEach(x -> System.out.println(x));
	}

}
