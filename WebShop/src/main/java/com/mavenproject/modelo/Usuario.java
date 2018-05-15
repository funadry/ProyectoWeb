/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavenproject.modelo;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Jaime
 */
@Entity
@Table(name="usuario")
public class Usuario implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;

    @Column(name = "Nick")
    private String nick;

    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Apellido")
    private String apellido;
    @Column(name = "Email")
    private String email;
    @Column(name = "Password")
    private String password;
    @Column(name = "Paypal")
    private String paypal;
    @Column(name = "Valoracion")
    private float valoracion;
    @Column(name = "NValoraciones")
    private int nvaloraciones;
    //Esto es el enum, mirar si está bien-
    @Column(name = "Tipo")
    private String tipo;

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPaypal() {
        return paypal;
    }

    public void setPaypal(String paypal) {
        this.paypal = paypal;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public int getNvaloraciones() {
        return nvaloraciones;
    }

    public void setNvaloraciones(int nvaloraciones) {
        this.nvaloraciones = nvaloraciones;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String Tipo) {
        this.tipo = Tipo;
    }

    public int getIdUsuario() {
	return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
	this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
	return "Usuario{" + "idUsuario=" + idUsuario + ", nick=" + nick + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", password=" + password + ", paypal=" + paypal + ", valoracion=" + valoracion + ", nvaloraciones=" + nvaloraciones + ", tipo=" + tipo + '}';
    }

    @Override
    public int hashCode() {
	int hash = 5;
	hash = 23 * hash + this.idUsuario;
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
	final Usuario other = (Usuario) obj;
	if (this.idUsuario != other.idUsuario) {
	    return false;
	}
	return true;
    }

    


}