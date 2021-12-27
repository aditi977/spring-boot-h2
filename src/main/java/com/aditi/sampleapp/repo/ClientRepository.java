package com.aditi.sampleapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aditi.sampleapp.domain.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}