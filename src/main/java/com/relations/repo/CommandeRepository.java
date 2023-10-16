package com.relations.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.relations.model.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {

}
