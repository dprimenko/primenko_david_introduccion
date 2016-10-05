package com.example.primenko_david_introduccion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu_Activity extends AppCompatActivity {

    Button btnEjercicioUno, btnEjercicioDos, btnEjercicioTres, btnEjercicioCuatro, btnEjercicioCinco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnEjercicioUno = (Button) findViewById(R.id.btnEjercicioUno);
        btnEjercicioDos = (Button) findViewById(R.id.btnEjercicioDos);
        btnEjercicioTres = (Button) findViewById(R.id.btnEjercicioTres);
        btnEjercicioCuatro = (Button) findViewById(R.id.btnEjercicioCuatro);
        btnEjercicioCinco = (Button) findViewById(R.id.btnEjercicioCinco);

        btnEjercicioUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu_Activity.this, ConversorDeDivisas_Activity.class);
                startActivity(intent);
            }
        });

        btnEjercicioDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu_Activity.this, ConversorCmPulgadas_Activity.class);
                startActivity(intent);
            }
        });

        btnEjercicioTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu_Activity.this, Saludo_Activity.class);
                startActivity(intent);
            }
        });
        btnEjercicioCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu_Activity.this, ContadorCafes_Activity.class);
                startActivity(intent);
            }
        });
        btnEjercicioCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu_Activity.this, JuegoMemoria_Activity.class);
                startActivity(intent);
            }
        });
    }

}
