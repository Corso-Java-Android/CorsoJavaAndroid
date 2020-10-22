package corso.java.fiscalcodecalculator.model;

import java.util.Calendar;
import java.util.Date;

public class FiscalCodeCalculatorServiceImpl implements FiscalCodeCalculatorServiceContract {

    private static final String numeri = "0123456789";
    private static final String alfabeto = "ABCDEFGHILJKMNOPQRSTUVWXYZ";

    @Override
    public String calculateFiscalCode(PersonalData input) {
        StringBuilder sb = new StringBuilder()
        .append(handleSurname(input.lastName))
        .append(handleName(input.firstName))
        .append(handleBirthdayAndGender(input.birthday, input.isMale))
        .append(input.birthCityCode);
        sb.append(calculateCheckCode(sb.toString()));
        return sb.toString();
    }

    private String handleSurname(String name) {
        CharacterDiscriminator cd = new CharacterDiscriminator(name);
        return cd.consonants.append(cd.vowels.append("XXX")).substring(0, 3).toString();
    }

    private String handleName(String name) {
        CharacterDiscriminator cd = new CharacterDiscriminator(name);
        if (cd.consonants.length() > 3) // se ci sono più di tre consonanti
            // elimino la seconda
            cd.consonants.replace(1, 2, "");
        return cd.consonants.append(cd.vowels.append("XXX")).substring(0, 3).toString();
    }

    private String handleBirthdayAndGender(Date birthday, boolean isMale) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(birthday);
        final String MONTHS_TABLE = "ABCDEHLMPRST";
        char monthChar = MONTHS_TABLE.charAt(cal.get(Calendar.MONTH));

        int dayvalue = cal.get(Calendar.DAY_OF_MONTH) + (isMale ? 0 : 40);

        return String.format("%ty%c%02d", birthday, monthChar, dayvalue);
    }

    private char calculateCheckCode(String code) {
        int value = 0;
        char[] ch = code.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(i%2==0){  //i è pari quindi il carattere è in posizione dispari
                value += dispari(ch[i]);
            }else{
                value += pari(ch[i]);
            }

        }
        return alfabeto.charAt(value%26);
    }

    private int dispari(char c){
        int[] odds = new int[]{1, 0, 5, 7, 9, 13, 15, 17, 19, 21, 2, 4, 18, 20, 11, 3, 6, 8, 12, 14, 16, 10, 22, 25, 24, 23};
        if(numeri.contains(""+c)) {   //è un intero
            return odds[Integer.parseInt("" + c)];
        }else{   //lettera
            return odds[alfabeto.indexOf(c)];
        }
    }

    private int pari(char c){
        if(numeri.contains(""+c)) {    //è un integer
            return Integer.parseInt("" + c);
        }else {   //è una lettera dell'alfabeto
            return alfabeto.indexOf(c);
        }
    }

}
