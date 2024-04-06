/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.exceptions;

/**
 *
 * @author Angie Campuzano Betancur & Alejandra Zapata
 */
public class RecuperarPatinaje9Exception extends Exception  {
        public RecuperarPatinaje9Exception(){
        super("Si el vehiculo patina este pierde el control y sólo se recupera cuando se ha detenido por completo.");
    }
     public RecuperarPatinaje9Exception(String mensaje){
      super(mensaje);
    }    
    
}
