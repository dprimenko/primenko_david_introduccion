package com.example.primenko_david_introduccion;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
;

/**
 * Created by usuario on 29/09/16.
 */

public class Saludo_Activity extends AppCompatActivity{

    EditText edtSaludo, edtNavegar;
    Button btnSaludo, btnNavegar;
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        // Inicializacion de las variables de los Widgets
        edtSaludo = (EditText) findViewById(R.id.edtSaludo);
        edtNavegar = (EditText) findViewById(R.id.edtNavegar);

        btnSaludo = (Button) findViewById(R.id.btnSaludo);
        btnNavegar = (Button) findViewById(R.id.btnNavegar);

        btnSaludo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Saludo_Activity.this, SaludoSegunda_Activity.class);
                intent.putExtra("nombre", edtSaludo.getText().toString());
                startActivity(intent);
            }
        });

        btnNavegar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url = edtNavegar.getText().toString();
                Uri webpage = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

                if (intent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(intent);
                }
            }
        });
    }
}
