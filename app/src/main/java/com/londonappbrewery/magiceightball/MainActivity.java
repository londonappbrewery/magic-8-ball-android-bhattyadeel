package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] imgAnswers = {R.drawable.m1,
                R.drawable.m2,
                R.drawable.m3,
                R.drawable.m4,
                R.drawable.m5,
                R.drawable.m6,
                R.drawable.m7,
                R.drawable.m8,
                R.drawable.m9,
                R.drawable.m10,
                R.drawable.m11,
                R.drawable.m12,
                R.drawable.m13,
                R.drawable.m14,
                R.drawable.m15};

        Button btnAsk = (Button) findViewById(R.id.btnAsk);
        final ImageView ImgAns = (ImageView) findViewById(R.id.imageAnswer);


        btnAsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rndAnswerGenerator = new Random();
                int rndAns = rndAnswerGenerator.nextInt(15);

                ImgAns.setImageResource(imgAnswers[rndAns]);
            }
        });
    }
}
