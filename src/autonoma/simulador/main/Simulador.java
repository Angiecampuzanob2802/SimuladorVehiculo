/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.main;
import autonoma.simulador.models.Llanta;
import autonoma.simulador.models.Motor;
import autonoma.simulador.models.Vehiculo;
import autonoma.simulador.views.VentanaPrincipal1;




/**
 *
 * @author Angie Campuzano Betancur
 */
public class Simulador {
    
    public static void main(String[] args){
        
        Llanta llanta = new Llanta("Michelin","Bonitas",70);
        Motor motor = new Motor("Tezuka","3000 cc", 220);
        
        Vehiculo vehiculo= new Vehiculo(llanta, motor);
        
        VentanaPrincipal1 ventana= new VentanaPrincipal1(vehiculo);
        ventana.setVisible(true);
        
        VentanaPrincipal1 reproducir= new VentanaPrincipal1(vehiculo);
        reproducir.setVisible(true);

    }
        
}
