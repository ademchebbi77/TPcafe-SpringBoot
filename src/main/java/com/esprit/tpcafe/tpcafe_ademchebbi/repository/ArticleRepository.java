package com.esprit.tpcafe.tpcafe_ademchebbi.repository;


import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    List<Article> findByNomArticle(String na);
    List<Article> getByNomArticle(String na);
    List<Article> searchByNomArticle(String na);
    List<Article> readByNomArticle(String na);
    List<Article> queryByNomArticle(String na);
































    List<Article> findByPrixArticleGreaterThanAndPrixArticleLessThan(float min,float max);

    List<Article> findByPrixArticleGreaterThan(float p);

    List<Article> findByPrixArticleGreaterThanEqual(float p);


    List<Article> findByPrixArticleLessThan(float p);


    List<Article> findByPrixArticleLessThanEqual(float p);















}
