package tw.brad.myseg4;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button event;
    private boolean isEvent = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        event = (Button)findViewById(R.id.event);
        event.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isEvent = !isEvent;
                event.setTextColor(isEvent? Color.BLACK:Color.WHITE);
                event.setBackgroundResource(isEvent?R.drawable.event_true:R.drawable.event_false);
            }
        });
    }
}
