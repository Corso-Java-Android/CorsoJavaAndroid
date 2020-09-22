import java.util.*;
import java.lang.*;
public class Or 
     {public static void main(String[] args)
          { Scanner in=new Scanner(System.in);
            System.out.println("Digita una linea di testo: ");
            String linea=in.nextLine();
            int contaVocali=0;
            for(int i=0; i<linea.length();i++)
                { char c=linea.charAt(i);
                  if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') contaVocali++;
                 } 
             System.out.println("Numero di vocali: "+contaVocali);
          }
       } 
            
 
