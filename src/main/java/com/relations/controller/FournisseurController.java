package com.relations.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.relations.model.Fournisseur;
import com.relations.service.FournisseurService;

@RestController
@RequestMapping("/fournisseurs")
public class FournisseurController {
    private final FournisseurService fournisseurService;

    @Autowired
    public FournisseurController(FournisseurService fournisseurService) {
        this.fournisseurService = fournisseurService;
    }

    @GetMapping
    public List<Fournisseur> getAllFournisseurs() {
        return fournisseurService.getAllFournisseurs();
    }

    @GetMapping("/{id}")
    public Fournisseur getFournisseurById(@PathVariable Long id) {
        return fournisseurService.getFournisseurById(id);
    }

    @PostMapping
    public void saveFournisseur(@RequestBody Fournisseur fournisseur) {
        fournisseurService.saveFournisseur(fournisseur);
    }

    @DeleteMapping("/{id}")
    public void deleteFournisseur(@PathVariable Long id) {
        fournisseurService.deleteFournisseur(id);
    }
}
