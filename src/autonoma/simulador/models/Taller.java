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
                    // Leemos el contenido del fichero
                    System.out.println("... Leemos el contenido del fichero ...");
                    s = new Scanner(fichero);
                    //s.skip(Pattern.compile(" "));
                    // Leemos linea a linea el fichero
                    while (s.hasNextLine()) {
                        //String linea2 = s.next(); 	// Guardamos la linea en un String
                        //System.out.println(linea2);      // Imprimimos la linea
                        // Utilizamos Scanner para leer la línea
                        Scanner lineaScanner = new Scanner(s.nextLine());
                        // Omitimos la primera palabra (llantas o motor)
                        lineaScanner.skip("\\w+\\s");
                        // Leemos y almacenamos la segunda palabra (Bonitas o 3000)
                        String palabra = lineaScanner.next();
                        if(contador == 1){
                            l.setNombre(palabra);
                        }else{
                             m.setCilindraje(palabra);
                        }
                        System.out.println(palabra);
                        // Cerramos el Scanner de la línea
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
                    // Cerramos el fichero tanto si la lectura ha sido correcta o no
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



