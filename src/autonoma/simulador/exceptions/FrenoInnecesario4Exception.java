/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.exceptions;

/**
 *
 * @author Angie Campuzano Betancur & Alejandra Zapata
 */
public class FrenoInnecesario4Exception extends Exception {
    public FrenoInnecesario4Exception (){
        super("El Vehiculo ya se encuentra detenido, es innecesario frenar ");
    }   
}
