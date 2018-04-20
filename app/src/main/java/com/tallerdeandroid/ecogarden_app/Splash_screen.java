package com.tallerdeandroid.ecogarden_app;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import com.felipecsl.gifimageview.library.GifImageView;

import org.apache.commons.io.IOExceptionWithCause;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class Splash_screen extends AppCompatActivity {


    private GifImageView gifImageView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // Setear recurso de gif
        gifImageView = (GifImageView) findViewById(R.id.gifImageView);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setVisibility(progressBar.VISIBLE);

        try {
            InputStream inputStream = getAssets().open("splash.gif");
            byte[] bytes = IOUtils.toByteArray(inputStream);
            gifImageView.setBytes(bytes);
            gifImageView.startAnimation();
        }catch (IOException ex){

        }


        //Esperar 3 segundos
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Splash_screen.this.startActivity(new Intent(Splash_screen.this, MainActivity.class));
                Splash_screen.this.finish();
            }
        },3000); // segundos de duracion del .gif


    }
}
