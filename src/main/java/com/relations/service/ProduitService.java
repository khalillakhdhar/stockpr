package com.relations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.relations.model.Produit;
import com.relations.repo.ProduitRepository;

import java.util.List;

@Service
public class ProduitService {
    private final ProduitRepository produitRepository;

    @Autowired
    public ProduitService(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @Transactional
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    @Transactional
    public Produit getProduitById(Long id) {
        return produitRepository.findById(id).orElse(null);
    }

    @Transactional
    public void saveProduit(Produit produit) {
        produitRepository.save(produit);
    }

    @Transactional
    public void deleteProduit(Long id) {
        produitRepository.deleteById(id);
    }
}

