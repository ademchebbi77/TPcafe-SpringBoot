package com.esprit.tpcafe.tpcafe_ademchebbi.services;
import com.esprit.tpcafe.tpcafe_ademchebbi.dto.ArticleResponse;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Article;
import java.util.List;

public interface IArticleService {
    Article addArticle(Article a);
    List<Article> saveArticles(List<Article> articles);
    Article selectArticleById(Long id);
    List<Article> selectAllArticles();
    void deleteArticle(Article a);
    void deleteArticleById(Long id);
    void deleteAllArticles();
    long countArticles();
    boolean verifArticleById(Long id);

    
    List<ArticleResponse> findByNom(String nom);
    List<ArticleResponse> findByType(Article type);
    List<ArticleResponse> findByPrix(float prix);
    boolean existsByNom(String nom);
    long countByType(Article type);
    List<ArticleResponse> findByNomContainingAndType(String nom, Article type);
    List<ArticleResponse> findByPrixBetweenAndType(float min, float max, Article type);
    List<ArticleResponse> findByNomStartsWithSortedByPrix(String prefix);
    List<ArticleResponse> findMaxPriceByType(Article type);
    List<ArticleResponse> findByNomOrTypeOrderByPrixDesc(String str, Article type);
    List<ArticleResponse> findByNomStartsWith(String prefix);
    List<ArticleResponse> findByNomEndsWith(String suffix);
    List<ArticleResponse> findByTypeIsNull();
    List<ArticleResponse> findByPrixNotNull();
    List<ArticleResponse> findWithActivePromotions();
    List<ArticleResponse> findByNomContainingAndPrixBetween(String nom, float min, float max);



}
