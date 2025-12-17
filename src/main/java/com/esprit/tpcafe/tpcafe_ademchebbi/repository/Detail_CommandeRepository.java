package com.esprit.tpcafe.tpcafe_ademchebbi.repository;

import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Detail_Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Detail_CommandeRepository extends JpaRepository<Detail_Commande, Long> {

    // Find all details of a given commande
    List<Detail_Commande> findByCommande_IdCommande(Long idCommande);

    // Find all details for a given article
    List<Detail_Commande> findByArticle_IdArticle(Long idArticle);

    // Find by quantity greater than X
    List<Detail_Commande> findByQuantiteArticleGreaterThan(int quantite);
}
