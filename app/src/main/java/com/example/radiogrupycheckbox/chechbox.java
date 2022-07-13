package com.example.radiogrupycheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class chechbox extends AppCompatActivity {
    private EditText edi1, edi2;
    private TextView textView;
    private CheckBox check1, check2, check3, check4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chechbox);
        edi1=(EditText) findViewById(R.id.edi1);
        edi2=(EditText) findViewById(R.id.edi2);
        textView=(TextView) findViewById(R.id.textView);
        check1=(CheckBox) findViewById(R.id.check1);
        check2=(CheckBox) findViewById(R.id.check2);
        check3=(CheckBox) findViewById(R.id.check3);
        check4=(CheckBox) findViewById(R.id.check4);
    }

    //Metodo para calucar en checkboc
    public void cacular2 (View cal){
        String valor_String = edi1.getText().toString();
        String valor2_String = edi2.getText().toString();

        int valor_entero = Integer.parseInt(valor_String);
        int valor2_entero = Integer.parseInt(valor2_String);
        String resultado="";

        if (check1.isChecked()==true){
            int suma = valor_entero+valor2_entero;
            //String resultado = String.valueOf(suma);
            //textView.setText("La suma es: "+resultado);
            resultado = " La suma es: "+suma+" / ";
        }
        if (check2.isChecked()==true){
            int resta = valor_entero-valor2_entero;
            //String resultado = String.valueOf(resta);
           // textView.setText("La resta es: "+resultado);
            resultado = resultado+" La resta es: "+resta+" / ";
        }
        if (check3.isChecked()==true){
            int multiplicar = valor_entero*valor2_entero;
            //String resultado = String.valueOf(multiplicar);
            //textView.setText("La multiplicacion es: "+resultado);
            resultado = resultado+" La multiplicacion es: "+multiplicar+" / ";
        }
        if (check4.isChecked()==true) {
            if (valor2_entero != 0){
                int dividir = valor_entero/valor2_entero;
                resultado = resultado+" La division es: "+dividir+" / ";
            }else {
                Toast.makeText(this, "No se puede dividir entre cero", Toast.LENGTH_LONG).show();
            }
            //String resultado = String.valueOf(divicion);
            //textView.setText("La divicion es: " + resultado);

        }
        textView.setText(resultado);
    }

    // Metodo del boton para regresar al inicio
    public void regresar2  (View view){
        Intent siguiente = new Intent(this, MainActivity.class);
        startActivity(siguiente);
    }
}