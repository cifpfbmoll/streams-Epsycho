//Daniel Alfredo Apesteguia Timoner. Buffer
package streams;

import java.io.*;

public class pildoras3 {

    public static void main(String[] args) {
        Buffing accesoAlBuffer = new Buffing();
        accesoAlBuffer.lee();

    }
}

class Buffing {

    public void lee() {

        try {
            FileReader entrada = new FileReader("C:/Users/alumn/Desktop/ok.log");
            BufferedReader mibuffer = new BufferedReader(entrada);
            //int c = 0; Ya no hace falta
            String linea=" ";
            while (linea!=null) {
                System.out.println(linea); 
                linea = mibuffer.readLine();
                 
            }
            entrada.close();
        } catch (IOException e) {
            System.out.println("Archivo no encontrado.");
        }
    }
}
