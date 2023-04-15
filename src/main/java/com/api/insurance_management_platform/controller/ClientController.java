package com.api.insurance_management_platform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.insurance_management_platform.dto.Client;
import com.api.insurance_management_platform.service.ClientService;

@RestController
public class ClientController {

    @Autowired
    ClientService clientService;

    // insert client
    @PostMapping("/api/clients")
    public Client insertClient(@RequestBody Client client) {
        return clientService.insertClient(client);
    }

    // update client
    @PutMapping("/api/clients/{clientId}")
    public Client updateClient(@PathVariable int clientId,@RequestBody Client client) {
        return clientService.updateClient(clientId, client);
    }

    // delete client
    @DeleteMapping("/api/clients/{clientId}")
    public void deleteClient(@PathVariable int clientId) {
        clientService.deleteClient(clientId);
    }

    // display client by id
    @GetMapping("/api/clients/{clientsId}")
    public Client displayClient(@PathVariable int clientId) {
        return clientService.displayClient(clientId);
    }

    // display all client
    @GetMapping("/api/clients")
    public List<Client> displayClients() {
        return displayClients();
    }

    
}
