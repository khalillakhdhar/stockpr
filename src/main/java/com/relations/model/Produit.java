package com.relations.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom,codeb;
    private double prix,prix_achat;
    private int quantite,num_lot;
    
    private String description,commentaire;
    private String photo;

    @ManyToOne
    @JoinColumn(name = "fournisseur_id")
    private Fournisseur fournisseur;

    @OneToMany(mappedBy = "produit")
    private List<Commande> commandes;
}
