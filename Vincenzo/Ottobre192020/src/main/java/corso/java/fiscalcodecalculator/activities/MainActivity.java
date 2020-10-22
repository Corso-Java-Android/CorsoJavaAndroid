package corso.java.fiscalcodecalculator.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import corso.java.fiscalcodecalculator.R;
import corso.java.fiscalcodecalculator.model.FiscalCodeCalculatorServiceContract;
import corso.java.fiscalcodecalculator.model.FiscalCodeCalculatorServiceImpl;
import corso.java.fiscalcodecalculator.model.PersonalData;

public class MainActivity extends AppCompatActivity {

    TextView txtBirthCity;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case CitiesListActivity.CITY_CHOOSER_RESULT: // sto gestendo la risposta di CitiesListActivity
                String city = data.getStringExtra(CitiesListActivity.RESPONSE_CITY);
                String istat = data.getStringExtra(CitiesListActivity.RESPONSE_FC);
                txtBirthCity.setTag(istat);
                txtBirthCity.setText(city);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtBirthday = findViewById(R.id.txt_date);
        final Button btnCalculate = findViewById(R.id.btn_calculate);
        final TextView lblOutput = findViewById(R.id.fiscal_code_output_label);
        final EditText txtFirstName = findViewById(R.id.txt_first_name);
        final EditText txtLastName = findViewById(R.id.txt_last_name);
        final RadioButton rbMale = findViewById(R.id.gender_male);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    FiscalCodeCalculatorServiceContract service = new FiscalCodeCalculatorServiceImpl();
                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ITALY);
                    PersonalData data = new PersonalData.Builder()
                            .withBirthCityCode(txtBirthCity.getTag().toString())
                            .withBirthday(sdf.parse(txtBirthday.getText().toString()))
                            .withFirstName(txtFirstName.getText().toString())
                            .withLastName(txtLastName.getText().toString())
                            .isMale(rbMale.isChecked())
                            .build();
                    String fiscalCode = service.calculateFiscalCode(data);
                    lblOutput.setText(fiscalCode);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
        });
        txtBirthCity = findViewById(R.id.txt_birth_city);
        txtBirthday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog dialog = new DatePickerDialog(MainActivity.this);
                dialog.setOnDateSetListener(new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                        Calendar cal = Calendar.getInstance();
                        cal.set(year, month, day);
                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ITALY);
                        txtBirthday.setText(sdf.format(cal.getTime()));
                    }
                });
                dialog.show();
            }
        });
        txtBirthCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CitiesListActivity.class);
                startActivityForResult(intent, CitiesListActivity.CITY_CHOOSER_RESULT);
            }
        });
    }
}