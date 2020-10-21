package corso.java.fiscalcodecalculator.model;

import java.util.Date;

public class FiscalCodeCalculatorServiceImpl implements FiscalCodeCalculatorServiceContract {

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
        return "AAA";
    }

    private String calculateCheckCode(String toString) {
        return "X";
    }

}
