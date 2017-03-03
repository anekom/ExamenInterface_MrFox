package com.nrfox.mrfox;

import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    public static final int SEGUNDOS = 3;
    public static final int MILISEGUNDOS = SEGUNDOS * 1000;
    public static final int DELAY = 2;
    private ProgressBar progressBar;

    TextView tvTituloS, tvSubS;
    ImageView fox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        tvTituloS = (TextView) findViewById(R.id.tvTituloS);
        tvSubS = (TextView) findViewById(R.id.tvSubS);
        fox = (ImageView) findViewById(R.id.fox);


        Typeface face=Typeface.createFromAsset(getAssets(),"font/AmaticSC-Regular.ttf");
        tvTituloS.setTypeface(face);
        tvSubS.setTypeface(face);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        /*progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setMax(maximo_prograso());*/

        empezar_animacion();

    }

    private void empezar_animacion() {
        new CountDownTimer(MILISEGUNDOS, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                fox.startAnimation(
                        AnimationUtils.loadAnimation(SplashScreen.this, R.anim.girar) );
            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(SplashScreen.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }.start();

    }



}
