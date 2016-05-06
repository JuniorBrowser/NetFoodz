package com.example.sillas.netfoodz;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class TelaAnimacao extends Activity implements Runnable {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_tela_animacao);

        final ImageView animationImageView = (ImageView) findViewById(R.id.AnimationImageView);
        animationImageView.setBackgroundResource(R.drawable.android);

        final AnimationDrawable frameAnimation = (AnimationDrawable) animationImageView.getBackground();
        animationImageView.post(new Runnable() {
            @Override
            public void run() {
                frameAnimation.start();
            }
        });

        Handler h = new Handler();
        h.postDelayed(this, 6000);
    }

    public void run() {
        finish();
        Intent it = new Intent(TelaAnimacao.this, Login.class);
        startActivity(it);
    }
}