/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.models;
import java.util.ArrayList;

/**
 *
 * @author Angie Campuzano Betancur & Alejandra Zapata
 */
public class Llanta {
    ///atributos///
    private String nombre;
    private Integer tipo;
    private boolean frenar;
    private Integer limitePermitido;
    private ArrayList<Llanta>llantas;
    
    ////constructor///

    public Llanta(String nombre,Integer tipo,Integer limitePermitido) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.limitePermitido = limitePermitido;
    }
    //// metodos de acceso

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public boolean isFrenar() {
        return frenar;
    }

    public void setFrenar(boolean frenar) {
        this.frenar = frenar;
    }

    public Integer getLimitePermitido() {
        return limitePermitido;
    }

    public void setLimitePermitido(Integer limitePermitido) {
        this.limitePermitido = limitePermitido;
    }

    public ArrayList<Llanta> getLlantas() {
        return llantas;
    }
    public void setLlantas(ArrayList<Llanta> llantas) {
        this.llantas = llantas;
    }
    //// metodo////////
    public boolean validarLimitePermitido(Vehiculo v, ArrayList<Llanta> llantas, Integer velocidadFrenado){
        boolean patinado = false;
        for(Llanta llanta : llantas){
            if(llanta.getNombre().equals(v.getLlanta().getNombre())){
                if(velocidadFrenado > llanta.getLimitePermitido()){
                    patinado = true; 
                }
            }
        }
        return patinado;
    }
}
