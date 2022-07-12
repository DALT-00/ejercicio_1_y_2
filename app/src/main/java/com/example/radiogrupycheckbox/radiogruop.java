package com.example.radiogrupycheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class radiogruop extends AppCompatActivity {
    private EditText ed1,ed2;
    private TextView tv1;
    private RadioButton rd1, rd2, rd3, rd4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radiogruop);
        ed1=(EditText) findViewById(R.id.ed1);
        ed2=(EditText) findViewById(R.id.ed2);
        tv1=(TextView) findViewById(R.id.tv1);
        rd1=(RadioButton) findViewById(R.id.rd1);
        rd2=(RadioButton) findViewById(R.id.rd2);
        rd3=(RadioButton) findViewById(R.id.rd3);
        rd4=(RadioButton) findViewById(R.id.rd4);
    }

    //Metodo para el boton
    public void calcular (View cal){
        String valor_String = ed1.getText().toString();
        String valor2_String = ed2.getText().toString();

        int valor_entero = Integer.parseInt(valor_String);
        int valor2_entero = Integer.parseInt(valor2_String);

        if (rd1.isChecked()==true){
            int suma = valor_entero+valor2_entero;
            String resultado = String.valueOf(suma);
            tv1.setText("La suma es: "+resultado);
        } else if (rd2.isChecked()==true){
            int resta = valor_entero-valor2_entero;
            String resultado = String.valueOf(resta);
            tv1.setText("La resta es: "+resultado);
        }else if (rd3.isChecked()==true){
            int multiplicar = valor_entero*valor2_entero;
            String resultado = String.valueOf(multiplicar);
            tv1.setText("La multiplicacion es: "+resultado);
        }else if (rd4.isChecked()==true){
            int divicion = valor_entero/valor2_entero;
            String resultado = String.valueOf(divicion);
            tv1.setText("La divicion es: "+resultado);
        }
    }

    // Metodo para regresar al menu principal
    public void regresar  (View view){
        Intent siguiente = new Intent(this, MainActivity.class);
        startActivity(siguiente);
    }
}