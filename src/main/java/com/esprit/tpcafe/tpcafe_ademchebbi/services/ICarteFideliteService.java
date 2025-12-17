package com.esprit.tpcafe.tpcafe_ademchebbi.services;

import com.esprit.tpcafe.tpcafe_ademchebbi.entities.CarteFidelite;
import com.esprit.tpcafe.tpcafe_ademchebbi.dto.CarteFideliteResponse;

import java.time.LocalDate;
import java.util.List;

public interface ICarteFideliteService {
    CarteFidelite addCarteFidelite(CarteFidelite c);
    List<CarteFidelite> saveCartesFidelite(List<CarteFidelite> cartes);
    CarteFidelite selectCarteFideliteById(Long id);
    List<CarteFidelite> selectAllCartesFidelite();
    void deleteCarteFidelite(CarteFidelite c);
    void deleteCarteFideliteById(Long id);
    void deleteAllCartesFidelite();
    long countCartesFidelite();
    boolean verifCarteFideliteById(Long id);

    
    List<CarteFideliteResponse> findByExactPoints(int points);
    List<CarteFideliteResponse> findByDateCreation(LocalDate date);
    long countByPointsGreater(int points);
    void deleteByDateBefore(LocalDate date);
    List<CarteFideliteResponse> findPointsBetweenAfterDate(int min, int max, LocalDate date);
    List<CarteFideliteResponse> findByPointsGreaterSortedByDate(int points);
    List<CarteFideliteResponse> findByDateBetween(LocalDate start, LocalDate end);
    List<CarteFideliteResponse> findPointsLessOrDateBefore(int points, LocalDate date);
    List<CarteFideliteResponse> findCarteWithMaxPoints();
    List<CarteFideliteResponse> findCarteNoDate();
    List<CarteFideliteResponse> findCartePointsNotNull();
    List<CarteFideliteResponse> findByClientNomPrenom(String nom, String prenom);
    List<CarteFideliteResponse> findTop5ByPoints();
}
