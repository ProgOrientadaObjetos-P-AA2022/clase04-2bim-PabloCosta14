/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public abstract class Automovil {

    protected String nombre;
    protected String placa;
    protected double valorC;

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public String obtenerPlaca() {
        return placa;
    }

    public void establecerPlaca(String n) {
        placa = n;
    }

    public double obtenerValorC() {
        return valorC;
    }

    public abstract void calcularValorCancelar();

    @Override
    public String toString() {
        String cadena = String.format("Datos del Propietario\nNombre del"
                + " Propietario %s\n"
                + "Placa del automovil: %s\nValor a cancelar: %.2f\n",
                nombre,
                placa,
                obtenerValorC());
        return cadena;
    }
}
