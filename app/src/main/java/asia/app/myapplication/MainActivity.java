package asia.app.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // First comit
        TextView tvFirstCommit = (TextView) findViewById(R.id.tvFirstCommit);

        // Brand second
        TextView tvBrandSecond = (TextView) findViewById(R.id.tvBrandSecond);
    }
}
