/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.exceptions;

/**
 *
 * @author Angie Campuzano Betancur & Alejandra Zapata
 */
public class VehiculoYaApagado2Exception extends Exception {
    public VehiculoYaApagado2Exception(){
        super("El vehículo esta apagado,no se puede volver a apagar.");
    } 
    public VehiculoYaApagado2Exception(String mensaje){
        super(mensaje);
    }
}
