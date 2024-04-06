/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.exceptions;

/**
 *
 * @author Angie Campuzano Betancur & Alejandra Zapata
 */
public class VehiculoApagado3Exception extends Exception {
    public VehiculoApagado3Exception(){
    super("No se puede acelerar, ni frenar puesto que el vehiculo ya se encuentra apagado");
    }
    
}
