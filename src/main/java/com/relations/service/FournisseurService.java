package com.relations.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.relations.model.Fournisseur;
import com.relations.repo.FournisseurRepository;

import java.util.List;

@Service
public class FournisseurService {
    private final FournisseurRepository fournisseurRepository;

    @Autowired
    public FournisseurService(FournisseurRepository fournisseurRepository) {
        this.fournisseurRepository = fournisseurRepository;
    }

    @Transactional
    public List<Fournisseur> getAllFournisseurs() {
        return fournisseurRepository.findAll();
    }

    @Transactional
    public Fournisseur getFournisseurById(Long id) {
        return fournisseurRepository.findById(id).orElse(null);
    }

    @Transactional
    public void saveFournisseur(Fournisseur fournisseur) {
        fournisseurRepository.save(fournisseur);
    }

    @Transactional
    public void deleteFournisseur(Long id) {
        fournisseurRepository.deleteById(id);
    }
}
