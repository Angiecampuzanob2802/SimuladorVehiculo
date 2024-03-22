/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.models;

/**
 *
 * @author Angie Campuzano Betancur
 */
public class Motor {
    
    ////atributos///
    private String nombre;
    private String cilindraje;
    private double velocidadMaxima;
    
    /////constructor////
    public Motor(String nombre,String cilindraje, double velocidadMaxima) {
        this.nombre=nombre;
        this.cilindraje = cilindraje;
        this.velocidadMaxima = velocidadMaxima;
    }
    
    ///metodos de acceso//

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
    
}
