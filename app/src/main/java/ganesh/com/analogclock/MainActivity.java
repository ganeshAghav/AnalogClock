package ganesh.com.analogclock;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DigitalClock;

public class MainActivity extends AppCompatActivity {

    DigitalClock digitalClock1;
    Button showAnotherDigitalClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DigitalClock digitalClock = (DigitalClock) findViewById(R.id.digitalClock);

        digitalClock1 = (DigitalClock) findViewById(R.id.digitalClock1);
        digitalClock1.setVisibility(View.INVISIBLE);

        showAnotherDigitalClock = (Button) findViewById(R.id.showDigitalClock);
    }

    public void showDigitalClock(View view) {
        digitalClock1.setVisibility(View.VISIBLE);
        showAnotherDigitalClock.setText("Another DigitalClock");
    }
}