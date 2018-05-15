/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavenproject.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author David
 */

@Entity
@Table(name="musica")
public class Musica implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCancion;

    @Column(name="Titulo")
    private String tituloCancion;

    @Column(name="Precio")
    private double precio;

    @Column(name="Descripcion")
    private String descripcion;

    @Column(name="Etiquetas")
    private String etiquetas;

    public int getIdCancion() {
	return idCancion;
    }

    public void setIdCancion(int idCancion) {
	this.idCancion = idCancion;
    }

    public String getTituloCancion() {
	return tituloCancion;
    }

    public void setTituloCancion(String tituloCancion) {
	this.tituloCancion = tituloCancion;
    }

    public double getPrecio() {
	return precio;
    }

    public void setPrecio(double precio) {
	this.precio = precio;
    }

    public String getDescripcion() {
	return descripcion;
    }

    public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
    }

    public String getEtiquetas() {
	return etiquetas;
    }

    public void setEtiquetas(String etiquetas) {
	this.etiquetas = etiquetas;
    }

    @Override
    public String toString() {
	return "Musica{" + "idCancion=" + idCancion + ", tituloCancion=" + tituloCancion + ", precio=" + precio + ", descripcion=" + descripcion + ", etiquetas=" + etiquetas + '}';
    }



    @Override
    public int hashCode() {
	int hash = 7;
	hash = 53 * hash + this.idCancion;
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
	final Musica other = (Musica) obj;
	if (this.idCancion != other.idCancion) {
	    return false;
	}
	return true;
    }


}
