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
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
        


/**
 *
 * @author Angie Campuzano Betancur & Alejandra Zapata
 */
public class Vehiculo {
    ////atributos/////
    private Timer temporizador = new Timer();
    private Integer velocidad;
    private Llanta llanta;
    private Motor motor;
    private boolean patinando;
    private boolean acelerado;
    ArrayList<Motor>validarMotores;

    ////constructor////
    public Vehiculo(Motor motor, Llanta llanta) {
        this.llanta = llanta;
        this.motor = motor;
        this.velocidad=0;
        this.patinando=false;
        this.acelerado=false;
  
    }
    //// metodos acceso////

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
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

    public boolean isPatinando() {
        return patinando;
    }

    public void setPatinando(boolean patinando) {
        this.patinando = patinando;
    }

    public boolean isAcelerado() {
        return acelerado;
    }

    public void setAcelerado(boolean acelerado) {
        this.acelerado = acelerado;
    }

    public ArrayList<Motor> getValidarMotores() {
        return validarMotores;
    }

    public void setValidarMotores(ArrayList<Motor> validarMotores) {
        this.validarMotores = validarMotores;
    }
    
    /////metodos////////
    
    public void encender()throws VehiculoYaEncendido1Exception{
        this.motor.encender();
    }

    public void apagar(Vehiculo v)throws VehiculoYaApagado2Exception,VelocidadExcesiva7Exception,ApagadoAccidental10Exception{
        this.motor.apagar();
        if (velocidad > 60) {
            accidentarVehiculo(v);
            throw new VelocidadExcesiva7Exception("El vehiculo se accidento por apagarlo mientras iba a más de 60Km/h");
        }
    }
    public void acelerar(Integer velocidad,Vehiculo v) throws CapacidadMotor8Exception, VehiculoApagado3Exception,RecuperarPatinaje9Exception, VehiculoYaApagado2Exception, ApagadoAccidental10Exception{
        if (llantaPatina(patinando)==true){
        v.setPatinando(true);
        throw new RecuperarPatinaje9Exception();
        } else {
            Integer nVelocidad = this.velocidad + velocidad;
            if (v.getMotor().isEncendido()==true){
                v.setVelocidad(velocidad);
                if(!accidentarVehiculo(v)){
                    v.setVelocidad(nVelocidad);
                    v.setAcelerado(true);
                }
            }else{
                throw new VehiculoApagado3Exception();
            }
        }
    }
        public void frenar(Integer intensidadFrenado,Vehiculo v) throws VehiculoApagado3Exception,FrenoInnecesario4Exception,Patinaje5Exception,Frenar6Exception, FrenoInnecesario4Exception,RecuperarPatinaje9Exception{
            if(llantaPatina(patinando)== true){
                v.setPatinando(true);
                throw new RecuperarPatinaje9Exception("Su vehiculo está patinando y por ende perdio el control.");
            }else{
                Integer nVelocidad = v.getVelocidad() - intensidadFrenado;
                if(v.getMotor().isEncendido()==false){
                    throw new VehiculoApagado3Exception();
                }
                if(v.getVelocidad()==0){
                    throw new FrenoInnecesario4Exception();
                }
                if (intensidadFrenado > 30&& v.getLlanta().validarLimitePermitido(v,v.getLlanta().getLlantas(),intensidadFrenado)) {
                v.setPatinando(true);
                    throw new Frenar6Exception("Se freno con la misma intensidad,el vehiculo patino.");
                }
                if(nVelocidad > v.getVelocidad()){
                v.setPatinando(true);
                    throw new Patinaje5Exception("Se  ha superado el limite de las llantas.");
                } 
            }
        }
    public boolean accidentarVehiculo(Vehiculo v)throws VehiculoYaApagado2Exception,ApagadoAccidental10Exception{
        boolean accidentado=false;
        if(this.motor.validarVelocidadMaxima(v.getMotor(), validarMotores, v.velocidad)){
            this.motor.apagar();
            accidentado=true;
            throw new ApagadoAccidental10Exception();
        }else{
            return accidentado;
        }      
    }
    public boolean llantaPatina(boolean patinando){
        // Crea un arreglo de un solo elemento para almacenar el valor de patinando
        final boolean[] patinandoArray = new boolean[1];
        patinandoArray[0] = patinando;

        // Si la llanta no está patinando, comienza el temporizador
        if (!patinandoArray[0]) {
            temporizador.schedule(new TimerTask(){
                
                @Override
                public void run()
                {
                    // Al completarse el temporizador, establece patinando como falso
                    patinandoArray[0] = false;
                    // Puedes realizar cualquier acción adicional aquí según sea necesario
                    System.out.println("El temporizador ha completado su ejecución.");
                }
            }, 5000); // Programa el temporizador para que se ejecute después de 5 segundos (5000 milisegundos)
        }
        // Devuelve el estado de patinando
        return patinandoArray[0];
    }
    public void llantaStopPatina() throws InterruptedException 
    {
       this.patinando = false;
        Thread.sleep(10000);
         
    }
}    