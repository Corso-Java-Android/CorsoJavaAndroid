package corso.java.fiscalcodecalculator.model;

import java.util.Date;

/**
 * Dati anagrafici di una persona.
 */
public class PersonalData {
    /**
     * Nome.
     */
    public final String firstName;
    /**
     * Cognome.
     */
    public final String lastName;
    /**
     * Data di nascita.
     */
    public final Date birthday;
    /**
     * Indica se il sesso è maschile.
     */
    public final boolean isMale;
    /**
     * Codice catastale del comune di nascita.
     */
    public final String birthCityCode;

    private PersonalData(String firstName, String lastName, Date birthday,
                         boolean isMale, String birthCityCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.isMale = isMale;
        this.birthCityCode = birthCityCode;
    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private Date birthday;
        private boolean male;
        private String birthCityCode;

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withBirthday(Date birthday) {
            this.birthday = birthday;
            return this;
        }

        public Builder isMale(boolean male) {
            this.male = male;
            return this;
        }

        public Builder withBirthCityCode(String birthCityCode) {
            this.birthCityCode = birthCityCode;
            return this;
        }
        public PersonalData build(){
            // firstname NON può essere vuoto
            // lastname NON può essere vuoto
            // birthCityCode non può essere vuoto
            return new PersonalData(
                    firstName,
                    lastName,
                    birthday,
                    male,
                    birthCityCode
            );
        }
    }
}
