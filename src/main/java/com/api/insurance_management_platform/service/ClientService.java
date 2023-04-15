package com.api.insurance_management_platform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.insurance_management_platform.dao.ClientDao;
import com.api.insurance_management_platform.dto.Client;

@Service
public class ClientService {

    @Autowired
    ClientDao clientDao;

    // insert client

    public Client insertClient(Client client) {
        return clientDao.insertClient(client);
    }

    // update client
    public Client updateClient(int clientId, Client client) {
        return clientDao.updateClient(clientId, client);
    }

    // delete client

    public void deleteClient(int clientId) {
        clientDao.deleteClient(clientId);
    }

    // display client by id

    public Client displayClient(int clientId) {
        return clientDao.displayClient(clientId);
    }

    // display all client
    public List<Client> displayClients() {
        return clientDao.displayClients();
    }

}
