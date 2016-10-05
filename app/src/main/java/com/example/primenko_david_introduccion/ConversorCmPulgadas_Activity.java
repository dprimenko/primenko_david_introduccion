package com.example.primenko_david_introduccion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;

public class ConversorCmPulgadas_Activity extends AppCompatActivity {

    private EditText edtPulgadas, edtCm;
    private RadioButton radioPulgadasCm, radioCmPulgadas;
    private Button btnConvertirCmPulgadas;
    private ConversionCmPulgadas conversion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor_cm_pulgadas);

        conversion = new ConversionCmPulgadas();
        edtPulgadas = (EditText) findViewById(R.id.edtPulgadas);
        edtCm = (EditText) findViewById(R.id.edtCm);
        radioPulgadasCm = (RadioButton) findViewById(R.id.radioPulgadasCm);
        radioCmPulgadas = (RadioButton) findViewById(R.id.radioCmPulgadas);
        btnConvertirCmPulgadas = (Button) findViewById(R.id.btnConvertirCmPulgadas);

        radioPulgadasCm.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true) {
                    edtPulgadas.setText("");
                    edtCm.setText("");
                    edtCm.setEnabled(false);
                    edtPulgadas.setEnabled(true);
                }
            }
        });

        radioCmPulgadas.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true) {
                    edtPulgadas.setText("");
                    edtCm.setText("");
                    edtPulgadas.setEnabled(false);
                    edtCm.setEnabled(true);
                }
            }
        });

        radioPulgadasCm.setChecked(true);

        btnConvertirCmPulgadas = (Button) findViewById(R.id.btnConvertirCmPulgadas);
        btnConvertirCmPulgadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v == btnConvertirCmPulgadas) {
                    if (radioPulgadasCm.isChecked()){
                        String valor = edtPulgadas.getText().toString();
                        if (valor.isEmpty()){
                            valor = "0";
                        }
                        edtCm.setText(conversion.convertirACentimetros(valor));

                    }
                    else {
                        String valor = edtCm.getText().toString();
                        if (valor.isEmpty()){
                            valor = "0";
                        }
                        edtPulgadas.setText(conversion.convertirAPulgadas(valor));
                    }
                }
            }
        });
    }
}
