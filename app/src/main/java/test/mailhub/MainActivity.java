package test.mailhub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView trying = (TextView) findViewById(R.id.msgLbl);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String reciever = getIntent().getStringExtra("Name");

        trying.setText(reciever);

    }
}
