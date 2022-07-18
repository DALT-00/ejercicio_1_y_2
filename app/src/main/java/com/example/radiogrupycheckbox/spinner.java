package com.example.radiogrupycheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class spinner extends AppCompatActivity {
    private EditText et1, et2;
    private TextView tv_1;
    private Spinner spinner;
    private String opciones [] = {"Sumar", "Restar", "Multiplicar", "Dividir"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        tv_1=(TextView)findViewById(R.id.tv_1);
        spinner=(Spinner) findViewById(R.id.spinner);

        String [] opciones  = {"Sumar", "Restar", "Multiplicar", "Dividir"};

        ArrayAdapter <String> adaptar = new ArrayAdapter<String>(this, R.layout.spinner_item_diego, opciones);
        spinner.setAdapter(adaptar);

    }

    //Metodo del boton para el spinner
    public void Calcular(View view){
        String valor_String = et1.getText().toString();
        String valor2_String = et2.getText().toString();

        int valor_entero = Integer.parseInt(valor_String);
        int valor2_entero = Integer.parseInt(valor2_String);

        String seleccion = spinner.getSelectedItem().toString();
        if (seleccion.equals("Sumar")){
            int sumar = valor_entero+valor2_entero;
            String resultado = String.valueOf(sumar);
            tv_1.setText("La suma es: "+resultado);
        }else if (seleccion.equals("Restar")){
            int restar = valor_entero-valor2_entero;
            String resultado = String.valueOf(restar);
            tv_1.setText("La resta es: "+resultado);
        }else if (seleccion.equals("Multiplicar")){
            int multi = valor_entero*valor2_entero;
            String resultado = String.valueOf(multi);
            tv_1.setText("La multiplicacion es: "+resultado);
        }else if (seleccion.equals("Dividir")){
           if (valor2_entero != 0){
               int divi = valor_entero/valor2_entero;
               String resultado = String.valueOf(divi);
               tv_1.setText("La divicion es: "+resultado);
           }else {
               Toast.makeText(this,"No se puede dividir entre Cero", Toast.LENGTH_LONG).show();
           }
        }

    }

    // Metodo del boton para regresar al inicio
    public void regresar3  (View view) {
        Intent siguiente = new Intent(this, MainActivity.class);
        startActivity(siguiente);
    }
}