/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.doce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Myrka
 */
public class Doce {

    public static void main(String[] args) throws IOException {
       try{
            String ruta= "c:/carpe1/archivoTexto.ups";
            FileWriter archivoEscritura = new FileWriter(ruta, true);
            
            BufferedWriter escritura = new BufferedWriter (archivoEscritura);
            escritura.append("hoal mundo");
            escritura.close();
            archivoEscritura.close();
        }catch(FileNotFoundException e1){
        System.out.println("ruta de archivo no encontrado");
        
        }catch (IOException e2){
        System.out.println("error de escritura");
        
        }catch (Exception e3){
        System.out.println("error general");
    }
    }
      /* try {
           String ruta="c:/carpe1/archivoTexto.ups";
           FileReader archivoLectura = new FileReader(ruta);
           BufferedReader lectura = new BufferedReader(archivoLectura);
           String linea="";
           while(linea!=null){
           linea=lectura.readLine();
           System.out.println(linea);
       }

           lectura.close();
           archivoLectura.close();
       } catch(FileNotFoundException e1) {
           System.out.println("Ruta de archivo no encontrada");
       } catch(IOException e2) {
          System.out.println("Error de lectura");
       }catch(Exception e3) {
           System.out.println("Error General");
       }
*/
 /*     try
       {
           String ruta="c:/carpe1/archivoRandomico.usp";
           RandomAccessFile archivoEscritura;
           archivoEscritura = new RandomAccessFile(ruta,"rw");
           archivoEscritura.writeInt(80);
           archivoEscritura.writeDouble(90.1);
           archivoEscritura.writeDouble(100.2);
           archivoEscritura.writeInt(80);
           //textowriteUTF = "voy a perder el ciclo");
           archivoEscritura.close();
       }
       catch(FileNotFoundException e1)
       {
           System.out.println("Ruta de archivo no encontrada");
       }
       catch(IOException e1)
       {
            System.out.println("Error de escritura");
       }
        catch (Exception e1)
        {
            System.out.println("Error General");
       }
    }
    */
 /*
          try
       {
           String ruta="c:/carpe1/archivoRandomico.usp";
           RandomAccessFile archivoLectura;
           archivoLectura = new RandomAccessFile(ruta,"r");
           archivoLectura.seek(12);
           double x = archivoLectura.readDouble();
           System.out.println("x");
           archivoLectura.close();
       }
       catch(FileNotFoundException e1)
       {
           System.out.println("Ruta de archivo no encontrada");
       }
       catch(IOException e1)
       {
            System.out.println("Error de escritura");
       }
        catch (Exception e1)
        {
            System.out.println("Error General");
       }
    }
    */
}
