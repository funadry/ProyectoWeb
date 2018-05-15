/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavenproject.EJB;

import com.mavenproject.modelo.Arte;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Tfg
 */
@Local
public interface ArteFacadeLocal {

    void create(Arte arte);

    void edit(Arte arte);

    void remove(Arte arte);

    Arte find(Object id);

    List<Arte> findAll();

    List<Arte> findRange(int[] range);

    int count();
    
}
