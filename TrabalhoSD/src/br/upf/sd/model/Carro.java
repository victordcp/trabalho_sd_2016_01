/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.upf.sd.model;

import java.util.Objects;

/**
 *
 * @author fabricio
 */
public class Carro {
    private int codigo;
    private String marca;
    private String modelo;
    private Integer ano;
    private Float potencia;
    private Float carga;
    private Character complemento;

    public Carro() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public Float getPotencia() {
        return potencia;
    }

    public Float getCarga() {
        return carga;
    }

    public Character getComplemento() {
        return complemento;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public void setPotencia(Float potencia) {
        this.potencia = potencia;
    }

    public void setCarga(Float carga) {
        this.carga = carga;
    }

    public void setComplemento(Character complemento) {
        this.complemento = complemento;
    }

    public Carro(int codigo, String marca, String modelo, Integer ano, Float potencia, Float carga, Character complemento) {
        this.codigo = codigo;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.potencia = potencia;
        this.carga = carga;
        this.complemento = complemento;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.codigo;
        hash = 29 * hash + Objects.hashCode(this.marca);
        hash = 29 * hash + Objects.hashCode(this.modelo);
        hash = 29 * hash + Objects.hashCode(this.ano);
        hash = 29 * hash + Objects.hashCode(this.potencia);
        hash = 29 * hash + Objects.hashCode(this.carga);
        hash = 29 * hash + Objects.hashCode(this.complemento);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carro other = (Carro) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.modelo, other.modelo)) {
            return false;
        }
        if (!Objects.equals(this.ano, other.ano)) {
            return false;
        }
        if (!Objects.equals(this.potencia, other.potencia)) {
            return false;
        }
        if (!Objects.equals(this.carga, other.carga)) {
            return false;
        }
        if (!Objects.equals(this.complemento, other.complemento)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
