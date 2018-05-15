/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavenproject.EJB;

import com.mavenproject.modelo.Arte;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Tfg
 */
@Stateless
public class ArteFacade extends AbstractFacade<Arte> implements ArteFacadeLocal {

    @PersistenceContext(unitName = "WebShopPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ArteFacade() {
        super(Arte.class);
    }
    
}
