//Daniel Alfredo Apesteguia Timoner. Leyendo
package PildorasInformaticas;

import java.io.*;

public class pildoras1 {

    public static void main(String[] args) {
        Leer_Fichero accediendo = new Leer_Fichero();

        accediendo.lee();

    }
}

class Leer_Fichero {

    public void lee() {

        try {
            FileReader entrada = new FileReader("C:/Users/alumn/Desktop/ok.log");
            int c = entrada.read();
            while (c != -1) {
                char letra = (char) c; //Convierte el valor en bits en su carácter
                System.out.print(letra); //Con ln saldrá un carácter por línea, sin ln saldrá una frase
                c = entrada.read();
            }
            entrada.close();
        } catch (IOException e) {
            System.out.println("Archivo no encontrado.");
        }
    }
}
