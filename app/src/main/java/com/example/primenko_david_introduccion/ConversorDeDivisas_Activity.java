package com.example.primenko_david_introduccion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Button;

public class ConversorDeDivisas_Activity extends AppCompatActivity {

    private EditText edtDolares, edtEuros;
    private RadioButton radioDolEur, radioEurDol;
    private Button convertir;
    private ConversionDivisa miConversion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor_de_divisas);
        edtDolares = (EditText) findViewById(R.id.edtDolares);
        edtEuros = (EditText) findViewById(R.id.edtEuros);
        radioDolEur = (RadioButton) findViewById(R.id.radioDolEur);
        radioEurDol = (RadioButton) findViewById(R.id.radioEurDol);
        radioDolEur.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true) {
                    edtDolares.setText("");
                    edtEuros.setText("");
                    edtEuros.setEnabled(false);
                    edtDolares.setEnabled(true);
                }
            }
        });
        radioEurDol.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true) {
                    edtDolares.setText("");
                    edtEuros.setText("");
                    edtDolares.setEnabled(false);
                    edtEuros.setEnabled(true);
                }
            }
        });
        radioDolEur.setChecked(true);
        convertir = (Button) findViewById(R.id.btnConvertir);
        convertir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == convertir) {
                    if (radioDolEur.isChecked()){
                        String valor = edtDolares.getText().toString();
                        if (valor.isEmpty()){
                            valor = "0";
                        }
                        edtEuros.setText(miConversion.convertirAEuros(valor));
                    }
                    else {
                        String valor = edtEuros.getText().toString();
                        if (valor.isEmpty()){
                            valor = "0";
                        }
                        edtDolares.setText(miConversion.convertirADolares(valor));
                    }
                }
            }
        });

        miConversion = new ConversionDivisa();
    }
}
