package com.example.dhananjay.simpledrum;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer[] media = new MediaPlayer[12];
    ImageButton[] btn = new ImageButton[12];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String StrId;
        int id;

        

        //btn[0] = findViewById(R.id.imageButton1);
        media[0] = MediaPlayer.create(this, R.raw.one);
        media[1] = MediaPlayer.create(this, R.raw.two);
        media[2] = MediaPlayer.create(this, R.raw.three);
        media[3] = MediaPlayer.create(this, R.raw.four);
        media[4] = MediaPlayer.create(this, R.raw.fv);
        media[5] = MediaPlayer.create(this, R.raw.sixth);
        media[6] = MediaPlayer.create(this, R.raw.seventh);
        media[7] = MediaPlayer.create(this, R.raw.eighth);
        media[8] = MediaPlayer.create(this, R.raw.nine);
        media[9] = MediaPlayer.create(this, R.raw.ten);
        media[10] = MediaPlayer.create(this, R.raw.eleven);
        media[11] = MediaPlayer.create(this, R.raw.twelve);

        for (int i = 0; i < 1; i++) {
            StrId = "R.id.imageButton" + (i + 1);
            id = getResources().getIdentifier(StrId, "id", getPackageName());
            btn[i] = findViewById(id);
        }

    }

    public void playSound(View view) {
        switch (view.getId()) {
            case R.id.imageButton1:
                media[0].start();
                break;
            case R.id.imageButton2:
                media[1].start();
                break;
            case R.id.imageButton3:
                media[2].start();
                break;
            case R.id.imageButton4:
                media[3].start();
                break;
            case R.id.imageButton5:
                media[4].start();
                break;
            case R.id.imageButton6:
                media[5].start();
                break;
            case R.id.imageButton7:
                media[6].start();
                break;
            case R.id.imageButton8:
                media[7].start();
                break;
            case R.id.imageButton9:
                media[8].start();
                break;
            case R.id.imageButton10:
                media[9].start();
                break;
            case R.id.imageButton11:
                media[10].start();
                break;
            case R.id.imageButton12:
                media[11].start();
                break;

        }
    }
}
