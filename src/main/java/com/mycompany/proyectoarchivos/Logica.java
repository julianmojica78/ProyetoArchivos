
package com.mycompany.proyectoarchivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;


/*
*La clase logica es utilizada para crear los metodos en los cuales se
* crean la listas y validar los datos en ella 
*/

public class Logica {
   
    public HashMap<Integer,Persona> persona;
    private static final String ubicacion = "archivo.txt";
    
    /*
    *contructor de la clase logica en la cual se llaman los metodos para ejecutarlos
    */
    public Logica() {
    validarDatos();
   }
    
    /*
    *
    *metodo en el cual se crea la lista 
    */
     public void grabarLista(HashMap<Integer,Persona> lista) {  
        try {
            ObjectOutputStream mostrar  = new ObjectOutputStream(new FileOutputStream(ubicacion));
            mostrar.writeObject(lista);
            
            mostrar.close();
        } catch (IOException ex) {
            System.err.println("no se pudo grabar la infromación!!!");
            ex.printStackTrace();
        }//catch
    }// metodo
       /*
    *
    *metodo en el cual se valida los datos insertados en la lista 
    */
    private void validarDatos() {
     try {
            
           File file = new File(ubicacion);
           
            if (!file.exists()) {
                file.createNewFile();
                persona=new HashMap<>();
                grabarLista(persona);
               
            }//if
        } catch (IOException e) {
            e.printStackTrace();
        }//catch
    }//metodo
   
      /*
    *
    *metodo en el cual se buscan los datos en la lista
    *
    */
 
    public HashMap<Integer,Persona> obtenerListasActuales() {
        persona=new HashMap<>();
        try {
            ObjectInputStream entrada =  new ObjectInputStream(new FileInputStream(ubicacion));
            persona = (HashMap<Integer,Persona>) entrada.readObject();
  
        } catch (IOException | ClassNotFoundException ex) {
            System.err.println("no se pudo encontrar la lista!!!");
            ex.printStackTrace();
        } 
        
        return persona;
    }//mapa
    
    
    
    
    }
