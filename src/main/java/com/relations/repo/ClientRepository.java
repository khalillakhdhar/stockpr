package com.relations.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.relations.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
