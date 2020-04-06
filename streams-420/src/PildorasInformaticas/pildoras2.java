//Daniel Alfredo Apesteguia Timoner. Escribiendo
package PildorasInformaticas;

import java.io.*;

public class pildoras2 {

    public static void main(String[] args) {
        Escribiendo accede_es = new Escribiendo();
        
        accede_es.escribir();
    }
}

    class Escribiendo {

        public void escribir() {

            String frase = "Esto es una prueba de escritura";
            
            try{
                //Si agrego un true al final del FileWrite agregaré envez de sobrescribir
                FileWriter escritura = new FileWriter("C:/Users/alumn/Desktop/texto_nuevo.txt");
                
                for(int i = 0; i < frase.length(); i++){ //Agregar todos los carácteres de la frase
                    escritura.write(frase.charAt(i));
                }
                System.out.println("Archivo creado correctamente.");
                
                escritura.close();
            }
            catch(IOException  e){
                System.out.println("Error de JAVAIO.");
            }
        }
    
}

