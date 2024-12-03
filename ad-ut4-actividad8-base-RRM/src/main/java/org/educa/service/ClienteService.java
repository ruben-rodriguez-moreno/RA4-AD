package org.educa.service;

import org.educa.dao.ClienteDAO;
import org.educa.dao.impl.ClienteDAOImpl;
import org.educa.entity.ClienteEntity;

public class ClienteService {
    private static final ClienteDAO clienteDAO = new ClienteDAOImpl();


    public ClienteEntity findById(Long id) {
        return clienteDAO.findById(id);
    }

    public void update(ClienteEntity cliente) {
        clienteDAO.update(cliente);
    }
}
