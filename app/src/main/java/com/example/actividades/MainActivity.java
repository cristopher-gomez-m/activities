package com.example.actividades;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText txt_usuario;
    private EditText txt_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Grupo 6");

        Button button_aceptar = findViewById(R.id.button_aceptar);
        button_aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validarCredenciales();
            }
        });
    }

    public void validarCredenciales() {
        txt_usuario = findViewById(R.id.txt_usuario);
        txt_password = findViewById(R.id.txt_password);
        String usuarioValido = "alex";
        String passwordValido = "123";
        String usuarioIngresado = txt_usuario.getText().toString();
        String passwordIngresado = txt_password.getText().toString();

        if (usuarioIngresado.equals(usuarioValido) && passwordIngresado.equals(passwordValido)) {
            Toast.makeText(this, "Credenciales correctas", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show();
        }
    }
}