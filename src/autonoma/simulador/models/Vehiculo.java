/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.models;

/**
 *
 * @author Angie Campuzano Betancur
 */
public class Vehiculo {
    ////atributos/////
    private double velocidad;
    private Llanta llanta;
    private Motor motor;
    private boolean encendido;
    
    ////constructor////
    public Vehiculo(Llanta llanta, Motor motor) {
        this.llanta = llanta;
        this.motor = motor;
        this.velocidad=0;
        this.encendido = false;
    }
    //// metodos acceso////
    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public Llanta getLlanta() {
        return llanta;
    }

    public void setLlanta(Llanta llanta) {
        this.llanta = llanta;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    } 
}