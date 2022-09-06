package com.example.spiner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    private Spinner spiner;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_v1);
        et2 = (EditText)findViewById(R.id.txt_v2);
        tv = (TextView)findViewById(R.id.textView);
        spiner = (Spinner)findViewById(R.id.spinner);

        String [] opciones ={"sumar","restar","multiplicar","dividir"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.spinner_item_fabi, opciones);
        spiner.setAdapter(adapter);

    }
    //metodo del boton calcular
    public void calcular(View view){
        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());

        String seleccion = spiner.getSelectedItem().toString();

        if (seleccion.equals("sumar")){
            int suma = num1 + num2;
            String resul = String.valueOf(suma);
            tv.setText(resul);
        }else if(seleccion.equals("restar")){
            int resta = num1 - num2;
            String resul = String.valueOf(resta);
            tv.setText(resul);
        }else if(seleccion.equals("multiplicar")){
            int multi = num1 * num2;
            String resul = String.valueOf(multi);
            tv.setText(resul);
        }else if(seleccion.equals("dividir")){
            if (num2 !=0){
                int div = num1 / num2;
                String resul = String.valueOf(div);
                tv.setText(resul);
            }else{
                Toast.makeText(this, "el valor 2 debe de ser diferente de cero", Toast.LENGTH_LONG).show();
            }

        }
    }
}
