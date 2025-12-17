package com.esprit.tpcafe.tpcafe_ademchebbi.services;

import com.esprit.tpcafe.tpcafe_ademchebbi.dto.PromotionResponse;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Promotion;

import java.time.LocalDate;
import java.util.List;

public interface IPromotionService {
    Promotion addPromotion(Promotion p);
    List<Promotion> savePromotions(List<Promotion> promotions);
    Promotion selectPromotionById(Long id);
    List<Promotion> selectAllPromotions();
    void deletePromotion(Promotion p);
    void deletePromotionById(Long id);
    void deleteAllPromotions();
    long countPromotions();
    boolean verifPromotionById(Long id);

    
    List<PromotionResponse> findByPourcentageExact(int p);
    List<PromotionResponse> findByDateDebut(LocalDate date);
    List<PromotionResponse> findByDateFin(LocalDate date);
    boolean existsByPourcentage(int p);
    long countDateDebutAfter(LocalDate date);
    List<PromotionResponse> findActiveAt(LocalDate date);
    List<PromotionResponse> findByPourcentageInPeriod(int p, LocalDate d1, LocalDate d2);
    List<PromotionResponse> findValidAt(LocalDate date);
    List<PromotionResponse> findByPourcentages(List<Integer> list);
    List<PromotionResponse> findActiveOrderedByPourcentage();
    List<PromotionResponse> findWithoutEndDate();
    List<PromotionResponse> findPourcentageNotNull();
    List<PromotionResponse> findWithArticles();
    List<PromotionResponse> findExpired();
    void affecterPromotionAArticle(long idArticle, long idPromotion);
    void desaffecterPromotionDeArticle(long idArticle, long idPromotion);
}
