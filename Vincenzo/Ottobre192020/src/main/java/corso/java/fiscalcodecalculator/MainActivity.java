package corso.java.fiscalcodecalculator;

import androidx.appcompat.app.AppCompatActivity;
import corso.java.fiscalcodecalculator.model.CityModel;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = findViewById(R.id.ListView);
        List<CityModel> cities = new CityLoader().load();
        list.setAdapter(new ArrayAdapter<CityModel>(this, android.R.layout.simple_list_item_1, cities));
    }
}