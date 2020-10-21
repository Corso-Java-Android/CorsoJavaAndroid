package corso.java.fiscalcodecalculator.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.TextView;
import corso.java.fiscalcodecalculator.persistence.CitiesDbHelper;
import corso.java.fiscalcodecalculator.persistence.CityLoader;
import corso.java.fiscalcodecalculator.R;
import corso.java.fiscalcodecalculator.model.CityModel;
import corso.java.fiscalcodecalculator.providers.CitiesContentProvider;

public class CitiesListActivity extends AppCompatActivity {

    public static final int CITY_CHOOSER_RESULT = 1234;
    public static final String RESPONSE_CITY = "city";
    public static final String RESPONSE_FC = "istat_code";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities_list);

        final ListView lvProvinces = findViewById(R.id.provinces_list);
        final ListView lvCities = findViewById(R.id.cities_list);
        final Uri provincesUri = CitiesContentProvider.PROVINCES_CONTENT_URI;
        final Uri citiesUri = CitiesContentProvider.CITIES_CONTENT_URI;
        // implementazione della DEPENDENCY INJECTION tramite il contentresolver
        // il sistema individua la classe sulla base di un meccanismo interno (tramite la uri, cioè il nome univoco assegnato ad una classe)
        // e la istanzia
        // il meccanismo per cui si implementa la DI si chiama IoC - Inversion of Control
        Cursor c = getContentResolver().query(provincesUri, null, null, null, null);

        lvProvinces.setAdapter(new CursorAdapter(this, c, 0) {
            @Override
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return LayoutInflater.from(CitiesListActivity.this).inflate(R.layout.provinces_item_layout, viewGroup, false);
            }

            @Override
            public void bindView(View view, Context context, Cursor cursor) {
                final TextView province = view.findViewById(R.id.province_label);
                province.setText(cursor.getString(0));

                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        final Cursor c = getContentResolver().query(
                                citiesUri,
                                new String[]{
                                        CitiesDbHelper.Metadata.Tables.Cities.ID_COLUMN,
                                        CitiesDbHelper.Metadata.Tables.Cities.FC_COLUMN,
                                        CitiesDbHelper.Metadata.Tables.Cities.NAME_COLUMN},
                                CitiesDbHelper.Metadata.Tables.Cities.ACRONYM_COLUMN + " = ?",
                                new String[]{province.getText().toString()},
                                CitiesDbHelper.Metadata.Tables.Cities.NAME_COLUMN);
                        lvCities.setAdapter(new CursorAdapter(CitiesListActivity.this, c, 0) {
                            @Override
                            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                                return LayoutInflater.from(CitiesListActivity.this).inflate(R.layout.cities_item_layout, viewGroup, false);
                            }

                            @Override
                            public void bindView(View view, Context context, Cursor cursor) {
                                final TextView city = view.findViewById(R.id.city_label);
                                city.setText(cursor.getString(cursor.getColumnIndex(CitiesDbHelper.Metadata.Tables.Cities.NAME_COLUMN)));
                                city.setTag(cursor.getString(cursor.getColumnIndex(CitiesDbHelper.Metadata.Tables.Cities.FC_COLUMN)));

                                city.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent response = new Intent();
                                        response.putExtra(RESPONSE_CITY, city.getText().toString());
                                        response.putExtra(RESPONSE_FC, city.getTag().toString());
                                        setResult(CITY_CHOOSER_RESULT, response);
                                        finish();
                                    }
                                });
                            }
                        });
                    }
                });
            }
        });
    }
}