package com.grupodeyonkis.mario.cursomariobueno.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class UsuariosDaoImp  implements UsuarioDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List getUsuarios() {
        String query = "FROM Usuario";
        return entityManager.createQuery(query).getResultList();
    }
}
