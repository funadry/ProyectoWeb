/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mavenproject.EJB;

import com.mavenproject.modelo.Musica;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface MusicaFacadeLocal {

    void create(Musica musica);

    void edit(Musica musica);

    void remove(Musica musica);

    Musica find(Object id);

    List<Musica> findAll();

    List<Musica> findRange(int[] range);

    int count();

}
