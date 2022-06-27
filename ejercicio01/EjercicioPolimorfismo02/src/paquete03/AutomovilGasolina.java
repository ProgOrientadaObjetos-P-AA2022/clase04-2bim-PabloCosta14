/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilGasolina extends Automovil {

    private int numeroGalones;
    private double costoGalon;
    private double iva;

    public int obtenerNumeroGalones() {
        return numeroGalones;
    }

    public void establecerNumeroGalones(int n) {
        numeroGalones = n;
    }

    public double obtenerCostoGalon() {
        return costoGalon;
    }

    public void establecerCostoGalon(double n) {
        costoGalon = n;
    }

    public double obtenerIva() {
        return iva;
    }

    public void establecerIva() {
        iva = ((costoGalon * numeroGalones) * 10) / 100;
    }

    @Override
    public void calcularValorCancelar() {
        valorC = (costoGalon * numeroGalones) + iva;
    }

    @Override
    public String toString() {
        String cadena = String.format("%s\n", super.toString());
        cadena = String.format("%sNumero de Galones %s\n"
                + "Costo Galon %s\n",
                cadena,
                obtenerNumeroGalones(),
                obtenerCostoGalon());

        return cadena;
    }

}
