package com.example.radiogrupycheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo del boton radiogruop
    public void Radio (View view){
        Intent siguiente = new Intent(this, radiogruop.class);
        startActivity(siguiente);
    }

    // Metodo del boton checkbox
    public void Check (View view){
        Intent s = new Intent(this, chechbox.class);
        startActivity(s);
    }

    // Metodo del boton spinner
    public void Spinner (View view){
        Intent s = new Intent(this, spinner.class);
        startActivity(s);
    }
}