package com.relations.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.relations.model.Client;
import com.relations.model.Commande;
import com.relations.repo.ClientRepository;

import java.util.Collections;
import java.util.List;
@Service
public class ClientService {
	private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Transactional
    public List<Commande> getCommandesDuClient(Long clientId) {
        Client client = clientRepository.findById(clientId).orElse(null);
        if (client != null) {
            return client.getCommandes();
        } else {
            return Collections.emptyList();
        }
    }
    @Transactional
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Transactional
    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Transactional
    public void saveClient(Client client) {
        clientRepository.save(client);
    }

    @Transactional
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}
