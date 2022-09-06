package com.example.imagenbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //metodos para los botonoes
    public void oculta (View view){
        Toast.makeText(this, "la skin oculat",Toast.LENGTH_SHORT).show();

    }
    public  void logo (View view){
        Toast.makeText(this, "este es el logo", Toast.LENGTH_SHORT).show();
    }
}
