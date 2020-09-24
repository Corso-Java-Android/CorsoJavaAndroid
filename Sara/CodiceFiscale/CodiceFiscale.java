
public class CodiceFiscale {
//Attributi
int annoNascita=0;
int meseNascita=0;
int giornoNascita=0;
String sesso;
int eta=0;

public CodiceFiscale() {
	
}

public int annoNascita(String cf) {
	 annoNascita=Integer.parseInt(cf.substring(6, 8));
	if(annoNascita>=20) annoNascita +=1900;
	else annoNascita+=2000;
	return annoNascita;
	
}

public int meseNascita(String cf) {
	switch(cf.substring(8, 9)) {
	case "A":{meseNascita=1;
	          break;
	         }
	case "B":{meseNascita=2;
               break;
              }
	case "C":{meseNascita=3;
              break;
             }
	case "D":{meseNascita=4;
               break;
              }
	case "E":{meseNascita=5;
               break;
              }
    case "H":{meseNascita=6;
               break;
            }
    case "L":{meseNascita=7;
               break;
             }
    case "M":{meseNascita=8;
               break;
             }
    case "P":{meseNascita=9;
    			break;
    		}
    case "R":{meseNascita=10;
    			break;
    		}
    case "S":{meseNascita=11;
    			break;
    			}
    case "T":{meseNascita=12;
    			break;
    			}		
	}
	return meseNascita;
}

public int giornoNascita(String cf) {
	 giornoNascita=Integer.parseInt(cf.substring(9, 11));
	if(giornoNascita>40) {giornoNascita -= 40;
	 sesso="Femmina";}
	else sesso="Maschio";
    return giornoNascita;		
	}


public String sesso(String cf) { 
	if(sesso==null) giornoNascita(cf);
	return sesso;}

public int eta(String cf) {
	if(annoNascita==0) annoNascita(cf);
	return eta=2020-annoNascita;
}

public void newCodFiscale(String cf){
	meseNascita(cf);
	giornoNascita(cf);
	annoNascita(cf);
	sesso(cf);
	eta(cf);
}

public boolean lunghezza(String cf) {
	
	return cf.length()==16;	

}

public String soluzione() {
	return "Sei nato il "+giornoNascita+"-"+meseNascita+"-"+annoNascita+" quindi hai "+eta+" e sei "+sesso;
}


}
