package com.example.primenko_david_introduccion;

/**
 * Created by VipSR on 03/10/2016.
 */
public class ConversionCmPulgadas {
    private double cambio;

    public ConversionCmPulgadas() {
        this.cambio = 0.39;
    }

    public String convertirACentimetros(String cantidad) {
        double valor =
                Double.parseDouble
                        (cantidad) / cambio;

        return
                String.format
                        ("%.2f", valor);
    }

    public String convertirAPulgadas(String cantidad) {
        double valor = Double.parseDouble(cantidad) * cambio;
        return
                String.format
                        ("%.2f", valor);
    }
}