package com.api.insurance_management_platform.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.api.insurance_management_platform.dto.Client;
import com.api.insurance_management_platform.repository.ClientRepository;

@Repository
public class ClientDao {

    @Autowired
    ClientRepository clientRepository;
    
    // insert client
    public Client insertClient(Client client){
        clientRepository.save(client);
        return client;
    }
    // update client
    public Client updateClient(int clientId , Client client){
        if(clientRepository.findById(clientId).isPresent()){
            Client dbClient = clientRepository.findById(clientId).get();
            if(dbClient.getClientId() == client.getClientId()){
                if (client.getClientName()!= null && client.getClientName()!= dbClient.getClientName()){
                    dbClient.setClientName(client.getClientName());
                }
                if(client.getClientDOB() != null && client.getClientDOB() != dbClient.getClientDOB()){
                    dbClient.setClientDOB(client.getClientDOB() );
                }
                if(client.getClientContact()!= 0 && client.getClientContact() != dbClient.getClientContact()){
                    dbClient.setClientContact(client.getClientContact());
                }
                if(client.getClientAddress()!= null && client.getClientAddress() != dbClient.getClientAddress()){
                    dbClient.setClientAddress(client.getClientAddress());
                }
                clientRepository.save(dbClient);
                return dbClient;
            }
        }
        return null;
    }

    // delete client
    public void deleteClient(int clientId){
        clientRepository.deleteById(clientId);
    }
    // display client by id
    public Client displayClient(int clientId){
        if(clientRepository.findById(clientId).isPresent()){
           return clientRepository.findById(clientId).get();
        }
        return null;
    }
    // display clients
    public List<Client> displayClients(){
        return clientRepository.findAll();
    }

}
