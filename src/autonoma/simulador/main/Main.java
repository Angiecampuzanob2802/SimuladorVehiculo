/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.main;
import autonoma.simulador.models.Llanta;
import autonoma.simulador.models.Motor;
import autonoma.simulador.models.Simulador;
import autonoma.simulador.models.Taller;
import autonoma.simulador.models.Vehiculo;
import autonoma.simulador.views.VentanaPrincipal1;
import java.util.ArrayList;

/**
 *
 * @author Angie Campuzano Betancur & Alejandra Zapata
 */
public class Main {
    
    public static void main(String[] args) throws Exception{
        Simulador simulador=new Simulador();
        Vehiculo vehiculo = Taller.crearVehiculoDesdeArchivo();
        simulador.setVehiculo(vehiculo);
    
        ArrayList<Motor> motores = new ArrayList<>();
        motores.add(new Motor("1000cc", 100));
        motores.add(new Motor("2000cc", 160));
        motores.add(new Motor("3000cc", 220));
       
        ArrayList<Llanta> llantas = new ArrayList<>();
        llantas.add(new Llanta("Buenas",  110,0 ));
        llantas.add(new Llanta("Bonitas", 70, 0)); 
        llantas.add(new Llanta("Baratas", 50, 0));
        
        vehiculo.setValidarMotores(motores);
        vehiculo.getLlanta().setLlantas(llantas);
        
        System.out.println("Soy el coche " + vehiculo.getLlanta().getNombre()+"\ncon "+vehiculo.getMotor().getCilindraje()+" de cilindraje");
               
        VentanaPrincipal1 reproducir= new VentanaPrincipal1(simulador);
        reproducir.setVisible(true);
        
        VentanaPrincipal1 ventana= new VentanaPrincipal1(simulador);
        ventana.setVisible(true);
        
    }
}

