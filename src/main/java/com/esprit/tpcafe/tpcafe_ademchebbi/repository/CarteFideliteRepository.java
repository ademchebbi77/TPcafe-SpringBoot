package com.esprit.tpcafe.tpcafe_ademchebbi.repository;

import com.esprit.tpcafe.tpcafe_ademchebbi.entities.CarteFidelite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CarteFideliteRepository extends JpaRepository<CarteFidelite, Long> {

    // Optional custom query methods
    List<CarteFidelite> findByPointsAccumuleGreaterThan(int points);

    List<CarteFidelite> findByDateCreationBefore(LocalDate date);

    CarteFidelite findByClient_Nom(String nomClient);
}
