package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etn, etp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etn=(EditText)findViewById(R.id.txt_nom);
        etp=(EditText)findViewById(R.id.txt_pass);
    }
    //metodo para el boton
    public void registrar(View view){
        String nombre =etn.getText().toString();
        String password =etp.getText().toString();

        if (nombre.length() == 0){
            Toast.makeText(this,"el nombre no puede estar vacio", Toast.LENGTH_LONG).show();
        }
        if (password.length() == 0){
            Toast.makeText(this,"debes ingresar una clave", Toast.LENGTH_LONG).show();
        }
        if (nombre.length() != 0 && password.length() != 0){
            Toast.makeText(this,"registro en proceso",Toast.LENGTH_LONG).show();
        }
    }
}
