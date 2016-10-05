package com.example.primenko_david_introduccion;

/**
 * Created by usuario on 27/09/16.
 */

public class ConversionDivisa {
    private double cambio;

    public ConversionDivisa() {
        this.cambio = 0.89;
    }

    public ConversionDivisa(double c) {
        this.cambio = c;
    }

    public String convertirADolares(String cantidad) {
        double valor =
                Double.parseDouble
                        (cantidad) / cambio;
        return
                String.format
                        ("%.2f", valor);
    }

    public String convertirAEuros(String cantidad) {
        double valor = Double.parseDouble(cantidad) * cambio;
        return
                String.format
                        ("%.2f", valor);
    }
}
