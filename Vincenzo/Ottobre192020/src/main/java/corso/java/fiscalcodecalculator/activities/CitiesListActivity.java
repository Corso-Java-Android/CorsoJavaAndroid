package corso.java.fiscalcodecalculator.activities;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import corso.java.fiscalcodecalculator.R;
import corso.java.fiscalcodecalculator.providers.CitiesContentProvider;

public class CitiesListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities_list);

        final ListView lv = findViewById(R.id.provinces_list);
        Uri uri = CitiesContentProvider.PROVINCES_CONTENT_URI;
        // implementazione della DEPENDENCY INJECTION tramite il contentresolver
        // il sistema individua la classe sulla base di un meccanismo interno (tramite la uri, cioè il nome univoco assegnato ad una classe)
        // e la istanzia
        // il meccanismo per cui si implementa la DI si chiama IoC - Inversion of Control
        Cursor c = getContentResolver().query(uri, null, null, null, null);

        Context ct = this;

        lv.setAdapter(new CursorAdapter(ct, c, 0) {
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
                        String prov = province.getText().toString();
                        final ListView clv = findViewById(R.id.cities_list);
                        Uri uri = CitiesContentProvider.CITIES_FROM_PROVINCES_CONTENT_URI;
                        Cursor c = getContentResolver().query(uri, null, prov, null, null);
                        clv.setAdapter(new CursorAdapter(ct, c, 0) {
                            @Override
                            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                                return LayoutInflater.from(CitiesListActivity.this).inflate(R.layout.cities_item_layout, viewGroup, false);
                            }

                            @Override
                            public void bindView(View view, Context context, Cursor cursor) {
                                final TextView cities = view.findViewById(R.id.city_label);
                                cities.setText(cursor.getString(0));
                            }
                        });
                    }
                });
            }
        });
    }
}