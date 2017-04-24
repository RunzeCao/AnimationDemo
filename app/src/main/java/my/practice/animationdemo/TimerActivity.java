package my.practice.animationdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TimerActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        button = (Button) findViewById(R.id.timer_start);
        textView = (TextView) findViewById(R.id.timer_tv);
    }

    public void start(View view) {
        MyCountTimer myCountTimer = new MyCountTimer(11000, 1000, button, textView, TimerActivity.this);
        myCountTimer.start();
    }


}
