/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoarchivos;

import java.io.Serializable;

/**
 *
 * @author David
 */
public class Record implements Serializable{
    private int codigoRecord;
    private String empresa;
    private boolean estado;
    private float valor;

    public Record(int codigoRecord, String empresa, boolean estado, float valor) {
        this.codigoRecord = codigoRecord;
        this.empresa = empresa;
        this.estado = estado;
        this.valor = valor;
    }

    /**
     * @return the codigoRecord
     */
    public int getCodigoRecord() {
        return codigoRecord;
    }

    /**
     * @param codigoRecord the codigoRecord to set
     */
    public void setCodigoRecord(int codigoRecord) {
        this.codigoRecord = codigoRecord;
    }

    /**
     * @return the empresa
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * @param empresa the empresa to set
     */
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    /**
     * @return the valor
     */
    public float getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(float valor) {
        this.valor = valor;
    }

     
}
