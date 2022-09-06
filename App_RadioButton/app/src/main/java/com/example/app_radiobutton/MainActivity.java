package com.example.app_radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv;
    private RadioButton rb1, rb2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_v1);
        et2 = (EditText)findViewById(R.id.txt_v2);
        tv = (TextView)findViewById(R.id.textView);
        rb1 = (RadioButton)findViewById(R.id.rb_sum);
        rb2 = (RadioButton)findViewById(R.id.rb_res);
    }

    //metodo para el boton calcular
    public void Calcular(View view){
        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());

        if(rb1.isChecked() == true){
            int suma = num1 + num2;
            String resultado = String.valueOf(suma);
            tv.setText("Resultado es: " + resultado);
        }else if(rb2.isChecked() == true){
            int resta = num1 - num2;
            String resultado = String.valueOf(resta);
            tv.setText("Resultado es: " + resultado);


        }
    }
}
