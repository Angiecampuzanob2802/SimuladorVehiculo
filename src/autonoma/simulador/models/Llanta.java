/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.models;

/**
 *
 * @author Angie Campuzano Betancur
 */
public class Llanta {
    ///atributos///
    private String nombre;
    private String tipo;
    private double limitePermitido;
    
    ////constructor///
    public Llanta(String nombre,String tipo,double limitePermitido){
        this.nombre=nombre;
        this.tipo=tipo;
        this.limitePermitido=limitePermitido;
    }
    ///metodos de acceso///

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getLimitePermitido() {
        return limitePermitido;
    }

    public void setLimitePermitido(double limitePermitido) {
        this.limitePermitido = limitePermitido;
    }
    
}
