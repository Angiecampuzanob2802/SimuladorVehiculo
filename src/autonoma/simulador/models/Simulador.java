/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.models;

/**
 *
 * @author Angie Campuzano Betancur
 */
public class Simulador {
    private boolean encendido = false;
    private int velocidad = 0;
    private Motor motor;

    public Simulador(Motor motor) {
        this.motor = motor;
    }    
    public void encender() {
        if (!encendido) {
            encendido = true;
            System.out.println("El vehículo ha sido encendido.");
        } else {
            System.out.println("El vehículo ya está encendido.");
        }
    }
    public void apagar() {
        if (encendido) {
            encendido = false;
            System.out.println("El vehículo ha sido apagado.");
        } else {
            System.out.println("El vehículo ya está apagado.");
        }
    }

    public void acelerar(int magnitud) {
        if (encendido) {
            if (velocidad + magnitud <= motor.getVelocidadMaxima()) {
                velocidad += magnitud;
                System.out.println("El vehículo ha acelerado a " + velocidad + " Km/h.");
            } else {
                accidentar("acelerar");
            }
        } else {
            System.out.println("No se puede acelerar. El vehículo está apagado.");
        }
    }

    public void frenar(int magnitud) {
        if (encendido) {
            if (velocidad - magnitud >= 0) {
                velocidad -= magnitud;
                System.out.println("El vehículo ha frenado a " + velocidad + " Km/h.");
            } else {
                velocidad = 0;
                System.out.println("El vehículo ha frenado completamente.");
            }
        } else {
            System.out.println("No se puede frenar. El vehículo está apagado.");
        }
    }

    public void frenarBruscamente(int magnitud) {
        if (encendido) {
            if (magnitud > 30) {
                System.out.println("Frenado brusco detectado. El vehículo patina.");
            } else {
                frenar(magnitud);
            }
        } else {
            System.out.println("No se puede frenar bruscamente. El vehículo está apagado.");
        }
    }

    public void accidentar(String accion) {
        System.out.println("El vehículo se ha accidentado al intentar " + accion + " con una velocidad excesiva.");
        apagar();
        velocidad = 0;
    }  
}

