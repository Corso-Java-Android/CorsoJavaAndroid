import java.util.Random;


public class MorraCinese {
    private int challenges=0;
	private int wonPc=0;
    private int wonPlayer=0;

    //Costruttore
    public MorraCinese() {}    
    
    //Get
    public int getChallenges() {return challenges;}
    public int getWonPc() {return wonPc;}
    public int getWonPlayer() {return wonPlayer;}
    
    //Incrementa variabili
    public void addChallenges() {challenges++;}
    public void addWonPc() {wonPc++;};
    public void addWonPlayer() {wonPlayer++;};
    
    //Genera numero random -La scelta del pc
    public int playPc() {
    	Random r= new Random();
    	return r.nextInt(3)+1;
    			
    }
    
   //Significato giocata
    public String getMorra(int play) {
    	String result="";
    	switch(play) {
    	case 1:{ result="Sasso";
    		     break;}
    	case 2:{ result="Carta";
    		     break;}
    	case 3:{ result="Forbici";
    		     break;}
    	
    	}
    	
    	return result;
    }
    

    public void controlWinPcPlayer(int playPlayer) {
    	int playPc=playPc(); //Giocata Pc
    	System.out.println("Il Pc ha scelto "+getMorra(playPc));
    	//Restituisce chi ha vinto
    	String result=controlWin(playPlayer,playPc);
    	addChallenges();
    	printResult(result);
	
    }

public String controlWin(int playPlayer, int playPc) {
	  String result="Pc";
	  if(playPlayer!=playPc) {
	  switch(playPlayer) {
	  case 1:{//Sasso Batte forbici
		      if(playPc==3) result="Player";
		      
	         break;}
	  case 2:{//Carta batte sasso
		  if(playPc==1) result="Player"; 
	         break;}
	  case 3:{//Forbici batte carta
		  if(playPc==2) result="Player";
	         break;}
	      }
	  }
	  else result="Equal";
	  return result;
	  
}
    
    
    
    
    
//Stampa
    public void menu() {
          System.out.println("Sceglia tra: (1)Sasso (2)Carta (3)Forbici:");	
    }    

    public void menu(int winPc, int winPlayer) {
    	System.out.println("Vittorie Pc: "+winPc);
    	System.out.println("Vittorie Giocatore: "+winPlayer);
    	menu();
    }
//Stampa chi ha vinto 
    public void printWin(String win){
    	
    	System.out.println("Ha vinto il "+(win.equals("Pc")?"Pc":"Giocatore"));
    }
//Stampa il risultato della giocata
    public void printResult(String result) {
    	if(result.equals("Equal")) {System.out.println("Pareggio, avete fatto la stessa giocata");
    	                           menu(wonPc, wonPlayer);
    							   }
    	else { printWin(result);
    		   
    	       if(result.equals("Pc")) addWonPc();
    		   else addWonPlayer();
    		   
    	       //Stampa riepilogo se nessuno dei due giocatori è arrivato a 5 vittorie
    		   if(wonPc<5 && wonPlayer<5) menu(wonPc,wonPlayer);    		                     
		  

    		
    	     }
    	
    }

}
