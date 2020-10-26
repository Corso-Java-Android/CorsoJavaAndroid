package corso.java.simplerest;

import android.app.IntentService;
import android.content.Intent;

public class RestService extends IntentService {
    public RestService() {
        super("RestService");
    }
    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
        }
    }
}