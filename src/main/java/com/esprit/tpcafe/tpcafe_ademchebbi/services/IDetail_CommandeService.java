package com.esprit.tpcafe.tpcafe_ademchebbi.services;

import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Detail_Commande;
import com.esprit.tpcafe.tpcafe_ademchebbi.dto.Detail_CommandeResponse;
import java.util.List;

public interface IDetail_CommandeService {

    // Add a single Detail_Commande
    Detail_Commande addDetailCommande(Detail_Commande d);

    // Save a list of Detail_Commande
    List<Detail_Commande> saveDetailCommandes(List<Detail_Commande> details);

    // Find a Detail_Commande by its ID
    Detail_Commande selectDetailCommandeById(Long id);

    // Get all Detail_Commande
    List<Detail_Commande> selectAllDetailCommandes();

    // Delete a Detail_Commande by entity
    void deleteDetailCommande(Detail_Commande d);

    // Delete a Detail_Commande by ID
    void deleteDetailCommandeById(Long id);

    // Delete all Detail_Commande
    void deleteAllDetailCommandes();

    List<Detail_Commande> selectAllDetailsCommandes();

    List<Detail_CommandeResponse> findByQuantiteExact(int qty);
    List<Detail_CommandeResponse> findBySousTotalExact(float st);
    long countQuantityGreater(int qty);
    boolean existsBySousTotalGreater(float st);
    List<Detail_CommandeResponse> findByQuantiteRangeAndSousTotal(int min, int max, float stMin);
    List<Detail_CommandeResponse> findBySousTotalRangeOrderByQty(float min, float max);
    List<Detail_CommandeResponse> findBySousTotalPromoRange(float min, float max);
    List<Detail_CommandeResponse> findByQtyOrSousTotalMin(int qty, float st);
    List<Detail_CommandeResponse> top5Expensive();
    List<Detail_CommandeResponse> findQuantityNull();
    List<Detail_CommandeResponse> findSousTotalPromoNotNull();
    List<Detail_CommandeResponse> findWithCommandeAndArticle();
}
