/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.exceptions;

/**
 *
 * @author Angie Campuzano Betancur & Alejandra Zapata
 */
public class CapacidadMotor8Exception extends Exception {
    public CapacidadMotor8Exception(){
        super("La velocidad excedió el limite permitido por el motor");
    }
    
}
