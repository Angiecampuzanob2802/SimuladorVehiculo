/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.models;
import autonoma.simulador.exceptions.VehiculoYaApagado2Exception;
import autonoma.simulador.exceptions.VehiculoYaEncendido1Exception;
import java.util.ArrayList;

/**
 *
 * @author Angie Campuzano Betancur & Alejandra Zapata
 */
public class Motor {
    
    ////atributos///
    private String cilindraje;
    private Integer velocidadMaxima;
    private boolean encendido;

    /////constructor////
     public Motor(String cilindraje){
        this.cilindraje = cilindraje;
    }
     public Motor(String cilindraje, Integer velocidadMaxima){
        this.cilindraje = cilindraje;
        this.velocidadMaxima = velocidadMaxima;
    }
    public Motor(Integer velocidadMaxima){
        this.cilindraje = cilindraje;
        this.velocidadMaxima = velocidadMaxima;
        this.encendido= false;
    }
    ///metodos de acceso//

    public String getCilindraje() {
        return cilindraje;
    }
    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(Integer velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    public boolean isEncendido() {
        return encendido;
    }
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    ///// metodos////
    
    public void encender()throws VehiculoYaEncendido1Exception {
        if(this.encendido){
            throw new VehiculoYaEncendido1Exception();
        }else{
            this.encendido=true;
        }
    }
    
    public void apagar ()throws VehiculoYaApagado2Exception {
        if(!this.encendido){
            throw new VehiculoYaApagado2Exception();
        }else{
            this.encendido=false;
        }
    }
    public boolean validarVelocidadMaxima(Motor m,ArrayList<Motor>motores,Integer aceleracion){
         boolean choque=false;
        for(Motor motor : motores)
        {
            if (motor.getCilindraje().equals(m.getCilindraje()))
            {
                if (aceleracion>motor.getVelocidadMaxima()) 
                {
                    choque=true;
                }
            }
        }
        return choque;
    }
}
