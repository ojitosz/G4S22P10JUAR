/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s22p10aggr.Almacen;

import g4s22p10aggr.informacion.Datos;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author arman
 */
public class Archivo {
    
    public void grabar(Datos datos ){
      try{
          
          FileWriter archivo = new FileWriter("datos.txt" , true);
          BufferedWriter bw = new BufferedWriter(archivo);
          bw.write(datos .getNombre() + "\n");
          bw.write(datos.getEdad() + "\n");
          bw.close();
          
      }catch(Exception ex){
          ex.printStackTrace();
      }  
    }
    public List<Datos> leer (){
        List<Datos> Listadatos = new ArrayList<>();
        Datos datos = new Datos();
        String cadena="";
        try{
            FileReader archivo = new FileReader("datos.txt");
            BufferedReader br = new BufferedReader(archivo);
            while ((cadena = br readLine()) != null){
            datos.setNombre(cadena);
            cadena = br . readLine();
            datos.setEdad(Integer.parseInt(cadena));
            Listadatos.add(datos);
            
        }
            
        }catch(Exception ex){
            ex.printStackTrace();
            
        }
        return Listadatos;
        
    }

    private void readLine() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void Line() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
