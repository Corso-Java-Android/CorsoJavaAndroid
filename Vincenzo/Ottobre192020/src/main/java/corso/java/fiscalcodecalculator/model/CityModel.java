package corso.java.fiscalcodecalculator.model;

/**
 * Modello di rappresentazione di un comune italiano.
 */
public class CityModel {
    /**
     * Campo chiave.
     */
    public final long id;
    /**
     * Denominazione.
     */
    public final String name;
    /**
     * Provincia.
     */
    public final String province;
    /**
     * Sigla della provincia.
     */
    public final String acronym;
    /**
     * Regione.
     */
    public final String region;
    /**
     * Area geografica.
     */
    public final String area;
    /**
     * Indica se si tratta di un capoluogo di provincia.
     */
    public final boolean isCapital;
    /**
     * Codice utilizzato per indicare il comune all'interno del codice fiscale.
     */
    public final String fiscalCode;

    /**
     * Costruttore.
     *
     * @param id         chiave
     * @param name       denominazione
     * @param province   provincia
     * @param acronym    sigla
     * @param region     regione
     * @param area       circoscrizione
     * @param isCapital  capoluogo di provincia
     * @param fiscalCode codice per l'indicazione del comune nel c.f.
     */
    private CityModel(long id, String name, String province, String acronym, String region, String area, boolean isCapital, String fiscalCode) {
        this.id = id;
        this.name = name;
        this.province = province;
        this.acronym = acronym;
        this.region = region;
        this.area = area;
        this.isCapital = isCapital;
        this.fiscalCode = fiscalCode;
    }

    /**
     * Costruttore per passaggi successivi di un oggetto di tipo CityModel.
     */
    public static class Builder {
        // Campi privati al Builder, IDENTICI ai campi dell'oggetto da costruire.
        private long id;
        private String name;
        private String province;
        private String acronym;
        private String region;
        private String area;
        private boolean capital;
        private String fiscalCode;

        /**
         * Valorizza la chiave.
         *
         * @param id chiave.
         * @return un riferimento all'istanza per favorire la notazione fluente.
         */
        public Builder withId(long id) {
            this.id = id;
            return this;
        }

        /**
         * Valorizza la denominazione.
         *
         * @param name denominazione.
         * @return un riferimento all'istanza per favorire la notazione fluente.
         */
        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        /**
         * Valorizza la provincia.
         *
         * @param province la provincia.
         * @return un riferimento all'istanza per favorire la notazione fluente.
         */
        public Builder withProvince(String province) {
            this.province = province;
            return this;
        }

        /**
         * Valorizza la sigla della provincia.
         *
         * @param acronym la sigla.
         * @return un riferimento all'istanza per favorire la notazione fluente.
         */
        public Builder withAcronym(String acronym) {
            this.acronym = acronym;
            return this;
        }

        /**
         * Valorizza la regione.
         *
         * @param region la regione.
         * @return un riferimento all'istanza per favorire la notazione fluente.
         */
        public Builder withRegion(String region) {
            this.region = region;
            return this;
        }

        /**
         * Valorizza la circoscrizione.
         *
         * @param area la circoscrizione.
         * @return un riferimento all'istanza per favorire la notazione fluente.
         */
        public Builder withArea(String area) {
            this.area = area;
            return this;
        }

        /**
         * Valorizza il campo capoluogo di provincia.
         *
         * @param capital indica se si tratta di un capoluogo di provincia.
         * @return un riferimento all'istanza per favorire la notazione fluente.
         */
        public Builder isCapital(boolean capital) {
            this.capital = capital;
            return this;
        }

        /**
         * Valorizza il codice fiscale del comune.
         *
         * @param fiscalCode il codice fiscale.
         * @return un riferimento all'istanza per favorire la notazione fluente.
         */
        public Builder withFiscalCode(String fiscalCode) {
            this.fiscalCode = fiscalCode;
            return this;
        }

        /**
         * Crea un comune con i valori associati ai diversi campi attraverso i metodi withXXXX().
         *
         * @return il comune con i campi valorizzati in precedenza.
         */
        public CityModel build() {
            return new CityModel(id, name, province, acronym, region, area, capital, fiscalCode);
        }
    }
}
