package com.example.practicacheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et1, et2;
    private CheckBox cb_sum, cb_res;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_v1);
        et2 = (EditText)findViewById(R.id.txt_v2);
        cb_sum = (CheckBox)findViewById(R.id.cb_sum);
        cb_res = (CheckBox)findViewById(R.id.cb_restar);
        tv = (TextView)findViewById(R.id.textView);
    }
    // este metodo es para calcular
    public void calcular (View view){
        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());

        String resul = "";
        if(cb_sum.isChecked() == true){
            int suma = num1 + num2;
            resul =("la suma es: "+ suma + "\n");
        }
        if (cb_res.isChecked() == true){
            int resta = num1 - num2;
            resul =resul + ("la resta es: "+ resta);
        }
        tv.setText(resul);
    }
}
