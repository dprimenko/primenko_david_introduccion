package com.example.primenko_david_introduccion;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ContadorCafes_Activity extends AppCompatActivity {

    private TextView txvCafeNum, txvTiempo;
    private Button btnMenos, btnMas, btnComenzar;
    private Contador miContador;
    private long INTERVALO = 100;
    private MyCountDownTimer miContadorDescendente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador_cafes);
        txvCafeNum = (TextView) findViewById(R.id.txvCafeNum);
        txvTiempo = (TextView) findViewById(R.id.txvTiempo);
        btnMenos = (Button) findViewById(R.id.btnMenos);
        btnMas = (Button) findViewById(R.id.btnMas);
        btnComenzar = (Button) findViewById(R.id.btnComenzar);
        miContador = new Contador();
        txvTiempo.setText(String.valueOf(miContador.getTiempo()) + ":00");

        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txvTiempo.setText(miContador.disminuirTiempo() + ":00");
            }
        });

        btnMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txvTiempo.setText(miContador.aumentarTiempo() + ":00");
            }
        });

        btnComenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnMenos.setEnabled(false);
                btnMas.setEnabled(false);
                btnComenzar.setEnabled(false);
                miContadorDescendente = new MyCountDownTimer((miContador.getTiempo() * 1000 * 60),INTERVALO);
                miContadorDescendente.start();
            }
        });
    }

    public class MyCountDownTimer extends CountDownTimer {

        private int minutos;
        private int segundos;

        public MyCountDownTimer(long startTime, long interval)
        {
            super(startTime, interval);
        }

        @Override
        public void onTick(long millisUntilFinished) {
            minutos = (int)((millisUntilFinished / 1000)/60);
            segundos = (int)((millisUntilFinished / 1000)%60);
            if (segundos < 10) {
                txvTiempo.setText(String.valueOf(minutos + ":0" + segundos));
            }
            else {
                txvTiempo.setText(String.valueOf(minutos + ":" + segundos));
            }
        }

        @Override
        public void onFinish() {
            btnMenos.setEnabled(true);
            btnMas.setEnabled(true);
            btnComenzar.setEnabled(true);
            miContador.aumentarCafes();
            txvCafeNum.setText(String.valueOf(miContador.getCafes()));
        }
    }
}
