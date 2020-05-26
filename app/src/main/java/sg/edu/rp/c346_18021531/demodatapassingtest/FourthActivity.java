package sg.edu.rp.c346_18021531.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FourthActivity extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        tv = findViewById(R.id.textView4);
        Intent intentReceived = getIntent();
        Double value = intentReceived.getDoubleExtra("value2", 0.0);
        tv.setText("Double value received is: " + value);
    }
}
