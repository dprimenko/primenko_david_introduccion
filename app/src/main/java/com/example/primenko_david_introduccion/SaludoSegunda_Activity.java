package com.example.primenko_david_introduccion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SaludoSegunda_Activity extends AppCompatActivity {

    TextView txvSaludoRespuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo_segunda__acitivity);
        txvSaludoRespuesta = (TextView) findViewById(R.id.txvSaludoRespuesta);

        txvSaludoRespuesta.setText("Hola " + this.getIntent().getStringExtra("nombre"));
    }
}
