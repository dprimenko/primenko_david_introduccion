package com.example.primenko_david_introduccion;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Created by dprimenko on 6/10/16.
 */

public class JuegoMemoria {

    private Drawable imgTemporal;
    private int aciertos;
    private TypedArray aImagenes;

    public Drawable getImgTemporal() {
        return imgTemporal;
    }

    public void setImgTemporal(Drawable imgTemporal) {
        this.imgTemporal = imgTemporal;
    }

    public JuegoMemoria(TypedArray aImagenes) {
        aciertos = 0;
        this.aImagenes = aImagenes;
    }

    public ArrayList<Drawable> RellenarHashtable() {

        ArrayList<Drawable> arrayBtnImg = new ArrayList<>();
        for (int i = 0; i < aImagenes.length(); i++){
            arrayBtnImg.add(aImagenes.getDrawable(i));
        }
        return arrayBtnImg;
    }

    public boolean ComprobarSimilitud(Drawable img) {

        boolean respuesta = false;

        if (img == imgTemporal) {
            respuesta = true;
            aciertos += 1;
        }

        return respuesta;
    }

    public boolean ComprobarJuegoAcabado() {
        boolean respuesta = false;

        if(aciertos == 10) {
            respuesta = true;
        }

        return respuesta;
    }

}
