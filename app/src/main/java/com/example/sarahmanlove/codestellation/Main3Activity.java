package com.example.sarahmanlove.codestellation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    private static final int TIMER_LENGTH = 30;

    private TimerView mTimerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTimerView = findViewById(R.id.timer);

        final Button timerStartButton = findViewById(R.id.btn_timer_start);
        timerStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTimerView.start(TIMER_LENGTH);
            }
        });
    }

    @Override
    protected void onPause() {
        mTimerView.stop();

        super.onPause();
    }
}