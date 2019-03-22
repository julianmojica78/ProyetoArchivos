/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoarchivos;

/**
 *
 * @author David
 */
public class Record {
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

    public int getCodigoRecord() {
        return codigoRecord;
    }

    public void setCodigoRecord(int codigoRecord) {
        this.codigoRecord = codigoRecord;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
    
}
