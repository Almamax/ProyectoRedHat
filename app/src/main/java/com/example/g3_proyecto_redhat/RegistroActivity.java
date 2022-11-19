package com.example.g3_proyecto_redhat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RegistroActivity extends AppCompatActivity implements View.OnClickListener {

    Button regresando, registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        regresando = (Button) findViewById(R.id.regbtnregresando);
        registrar = (Button)findViewById(R.id.btn_regbtnregistrar);

        regresando.setOnClickListener(this);
        //   registrar.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.regbtnregresando:
                     regresarLogin();
                break;
            case R.id.btn_regbtnregistrar:
                regresarLogin();
                break;
        }
    }

    private void regresarLogin() {
        Intent iRegistro2 = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(iRegistro2);
        finish();
    }
}