//Daniel Alfredo Apesteguia Timoner. Lectura y escritura
package PildorasInformaticas;

import java.io.*;

public class pildoras4 {

    public static void main(String[] args) {
        int contador_bytes = 0;

        int datos_entrada[] = new int[10087];
        //long tamanyo = archivo_lectura.getChannel().size(); Método para obtener tamaño archivo
        try {

            FileInputStream archivo_lectura = new FileInputStream("C:/Users/alumn/Desktop/Rionacko.png");
            boolean final_archivo = false;
            while (!final_archivo) {
                int byte_entrada = archivo_lectura.read();
                if (byte_entrada != -1) {
                    datos_entrada[contador_bytes] = byte_entrada;
                } else {
                    final_archivo = true;
                }
                System.out.println(datos_entrada[contador_bytes]);
                contador_bytes++;
            }
            archivo_lectura.close();
            System.out.println(contador_bytes);
        } catch (IOException e) {
            System.out.print("Error accediendo a la imagen");
        }
        crea_fichero(datos_entrada);
    }

    static void crea_fichero(int datos_nuevo_fichero[]) {
        try {
            FileOutputStream archivo_creado = new FileOutputStream("C:/Users/alumn/Desktop/RionackoStream.png");
            for (int i = 0; i < datos_nuevo_fichero.length ; i++){
                archivo_creado.write(datos_nuevo_fichero[i]);
                
            }
            archivo_creado.close();   
        } catch (IOException e) {
            System.out.print("Error en la creación del archivo");
        }
    }

}
