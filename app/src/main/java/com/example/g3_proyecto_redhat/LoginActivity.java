package com.example.g3_proyecto_redhat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    TextView correo, password, registrarse;
    Button ingresar, salir;
    CheckBox recordar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        correo = findViewById(R.id.txt_correo);
        password = findViewById(R.id.txt_password);
        registrarse = findViewById(R.id.txt_registro);
        ingresar = findViewById(R.id.btn_ingresar);
        salir = findViewById(R.id.btn_regresar);
        recordar = findViewById(R.id.chk_recordar);

        //Asociando los botones a los controles
        registrarse.setOnClickListener(this);
        ingresar.setOnClickListener(this);
        salir.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case (R.id.txt_registro):
                cargarActividadRegistro();
                break;

            case (R.id.btn_ingresar):
                validarDatos();
                break;

            case (R.id.btn_regresar):
                SalirApp();
                break;

        }
    }

    private void cargarActividadRegistro() {
        Intent iRegistro = new Intent(getApplicationContext(), RegistroActivity.class);
        startActivity(iRegistro);
        this.finish();
    }

    private void validarDatos() {
        String val_email = correo.getText().toString().trim();
        String val_contra = password.getText().toString().trim();

        if (val_email.isEmpty() || val_contra.isEmpty()) {
            Toast.makeText(this, "Llene las casillas en blanco", Toast.LENGTH_SHORT).show();
            return;
        }
        cargarActividadIngresar(val_email, val_contra);
    }

    private void cargarActividadIngresar(String val_email, String val_contra) {
        //Validando datos del usuario existente
        if (val_email.equals("administrator@dominio.com") && val_contra.equals("123456")) {
            Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Usuario y/o contraseña incorrectos", Toast.LENGTH_SHORT).show();
            correo.setText("");
            password.setText("");
        }
    }

    private void SalirApp() {
        System.exit(0);
    }
}