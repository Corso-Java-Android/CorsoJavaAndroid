public class OrdineCasualeGenerato {

	public String [] nomi;
//Costruttore	
public OrdineCasualeGenerato(String [] lista){
	nomi=new String [lista.length];
	for(int i=0;i<lista.length;i++) nomi[i]=lista[i];
	
	
}



public void printOrdineCasuale(){
	Random r= new Random(System.currentTimeMillis());
	int cont=0;
	
    while(cont<nomi.length) {
	
		int caso= r.nextInt(nomi.length);
		if(nomi[caso].equals(" ")) continue;
		
		System.out.print((cont+1)+") ");
		System.out.println(nomi[caso]);
		nomi[caso]=" ";
	 	cont++;		
		
	}
}
	
}
