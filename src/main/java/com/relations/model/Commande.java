package com.relations.model;

import lombok.Data;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Commande {
	@JsonIgnore
    public Facture getFacture() {
		return facture;
	}
	public void setFacture(Facture facture) {
		this.facture = facture;
	}
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateCommande;
    private int quantite;

    @ManyToOne
    @JoinColumn(name = "client_id")
    @JsonBackReference
    private Client client;

    @ManyToOne
    @JoinColumn(name = "produit_id")
    private Produit produit;

    @JsonIgnore
    public Produit getProduit() {
        return produit;
    }
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "commande")

    private Facture facture;
    
    
    
    
}
