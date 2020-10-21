package corso.java.fiscalcodecalculator.model;

public class CharacterDiscriminator {
    public final StringBuilder consonants;
    public final StringBuilder vowels;

    public CharacterDiscriminator(String input){
        consonants = new StringBuilder();
        vowels = new StringBuilder();
        input = input.toUpperCase();
        for(char c : input.toCharArray()){
            if(Character.isAlphabetic(c)){
            if("AEIOU".contains(""+c))
                vowels.append(c);
            else
                consonants.append(c);
            }
        }
    }

}
