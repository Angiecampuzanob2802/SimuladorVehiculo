/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.models;
import autonoma.simulador.exceptions.ApagadoAccidental10Exception;
import autonoma.simulador.exceptions.CapacidadMotor8Exception;
import autonoma.simulador.exceptions.Frenar6Exception;
import autonoma.simulador.exceptions.FrenoInnecesario4Exception;
import autonoma.simulador.exceptions.Patinaje5Exception;
import autonoma.simulador.exceptions.RecuperarPatinaje9Exception;
import autonoma.simulador.exceptions.VehiculoApagado3Exception;
import autonoma.simulador.exceptions.VehiculoYaApagado2Exception;
import autonoma.simulador.exceptions.VehiculoYaEncendido1Exception;
import autonoma.simulador.exceptions.VelocidadExcesiva7Exception;

/**
 *
 * @author Angie Campuzano Betancur & Alejandra Zapata
 */
public class Simulador {
    ////atributos////////
    private Vehiculo vehiculo;
    
    ////// construtor/////
    public Simulador() {
        this.vehiculo = Taller.crearVehiculoDesdeArchivo();
    }
    //// metodos de acceso////

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    //////metodos/////
    public void encenderVehiculo() throws VehiculoYaEncendido1Exception{
        this.vehiculo.encender();
    }
    public void apagarVehiculo(Vehiculo v) throws VehiculoYaApagado2Exception, VelocidadExcesiva7Exception, ApagadoAccidental10Exception{
        this.vehiculo.apagar(v);
    }
    public void acelerarVehiculo(Integer aceleracion)throws VehiculoYaApagado2Exception, VehiculoApagado3Exception,CapacidadMotor8Exception,RecuperarPatinaje9Exception, ApagadoAccidental10Exception{
            this.vehiculo.acelerar(aceleracion,this.vehiculo);
    }
    public void frenarVehiculo(Integer intensidadFrenado)throws Patinaje5Exception, VehiculoApagado3Exception, FrenoInnecesario4Exception, Frenar6Exception, RecuperarPatinaje9Exception{
            this.vehiculo.frenar(intensidadFrenado,this.vehiculo);
    }
}