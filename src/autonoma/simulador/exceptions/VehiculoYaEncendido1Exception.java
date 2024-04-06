/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.exceptions;

/**
 *
 * @author Angie Campuzano Betancur & Alejandra Zapata
 */
public class VehiculoYaEncendido1Exception extends Exception{
    public VehiculoYaEncendido1Exception(){
    super("El vehículo esta encendido, no se puede volver a encender.");
    }   
}
