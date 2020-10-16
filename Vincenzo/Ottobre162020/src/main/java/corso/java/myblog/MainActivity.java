package corso.java.myblog;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import corso.java.myblog.model.Post;
import corso.java.myblog.services.PostManagementService;

public class MainActivity extends AppCompatActivity {
    private static final String TAG ="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView lv = findViewById(R.id.postList);
        lv.setAdapter(new ArrayAdapter<Post>(this, 0) {
            @Override
            public int getCount() {
                return new PostManagementService().readAll().size();
            }

            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
                if (convertView == null) {
                    convertView = LayoutInflater.from(MainActivity.this)
                            .inflate(R.layout.post_item_layout, null);
                }
                TextView title = convertView.findViewById(R.id.title);
                title.setGravity(position % 2 == 0 ? Gravity.LEFT : Gravity.RIGHT);
                TextView body = convertView.findViewById(R.id.body);
                Post p = new PostManagementService().readAll().get(position);
                title.setText(p.title);
                body.setText(p.body);
                return convertView;
            }
        });
        findViewById(R.id.btnAdd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, EditPostActivity.class));
            }
        });
    }
}