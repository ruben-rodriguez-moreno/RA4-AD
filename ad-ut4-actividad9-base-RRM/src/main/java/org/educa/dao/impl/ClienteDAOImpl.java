package org.educa.dao.impl;

import org.educa.dao.ClienteDAO;
import org.educa.dao.hibernate.DAOSession;
import org.educa.entity.ClienteEntity;
import org.hibernate.Session;

public class ClienteDAOImpl implements ClienteDAO {
    @Override
    public ClienteEntity findById(Long id) {
        try (Session session = DAOSession.getSession()) {
            return session.get(ClienteEntity.class, id);
        }
    }

    @Override
    public void remove(ClienteEntity cliente) {
        try (Session session = DAOSession.getSession()) {
            session.remove(cliente);
            session.getTransaction().commit();
        }
    }
}
