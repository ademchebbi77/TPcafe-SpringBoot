package com.esprit.tpcafe.tpcafe_ademchebbi.services;

import com.esprit.tpcafe.tpcafe_ademchebbi.dto.PromotionResponse;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Article;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Promotion;
import com.esprit.tpcafe.tpcafe_ademchebbi.repository.PromotionRepository;
import com.esprit.tpcafe.tpcafe_ademchebbi.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


@Service
public class PromotionService implements IPromotionService {

    @Autowired
    private PromotionRepository promotionRepository;

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Promotion addPromotion(Promotion p) {
        return promotionRepository.save(p);
    }

    @Override
    public List<Promotion> savePromotions(List<Promotion> promotions) {
        return promotionRepository.saveAll(promotions);
    }

    @Override
    public Promotion selectPromotionById(Long id) {
        return promotionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Promotion> selectAllPromotions() {
        return promotionRepository.findAll();
    }

    @Override
    public void deletePromotion(Promotion p) {
        promotionRepository.delete(p);
    }

    @Override
    public void deletePromotionById(Long id) {
        promotionRepository.deleteById(id);
    }

    @Override
    public void deleteAllPromotions() {
        promotionRepository.deleteAll();
    }

    @Override
    public long countPromotions() {
        return promotionRepository.count();
    }

    @Override
    public boolean verifPromotionById(Long id) {
        return promotionRepository.existsById(id);
    }

    @Override
    public List<PromotionResponse> findByPourcentageExact(int p) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByPourcentageExact'");
    }

    @Override
    public List<PromotionResponse> findByDateDebut(LocalDate date) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByDateDebut'");
    }

    @Override
    public List<PromotionResponse> findByDateFin(LocalDate date) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByDateFin'");
    }

    @Override
    public boolean existsByPourcentage(int p) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsByPourcentage'");
    }

    @Override
    public long countDateDebutAfter(LocalDate date) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'countDateDebutAfter'");
    }

    @Override
    public List<PromotionResponse> findActiveAt(LocalDate date) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findActiveAt'");
    }

    @Override
    public List<PromotionResponse> findByPourcentageInPeriod(int p, LocalDate d1, LocalDate d2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByPourcentageInPeriod'");
    }

    @Override
    public List<PromotionResponse> findValidAt(LocalDate date) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findValidAt'");
    }

    @Override
    public List<PromotionResponse> findByPourcentages(List<Integer> list) {
       
        throw new UnsupportedOperationException("Unimplemented method 'findByPourcentages'");
    }

    @Override
    public List<PromotionResponse> findActiveOrderedByPourcentage() {
       
        throw new UnsupportedOperationException("Unimplemented method 'findActiveOrderedByPourcentage'");
    }

    @Override
    public List<PromotionResponse> findWithoutEndDate() {
       
        throw new UnsupportedOperationException("Unimplemented method 'findWithoutEndDate'");
    }

    @Override
    public List<PromotionResponse> findPourcentageNotNull() {
       
        throw new UnsupportedOperationException("Unimplemented method 'findPourcentageNotNull'");
    }

    @Override
    public List<PromotionResponse> findWithArticles() {
       
        throw new UnsupportedOperationException("Unimplemented method 'findWithArticles'");
    }

    @Override
    public List<PromotionResponse> findExpired() {
       
        throw new UnsupportedOperationException("Unimplemented method 'findExpired'");
    }
    
    @Override
    public void affecterPromotionAArticle(long idArticle, long idPromotion) {
        Article article = articleRepository.findById(idArticle)
                .orElseThrow(() -> new RuntimeException("Article not found with id: " + idArticle));
        Promotion promo = promotionRepository.findById(idPromotion)
                .orElseThrow(() -> new RuntimeException("Promotion not found with id: " + idPromotion));

        article.getPromotions().add(promo);
        articleRepository.save(article);
    }

    @Override
    public void desaffecterPromotionDeArticle(long idArticle, long idPromotion) {
        Article article = articleRepository.findById(idArticle)
                .orElseThrow(() -> new RuntimeException("Article not found with id: " + idArticle));
        Promotion promo = promotionRepository.findById(idPromotion)
                .orElseThrow(() -> new RuntimeException("Promotion not found with id: " + idPromotion));

        article.getPromotions().remove(promo);
        articleRepository.save(article);
    }

   
}
