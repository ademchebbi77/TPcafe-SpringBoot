package com.esprit.tpcafe.tpcafe_ademchebbi.services;

import com.esprit.tpcafe.tpcafe_ademchebbi.dto.CommandeResponse;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Commande;

import java.time.LocalDate;
import java.util.List;

public interface ICommandeService {
    Commande addCommande(Commande c);
    List<Commande> saveCommandes(List<Commande> commandes);
    Commande selectCommandeById(Long id);
    List<Commande> selectAllCommandes();
    void deleteCommande(Commande c);
    void deleteCommandeById(Long id);
    void deleteAllCommandes();
    long countCommandes();
    boolean verifCommandeById(Long id);

    List<CommandeResponse> findByStatus(String status);
    List<CommandeResponse> findByDate(LocalDate date);
    long countByStatus(String status);
    void deleteBefore(LocalDate date);
    List<CommandeResponse> findBetweenDatesAndStatus(LocalDate d1, LocalDate d2, String status);
    List<CommandeResponse> findTotalGreaterAndStatusNot(float montant, String status);
    List<CommandeResponse> findByStatuses(List<String> statuses);
    List<CommandeResponse> findBeforeDateTotalBetween(LocalDate date, float min, float max);
    List<CommandeResponse> findStatusEndsWith(String suffix);
    List<CommandeResponse> findStatusNull();
    List<CommandeResponse> findTotalNotNull();
    List<CommandeResponse> findWithDetailsAndClient();
    List<CommandeResponse> top3Recent();
}
