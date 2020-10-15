package corso.java.myblog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NewPostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_post);

        final TextView id = findViewById(R.id.id);
        final TextView title = findViewById(R.id.title);
        final TextView body = findViewById(R.id.body);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent resultIntent = new Intent();
                resultIntent.putExtra("id", Integer.parseInt(id.getText().toString()));
                resultIntent.putExtra("title", title.getText().toString());
                resultIntent.putExtra("body", body.getText().toString());
                setResult(Activity.RESULT_OK, resultIntent);
                finish();
            }
        });

    }
}