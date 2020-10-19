package corso.java.fiscalcodecalculator.model;

public class CityModel {

    private String id;
    private String name;
    private String province;
    private String acronym;
    private String region;
    private String area;
    private String capital;
    private String fiscalCode;

    public CityModel(String id, String name, String province, String acronym, String region, String area, String capital, String fiscalCode) {
        this.id = id;
        this.name = name;
        this.province = province;
        this.acronym = acronym;
        this.region = region;
        this.area = area;
        this.capital = capital;
        this.fiscalCode = fiscalCode;
    }

    @Override
    public String toString() {
        return "CityModel{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", province='" + province + '\'' +
                ", acronym='" + acronym + '\'' +
                ", region='" + region + '\'' +
                ", area='" + area + '\'' +
                ", capital='" + capital + '\'' +
                ", fiscalCode='" + fiscalCode + '\'' +
                '}';
    }

    public static class Builder{

        private String id;
        private String name;
        private String province;
        private String acronym;
        private String region;
        private String area;
        private String capital;
        private String fiscalCode;

        public Builder(){
            this.id = "";
            this.name = "";
            this.province = "";
            this.acronym = "";
            this.region = "";
            this.area = "";
            this.capital = "";
            this.fiscalCode = "";
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withProvince(String province) {
            this.province = province;
            return this;
        }

        public Builder withAcronym(String acronym) {
            this.acronym = acronym;
            return this;
        }

        public Builder withFiscalCode(String fiscalCode){
            this.fiscalCode = fiscalCode;
            return this;
        }

        public CityModel build() {
            return new CityModel(id, name, province, acronym, region, area, capital, fiscalCode);
        }



    }
}
