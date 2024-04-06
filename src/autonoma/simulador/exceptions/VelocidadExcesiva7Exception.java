/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.exceptions;

/**
 *
 * @author Angie Campuzano Betancur & Alejandra Zapata
 */
public class VelocidadExcesiva7Exception extends Exception {
    public VelocidadExcesiva7Exception(){
        super(" Si su velocidad es superiora 60 km/h este se accidentara ");
    }
    public VelocidadExcesiva7Exception(String mensaje){
      super(mensaje);
    }
}
