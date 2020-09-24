
public class CalcolaCodiceFiscale {

	public static void main(String[] args) throws Exception {
		CodiceFiscale codice = new CodiceFiscale(MetodiAusiliari.inputStringa("Inserisci il Codice Fiscale: "));
		System.out.println(codice.codiceInverso());
		System.out.println(MetodiAusiliari.cf);
	}
	


}
