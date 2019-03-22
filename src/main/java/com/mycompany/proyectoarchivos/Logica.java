/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoarchivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David
 */
public class Logica {
    
    public Logica() {
        //registro();
        leer();
    }
    Scanner sn = new Scanner(System.in);
    public void registro(){
    List<Persona> persona1 = new ArrayList<>();
    System.out.println("Ingrese el codigo:\n");
    int codigo = sn.nextInt();
    System.out.println("Ingrese el nombre:\n");
    String nombre = sn.next();
    System.out.println("Ingrese el apellido:\n");
    String apellido = sn.next();     
    System.out.println("Ingrese el codigo:\n");
    int codigoR = sn.nextInt();
    System.out.println("Ingrese la empresa:\n");
    String empresa = sn.next();
    System.out.println("Ingrese el estado:\n");
    String estado = sn.next();   
    System.out.println("Ingrese el valor:\n");
    float valor = sn.nextFloat();  
    Persona persona2 = new Persona(codigo, nombre, apellido);
    persona2.persona.add(persona2);
    Record record1 = new Record(codigoR, empresa, true,valor);
    persona2.record.add(record1);
    escribir(persona2);
           
    }
    public void leer() {

        ObjectInputStream ois;
        try {
            ois = new ObjectInputStream(new FileInputStream("C:\\Users\\David\\Documents\\NetBeansProjects\\proyectoConcesionario\\ProyectoArchivos\\Archivos\\Text.txt"));
            Object aux = ois.readObject();
            while (aux!=null){
                String str = (String)ois.readObject();
                Persona persona = (Persona)ois.readObject();
                System.out.println("codigo: "+persona.getCodigo());
                System.out.println("Nombre: "+persona.getNombre());
                System.out.println("Apellido: "+persona.getApellido());
        }
        ois.close();
        } catch (IOException ex) {
            Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
            

    
    public void escribir(Persona persona2) {
        ObjectOutputStream oos;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\David\\Documents\\NetBeansProjects\\proyectoConcesionario\\ProyectoArchivos\\Archivos\\Text.txt"));
            oos.writeObject(persona2);
        } catch (IOException ex) {
            Logger.getLogger(Logica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
