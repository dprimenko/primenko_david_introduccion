package com.example.primenko_david_introduccion;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;

public class JuegoMemoria_Activity extends AppCompatActivity {

    private int cartasLevantadas;
    private ImageButton btnTemporal;
    private ArrayList<Drawable> arrayBtnImg;
    private JuegoMemoria juego;
    private Drawable cartaLevantada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_memoria);
        arrayBtnImg = new ArrayList<>();
        cartasLevantadas = 0;

        IniciarJuego();

    }
    public void darVuelta (View v) {

        ImageButton btn = (ImageButton)v;
        cartasLevantadas += 1;

        if (cartasLevantadas < 2) {
            btnTemporal = btn;
            cartaLevantada = arrayBtnImg.get(Integer.parseInt(btn.getTag().toString()));
            juego.setImgTemporal(cartaLevantada);
            btn.setImageDrawable(cartaLevantada);
            btn.setEnabled(false);
        }
        else {
            cartaLevantada = arrayBtnImg.get(Integer.parseInt(btn.getTag().toString()));
            btn.setImageDrawable(cartaLevantada);


            if (!(juego.ComprobarSimilitud(cartaLevantada))) {
                btnTemporal.setEnabled(true);
                /*btnTemporal.setImageResource(R.mipmap.ic_launcher);
                btn.setImageResource(R.mipmap.ic_launcher);*/
                Toast.makeText(this, "Son diferentes", Toast.LENGTH_LONG).show();

            }
            else {
                btnTemporal.setEnabled(false);
                btn.setEnabled(false);
            }

            cartasLevantadas = 0;
        }
    }

    public void IniciarJuego() {
        /*Random rnd = new Random();
        int numAleatorio = rnd.nextInt(5);*/
        int numAleatorio = 5;
        TypedArray aImagenes;

        switch (numAleatorio) {
            case 1:
                aImagenes = getResources().obtainTypedArray(R.array.posicionDos);
                break;
            case 2:
                aImagenes = getResources().obtainTypedArray(R.array.posicionTres);
                break;
            case 3:
                aImagenes = getResources().obtainTypedArray(R.array.posicionCuatro);
                break;
            case 4:
                aImagenes = getResources().obtainTypedArray(R.array.posicionCinco);
                break;
            default:
                aImagenes = getResources().obtainTypedArray(R.array.posicionUno);
                break;
        }

        juego = new JuegoMemoria(aImagenes);
        arrayBtnImg = juego.RellenarHashtable();

        Toast.makeText(this, "Listo", Toast.LENGTH_LONG).show();
    }
}
