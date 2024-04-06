/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.exceptions;

/**
 *
 * @author Angie Campuzano Betancur & Alejandra Zapata
 */
public class Patinaje5Exception extends Exception {
    public Patinaje5Exception(){
        super("¡¡Oh no!!supere el limite permitido por las llantas,patinaran");
    }   
    public Patinaje5Exception(String mensaje){
      super(mensaje);
    }
}
