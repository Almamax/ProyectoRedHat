package com.example.g3_proyecto_redhat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MensajeActivity extends AppCompatActivity implements View.OnClickListener {

   // Button nuevos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro2);
   //     nuevos = (Button) findViewById(R.id.button);
    }

    @Override
    public void onClick(View view) {

    }
}