/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil {

    private int numeroLitro;
    private double costoLitro;
    private double descuento;

    public int obtenerNumeroLitro() {
        return numeroLitro;
    }

    public void establecerNumeroLitro(int n) {
        numeroLitro = n;
    }

    public double obtenerCostoLitro() {
        return costoLitro;
    }

    public void establecerCostoLitro(double n) {
        costoLitro = n;
    }

    public double obtenerDescuento() {
        return descuento;
    }

    public void calcularDescuento(double n) {
        descuento = (numeroLitro * n) / 100;
    }

    @Override
    public void calcularValorCancelar() {
        valorC = (costoLitro - descuento) * costoLitro;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n", super.toString());
        cadena = String.format("%sNumero de Litros %s\n"
                + "Costo Litro %s\n %s",
                cadena,
                obtenerNumeroLitro(),
                obtenerCostoLitro(),obtenerValorC());

        return cadena;
    }

}
