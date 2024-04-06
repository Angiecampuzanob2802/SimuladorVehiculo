/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.simulador.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Angie Campuzano Betancur & Alejandra Zapata
 */
public class Taller {
    
    public static Vehiculo crearVehiculoDesdeArchivo() {
    File fichero = new File("C:\\Users\\dioge\\OneDrive\\Documentos\\NetBeansProjects\\Simulador\\src\\taller.txt");
            Scanner s = null;
            int contador =1;
            Llanta l= new Llanta(null, null, 0);
            Motor m = new Motor(0);
            Vehiculo v = new Vehiculo(null, null);

            try {
                    System.out.println("... Leemos el contenido del fichero ...");
                    s = new Scanner(fichero);
                    
                    while (s.hasNextLine()) {
                        Scanner lineaScanner = new Scanner(s.nextLine());
                        lineaScanner.skip("\\w+\\s");
                        String palabra = lineaScanner.next();
                        if(contador == 1){
                            l.setNombre(palabra);
                        }else{
                             m.setCilindraje(palabra);
                        }
                        System.out.println(palabra);
                        lineaScanner.close();
                        contador++;
                    }
                 v= new Vehiculo(m, l);
                 v.setMotor(m);
                 v.setLlanta(l);
               return v;  

            } catch (FileNotFoundException ex) {
                    System.out.println("Mensaje: " + ex.getMessage());
            } finally {
                try {
                        if (s != null)
                                s.close();
                } catch (Exception ex2) {
                        System.out.println("Mensaje 2: " + ex2.getMessage());
                }
            }
        return null;
    }
}       



