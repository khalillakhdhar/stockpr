package com.relations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.relations.model.Commande;
import com.relations.repo.CommandeRepository;

import java.util.List;

@Service
public class CommandeService {
    private final CommandeRepository commandeRepository;

    @Autowired
    public CommandeService(CommandeRepository commandeRepository) {
        this.commandeRepository = commandeRepository;
    }

    @Transactional
    public List<Commande> getAllCommandes() {
        return commandeRepository.findAll();
    }

    @Transactional
    public Commande getCommandeById(Long id) {
        return commandeRepository.findById(id).orElse(null);
    }

    @Transactional
    public void saveCommande(Commande commande) {
        commandeRepository.save(commande);
    }

    @Transactional
    public void deleteCommande(Long id) {
        commandeRepository.deleteById(id);
    }
}
