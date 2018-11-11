package com.example.sarahmanlove.codestellation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button button = findViewById(R.id.btnRestart);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Main4Activity.this, MainActivity.class));
            }
        });

        Button btn = findViewById(R.id.btnHelpline);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Main4Activity.this, MainActivity.class));
            }
        });
    }
}
