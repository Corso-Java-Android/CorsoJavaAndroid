import java.util.Scanner;

public class playMain {

	public static void main(String[] args) {
		   Scanner in= new Scanner(System.in);
		   MorraCinese mr=new MorraCinese();
		   
		   while(mr.getWonPc()<5 && mr.getWonPlayer()<5){
			  if(mr.getChallenges()==0) mr.menu();
			  //else mr.menu(mr.getWonPc(),mr.getWonPlayer());
			  int playPlayer= in.nextInt();
			  
			  if(playPlayer>3) System.out.println("Non hai digitato il numero corretto!");
			  else {//Hai digitato correttamente                 			  
			        mr.getMorra(playPlayer);
			        System.out.println("Hai scelto "+mr.getMorra(playPlayer));
			        mr.controlWinPcPlayer(playPlayer);
			  }
		   }
		
    in.close();
	}

}
