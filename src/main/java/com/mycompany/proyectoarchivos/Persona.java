package com.mycompany.proyectoarchivos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David
 */
public class Persona implements Serializable{
    
    private int codigo;
    private String nombre;
    private String apellido;
    private List<Persona> persona = new ArrayList<>();
    private List<Record> record = new ArrayList<>();

    public Persona(int codigo, String nombre, String apellido) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the persona
     */
    public List<Persona> getPersona() {
        return persona;
    }

    /**
     * @param persona the persona to set
     */
    public void setPersona(List<Persona> persona) {
        this.persona = persona;
    }

    /**
     * @return the record
     */
    public List<Record> getRecord() {
        return record;
    }

    /**
     * @param record the record to set
     */
    public void setRecord(List<Record> record) {
        this.record = record;
    }
  void persona(Persona persona2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  
    
}
