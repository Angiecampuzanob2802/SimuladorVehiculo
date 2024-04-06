/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.exceptions;

/**
 *
 * @author Angie Campuzano Betancur & Alejandra Zapata
 */
public class Frenar6Exception extends Exception {
    public Frenar6Exception(){
        super("Acaba de frenar con más intensidad que la velocidad que llevaba");
    }

    public Frenar6Exception(String message) {
        super(message);
    }
    
}
