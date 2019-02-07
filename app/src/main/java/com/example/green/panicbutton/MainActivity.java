package com.example.green.panicbutton;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Variables
    private Button buttonPanic;
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(this, R.raw.screaminggoat);

        buttonPanic = (Button)findViewById(R.id.button_Panic);
        buttonPanic.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp.start();

            }
        }
        );
    }
}
