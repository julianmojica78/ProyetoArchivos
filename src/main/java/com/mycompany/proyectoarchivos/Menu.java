/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoarchivos;

import java.util.Scanner;
import java.io.Serializable;
import java.util.HashMap;


/**
 *clase menu en la cual se mostrara las funcionalidades del programa
 * 
 * @author stevenpc
 */
public class Menu implements Serializable {
   private HashMap<Integer, Persona> Personas = new HashMap<>();
   

/*
   constructor del menu 
   
   */
public Menu() {
        Logica log = new Logica();
        Personas = log.obtenerListasActuales();
    }
  public void principal() {
        Scanner sc = new Scanner(System.in);
        boolean valida = true;
        int opcion = 0;
        do {
            System.out.println("//////////////////////////");
            System.out.println("// 1.Insertar Persona . //");
            System.out.println("// 2. Insertar Reporte. //");
            System.out.println("// 3. Eliminar  reporte //.");
            System.out.println("// 4. Mostrar clientes. //");
             System.out.println("//////////////////////////");

            do {
                try {
                    opcion = sc.nextInt();
                } catch (NumberFormatException e) {
                    System.err.println("ingrese un  numero válido");
                    valida = false;
                }
            } while (!valida);

            switch (opcion) {
                case 1:
                    agregarCliente();
                    break;
                case 2:
                    insertarReporte();
                      break;
            
                case 3:
                
                borrarReporte();
                      break;
                    
                case 4:
                    mostarCliente();
                      break;
                    
            }
        } while (opcion < 5);
        System.out.println("ingrese una opcion correcta ");
    }
/**
 * metodo en el cual se ingresan los datos de los clientes 
 * 
 */
    private void agregarCliente() {

        Scanner sc = new Scanner(System.in);
        int documento;
        String nombre, apellido;
        Logica log = new Logica();
        System.out.println("codigo: ");
        documento = sc.nextInt();
        System.out.println("Nombre: ");
        nombre = sc.next();
        System.out.println("Apellido: ");
        apellido = sc.next();
        Persona persona = new Persona(documento, nombre, apellido);
        Personas.put(documento, persona);
        log.grabarLista(Personas);
    }
/**
 * metodo en el cual se ingresan los reportes a los clientes 
 * 
 */
    private void insertarReporte() {
        Scanner sc = new Scanner(System.in);
        int documento;
        System.out.println("ingrese el codigo de la persona a quien le agregara el reporte: ");
        documento = sc.nextInt();
   
        if (Personas.containsKey(documento)) {
        int codigoRecord;
        float valor;
        boolean estado;
        String empresa;
        Logica log = new Logica();
        System.out.println("Codigo: ");
        codigoRecord = sc.nextInt();
        System.out.println("Empresa: ");
        empresa = sc.next();
        System.out.println("Estado: ");
        estado = sc.nextBoolean();
        System.out.println("Valor: ");
        valor = sc.nextFloat();

        Record record = new Record( codigoRecord ,empresa, estado, valor);
        Personas.get(documento).getRecord().add(record);
        log.grabarLista(Personas);
        
        } else {
            System.out.println("Persona no encontrada:");
        }
    }
      
    /**
 * metodo en el cual se elimina un reporte de un cliente
 * 
 */
    private void borrarReporte() {
       Scanner sc = new Scanner(System.in);
        int documento;
        System.out.println("ingrese el codigo de la persona a quien le eliminara el reporte: ");
        documento = sc.nextInt();
   
        if (Personas.containsKey(documento)) {
            for (Integer persona: Personas.keySet()) {
            Persona per = Personas.get(persona);
            System.out.println("ingrese el codigo del reporte que desea eliminar: ");
            documento = sc.nextInt();
            for(int record=0; record <per.getRecord().size();record++){
             try{  
                 if(per.getRecord().get(record).getCodigoRecord() == documento && per.getRecord().get(record).isEstado() == false ){
                    System.out.println("\nCodigo\n"+per.getCodigo());
                    System.out.println("\nNombre\n"+per.getNombre());
                    System.out.println("\nApellido\n"+per.getApellido());
                    System.out.println("\nCodigo Record\n"+ per.getRecord().get(record).getCodigoRecord());
                    
                    System.out.println("\nNombre de la empresa\n"+per.getRecord().get(record).getEmpresa());
                    System.out.println("\nestado \n"+per.getRecord().get(record).isEstado());
                    System.out.println("\nvalor \n"+per.getRecord().get(record).getValor());
                    System.out.println("Deseas eliminar el archivo si(s) y no(n): ");
                    String documento1 = sc.next();
                    if(documento1.equals("s")){
                        Logica log = new Logica();
                        per.getRecord().remove(per.getRecord().get(record));
                        log.grabarLista(Personas);
                        principal();
                    }else{
                        principal();
                    }
                    
                     }
                 else{
                     System.out.println("No tienes reportes en false");                     
                 }

                  }catch(Exception e){
                      System.out.println("\reporte no encontrado ");
                    }                
            }//for
        }//foreach

        

        } else {
            System.out.println("Persona no encontrada:");
        }            
} 
    
/**
 * metodo en el cual se listan los clientes 
 * 
 */
    private void mostarCliente() {
        Logica log = new Logica();
        Personas = log.obtenerListasActuales();
       
        for (Integer persona: Personas.keySet()) {
            Persona per = Personas.get(persona);
            for(int record=0; record <per.getRecord().size();record++){
             try{  
                    System.out.println("\nCodigo\n"+per.getCodigo());
                    System.out.println("\nNombre\n"+per.getNombre());
                    System.out.println("\nApellido\n"+per.getApellido());
                    System.out.println("\nCodigo Record\n"+ per.getRecord().get(record).getCodigoRecord());
                    
                    System.out.println("\nNombre de la empresa\n"+per.getRecord().get(record).getEmpresa());
                    System.out.println("\nestado \n"+per.getRecord().get(record).isEstado());
                     System.out.println("\nvalor \n"+per.getRecord().get(record).getValor());
                  }catch(Exception e){
                      System.out.println("\npersona no encontrada ");
                    }                
            }//for
        }//foreach
     }
}
    
