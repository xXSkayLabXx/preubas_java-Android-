package com.example.miapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_mat);
        et2 = (EditText)findViewById(R.id.txt_fisica);
        et3 = (EditText)findViewById(R.id.txt_quimica);
        tv1 = (TextView)findViewById(R.id.tv_estado);
    }
    public void Estado(View view){

        int mat = Integer.parseInt(et1.getText().toString());
        int fis = Integer.parseInt(et2.getText().toString());
        int qui = Integer.parseInt(et3.getText().toString());

        int prom = (mat + fis + qui)/3;

        if(prom >= 6){
            tv1.setText("estado aprobado con: " + prom);

        } else{
            tv1.setText("estado reprobado con: " + prom);


        }
    }
}
