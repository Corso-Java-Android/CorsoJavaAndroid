package corso.java.fiscalcodecalculator;

import java.util.ArrayList;
import java.util.List;

import corso.java.fiscalcodecalculator.model.CityModel;

public class CityLoader {

    public List<CityModel> load(){
        List<CityModel> result = new ArrayList<>();
        CityModel napoli = new CityModel.Builder()
                .withName("Napoli")
                .withProvince("Napoli")
                .withAcronym("NA")
                .build();
        result.add(napoli);

        CityModel.Builder builder = new CityModel.Builder();
        builder.withName("Roma");
        builder.withProvince("Roma").withAcronym("RM");
        CityModel roma = builder.build();
        result.add(roma);

        return result;

    }
}
