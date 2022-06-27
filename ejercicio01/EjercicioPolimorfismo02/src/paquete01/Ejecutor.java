/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;
import java.util.Scanner;
import paquete02.Automovil;
import paquete03.AutomovilGasolina;
import paquete04.AutomovilDiesel;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
       
       String nombrePropietario;
       String placa;
      //-----------------------------
       int numeroGalones;
       double costoGalon;
      //-------------------------------- 
       int numeroLitros;
       double costoLitros;
       double descuento;
       
       ArrayList<Automovil> auto = new ArrayList ();
       
       AutomovilGasolina ag = new AutomovilGasolina();
       ag.establecerNombre("Juan");
       ag.establecerPlaca("LBDD234");
       ag.establecerCostoGalon(3);
       ag.establecerNumeroGalones(20);
       ag.establecerIva();
       ag.calcularValorCancelar();
       ag.obtenerValorC();
       auto.add(ag);
        System.out.println(ag.obtenerValorC());
        
      /* AutomovilGasolina ag2 = new AutomovilGasolina();
       ag.establecerNombre("Jhole");
       ag.establecerPlaca("LBS4784");
       ag.establecerCostoGalon(2.00);
       ag.establecerNumeroGalones(20);
       ag.establecerIva();
       ag.calcularValorCancelar();
       
       auto.add(ag);*/
       
       AutomovilDiesel ad = new AutomovilDiesel();
       ad.establecerNombre("Andy");
       ad.establecerPlaca("LBD2342");
       ad.establecerNumeroLitro(2);
       ad.establecerCostoLitro(20);
       ad.calcularDescuento(10);
       ad.calcularValorCancelar();
       auto.add(ad);
       System.out.println(ad.obtenerCostoLitro());
        System.out.println(ad.obtenerDescuento());
        System.out.println(ad.obtenerNumeroLitro());
       
       
       AutomovilDiesel ad2 = new AutomovilDiesel();
       
    }
}
