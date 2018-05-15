/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavenproject.controlador;

import com.mavenproject.EJB.UsuarioFacadeLocal;
import com.mavenproject.modelo.Usuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

/**
 *
 * @author Usuario
 */

 @Named
 @ViewScoped
public class LoginController implements Serializable{

    @EJB
    private UsuarioFacadeLocal usuarioEJB;

    private Usuario usuario;

    public Usuario getUsuario() {
	return usuario;
    }

    public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
    }

    @PostConstruct
    public void init(){
        usuario = new Usuario();
    }

    public String comprobarUsuario(){
        String direccion = null;
        Usuario us = new Usuario();
        try{
            us = usuarioEJB.comprobarUsuario(this.usuario);
            if(us == null){
                direccion = "./public/error.xhtml";
            }else{
               FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
               direccion= "./index.xhtml?faces-redirect=true";
            }
        }catch(Exception e){
        }
	System.out.println(direccion);
        return(direccion);
    }

}
