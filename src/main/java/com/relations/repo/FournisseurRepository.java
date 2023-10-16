package com.relations.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relations.model.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur, Long> {

}
