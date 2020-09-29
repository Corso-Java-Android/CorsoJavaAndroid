package collections;

import java.util.List;
import java.util.ArrayList;


public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] nomi= {"Luigi","Mario","Peach","Yoshi","Browser"};
		
		List lista=new ArrayList();
		
		List <String> lista2= new <String> ArrayList();
		
		for (String nome: nomi) {
			lista.add(nome);
			lista2.add(nome);
			System.out.println("->"+lista.size());
		}
		
		System.out.println("**************************");
		for(String str:lista2){
			System.out.println(str.toUpperCase());
		}
		System.out.println("**************************");	
		
		System.out.println("Grandezza Lista:"+lista.size());
		
		for(int i=0; i<lista.size();i++){
			System.out.println(lista.get(i));
		}
		
		for(Object o:lista){
			System.out.println("Object:"+o);
		}
		lista.remove(4);
		System.out.println("************************************");
		//Lamda Expression
		lista.forEach((x)->{System.out.print(x+" -");System.out.println("Ciao "+x.toString());});
 
 
	}

}
