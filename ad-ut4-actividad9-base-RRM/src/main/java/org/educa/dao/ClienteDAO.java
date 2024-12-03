package org.educa.dao;

import org.educa.entity.ClienteEntity;

public interface ClienteDAO {
    ClienteEntity findById(Long id);

    void remove(ClienteEntity cliente);
}
