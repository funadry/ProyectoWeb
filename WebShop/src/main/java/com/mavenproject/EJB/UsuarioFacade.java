/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavenproject.EJB;

import com.mavenproject.modelo.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Jaime
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> implements UsuarioFacadeLocal {

    @PersistenceContext(unitName = "WebShopPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }

    @Override
    public Usuario comprobarUsuario(Usuario user) {
	Usuario us = null;
        String consulta = null;

        try{
            consulta="SELECT u FROM Usuario u WHERE u.nick = ?1 and u.password = ?2";
            Query query = em.createQuery(consulta);
            query.setParameter(1, user.getNick());
            query.setParameter(2, user.getPassword());
            List<Usuario> listaUsuarios = query.getResultList();

            if(!listaUsuarios.isEmpty()){
                us = listaUsuarios.get(0);
            }
            else{
                System.out.println("La consulta no ha devuelto nada...");
            }
        }catch(Exception e){
            System.out.println("Salimos por aqui...:" + e.getMessage());
        }
        return us;
    }

}
