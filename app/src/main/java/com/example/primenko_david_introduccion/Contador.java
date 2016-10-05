package com.example.primenko_david_introduccion;

/**
 * Created by usuario on 4/10/16.
 */

public class Contador {
    private long tiempo;
    private int cafes;

    public Contador() {
        this.tiempo = 5;
        this.cafes = 0;
    }

    public Contador(long t, int c) {
        this.tiempo = t;
        this.cafes = c;
    }

    public String disminuirTiempo() {
        tiempo -= 1;

        if (tiempo < 1) {
            tiempo = 1;
        }

        return String.valueOf(tiempo);
    }

    public String aumentarTiempo() {
        tiempo += 1;

        if (tiempo > 59) {
            tiempo = 59;
        }

        return String.valueOf(tiempo);
    }

    public void aumentarCafes() {
        cafes += 1;
    }

    public long getTiempo() {
        return this.tiempo;
    }

    public int getCafes() {
        return this.cafes;
    }
}
