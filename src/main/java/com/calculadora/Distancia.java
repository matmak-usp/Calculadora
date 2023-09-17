package com.calculadora;

public class Distancia {
    private final double milhasEmQuilometros = 1.609;
    private final double quilometrosEmMilhas = 0.6214;

    public double ConverterQuilometrosParaMilhas(double quilometros) {
        double resultado = quilometros * quilometrosEmMilhas;
        return resultado;
    }

    public double ConverterMilhasParaQuilometros(double milhas) {
        double resultado = milhas * milhasEmQuilometros;
        return resultado;
    }
}