package com.esprit.tpcafe.tpcafe_ademchebbi.repository;

import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Commande;
import com.esprit.tpcafe.tpcafe_ademchebbi.enums.StatusCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {

    // 🧾 Custom query methods (optional)

    // Find all commandes for a specific client by id
    List<Commande> findByClient_IdClient(Long idClient);

    // Find all commandes by status
    List<Commande> findByStatusCommande(StatusCommande statusCommande);

    // Find commandes between two dates
    List<Commande> findByDateCommandeBetween(LocalDate start, LocalDate end);

    // Find commandes with total greater than a given amount
    List<Commande> findByTotalCommandeGreaterThan(float totalMin);
}
