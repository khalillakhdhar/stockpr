package com.relations.model;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String id_fiscale;
    private String prenomRepresentant;
    private int codepostale;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;

    @OneToMany(mappedBy = "fournisseur", cascade = CascadeType.ALL)
    private List<Produit> produitsFournis;
}
