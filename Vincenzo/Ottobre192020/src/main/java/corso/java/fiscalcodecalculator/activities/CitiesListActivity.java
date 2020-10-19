package corso.java.fiscalcodecalculator.activities;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;
import java.util.concurrent.ExecutionException;

import corso.java.fiscalcodecalculator.CityLoader;
import corso.java.fiscalcodecalculator.R;
import corso.java.fiscalcodecalculator.model.CityModel;

public class CitiesListActivity extends AppCompatActivity {

    private static class ListLoader extends AsyncTask<Void, Void, List<CityModel>> {
        @Override
        protected List<CityModel> doInBackground(Void... voids) {
            return new CityLoader().load();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities_list);

        final ListView lv = findViewById(R.id.cities_list);
        try {
            final List<CityModel> cities = new ListLoader().execute().get(); // attende i risultati dall'operazione asincrona
            lv.setAdapter(new ArrayAdapter<CityModel>(this, 0) {
                @Override
                public int getCount() {
                    return cities.size();
                }

                @NonNull
                @Override
                public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                    if (convertView == null) {
                        convertView = LayoutInflater.from(getContext()).inflate(R.layout.city_layout, parent, false);
                    }
                    TextView name = convertView.findViewById(R.id.city_name);
                    TextView acronym = convertView.findViewById(R.id.city_acronym);
                    name.setText(cities.get(position).name);
                    acronym.setText(cities.get(position).acronym);
                    return convertView;
                }
            });
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}