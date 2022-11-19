package com.example.g3_proyecto_redhat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Carga2Activity extends AppCompatActivity {

    //Variables
    Animation topAnim, bottomAnim;
    ImageView image;
    TextView principal, intranet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carga2);
        //Animaciones
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        //
        image = findViewById(R.id.imagenLogo);
        principal = findViewById(R.id.titulo);
        intranet = findViewById(R.id.subtitulo);

        image.setAnimation(topAnim);
        principal.setAnimation(bottomAnim);
        intranet.setAnimation(bottomAnim);

        Thread tCarga = new Thread() {
            @Override
            public void run() {
                super.run();
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent iInicioSesion = new Intent(getApplicationContext(), LoginActivity.class);
                    startActivity(iInicioSesion);
                    finish();
                }
            }
        };
        tCarga.start();
    }
}