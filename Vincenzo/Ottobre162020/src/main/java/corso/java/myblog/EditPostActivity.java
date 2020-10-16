package corso.java.myblog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import corso.java.myblog.model.Post;
import corso.java.myblog.services.PostManagementService;

public class EditPostActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_post);
        final EditText title = findViewById(R.id.txtTitle);
        final EditText body = findViewById(R.id.txtBody);
        findViewById(R.id.btnAdd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Post p = new Post.Builder()
                        .withId(PostManagementService.getNextId())
                        .withBody(body.getText().toString())
                        .withTitle(title.getText().toString())
                        .build();
                new PostManagementService().add(p);
                startActivity(new Intent(EditPostActivity.this, MainActivity.class));
            }
        });
    }
}