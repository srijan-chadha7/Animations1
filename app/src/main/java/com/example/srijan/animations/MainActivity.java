package com.example.srijan.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public void fade(View view) {

        Log.i("Info", "ImageView Pressed");

        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);

        bartImageView.setX(-1000);
        bartImageView.animate().translationXBy(1000).rotation(3600).setDuration(2000);

    }
}
