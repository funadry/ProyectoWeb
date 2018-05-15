/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavenproject.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author David
 */

@Entity
@Table(name="tienda")
public class Tienda implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTienda;

    @Column(name="Nombre")
    private String nombreTienda;

    @Column(name="Tipo")
    @Enumerated(value = EnumType.STRING)
    private TipoTienda tipo; //Esta columna es dudosa, hay que confirmar que esta bien

    @Column(name="ValoracionTienda")
    private int valoracionTienda;

    //Atributo para controlar el número de usuarios que han puntuado para poder realizar una media
    @Column(name="NValoracionesTienda")
    private int nValoracionesTienda;

    public int getIdTienda() {
	return idTienda;
    }

    public void setIdTienda(int idTienda) {
	this.idTienda = idTienda;
    }

    public String getNombreTienda() {
	return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
	this.nombreTienda = nombreTienda;
    }

    public TipoTienda getTipo() {
	return tipo;
    }

    public void setTipo(TipoTienda tipo) {
	this.tipo = tipo;
    }

    public int getValoracionTienda() {
	return valoracionTienda;
    }

    public void setValoracionTienda(int valoracionTienda) {
	this.valoracionTienda = valoracionTienda;
    }

    public int getnValoracionesTienda() {
	return nValoracionesTienda;
    }

    public void setnValoracionesTienda(int nValoracionesTienda) {
	this.nValoracionesTienda = nValoracionesTienda;
    }

    @Override
    public String toString() {
	return "Tienda{" + "idTienda=" + idTienda + ", nombreTienda=" + nombreTienda + ", tipo=" + tipo + ", valoracionTienda=" + valoracionTienda + ", nValoracionesTienda=" + nValoracionesTienda + '}';
    }

    @Override
    public int hashCode() {
	int hash = 5;
	hash = 11 * hash + this.idTienda;
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
	final Tienda other = (Tienda) obj;
	if (this.idTienda != other.idTienda) {
	    return false;
	}
	return true;
    }



}
