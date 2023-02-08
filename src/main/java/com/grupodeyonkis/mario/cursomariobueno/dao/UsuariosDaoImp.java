package com.grupodeyonkis.mario.cursomariobueno.dao;

import com.grupodeyonkis.mario.cursomariobueno.models.Usuario;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.swing.text.html.parser.Entity;
import java.beans.PersistenceDelegate;
import java.util.List;

@Repository
@Transactional
public class UsuariosDaoImp  implements UsuarioDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Usuario> getUsuarios() {
        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();
    }
}
