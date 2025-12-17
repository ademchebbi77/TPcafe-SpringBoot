package com.esprit.tpcafe.tpcafe_ademchebbi.services;

import com.esprit.tpcafe.tpcafe_ademchebbi.dto.ArticleResponse;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Article;

import com.esprit.tpcafe.tpcafe_ademchebbi.repository.ArticleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService implements IArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    

    @Override
    public Article addArticle(Article a) {
        return articleRepository.save(a);
    }

    @Override
    public List<Article> saveArticles(List<Article> articles) {
        return articleRepository.saveAll(articles);
    }

    @Override
    public Article selectArticleById(Long id) {
        return articleRepository.findById(id).orElse(null);
    }

    @Override
    public List<Article> selectAllArticles() {
        return articleRepository.findAll();
    }

    @Override
    public void deleteArticle(Article a) {
        articleRepository.delete(a);
    }

    @Override
    public void deleteArticleById(Long id) {
        articleRepository.deleteById(id);
    }

    @Override
    public void deleteAllArticles() {
        articleRepository.deleteAll();
    }

    @Override
    public long countArticles() {
        return articleRepository.count();
    }

    @Override
    public boolean verifArticleById(Long id) {
        return articleRepository.existsById(id);
    }

    @Override
    public List<ArticleResponse> findByNom(String nom) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByNom'");
    }

    @Override
    public List<ArticleResponse> findByType(Article type) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByType'");
    }

    @Override
    public List<ArticleResponse> findByPrix(float prix) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByPrix'");
    }

    @Override
    public boolean existsByNom(String nom) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsByNom'");
    }

    @Override
    public long countByType(Article type) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'countByType'");
    }

    @Override
    public List<ArticleResponse> findByNomContainingAndType(String nom, Article type) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByNomContainingAndType'");
    }

    @Override
    public List<ArticleResponse> findByPrixBetweenAndType(float min, float max, Article type) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByPrixBetweenAndType'");
    }

    @Override
    public List<ArticleResponse> findByNomStartsWithSortedByPrix(String prefix) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByNomStartsWithSortedByPrix'");
    }

    @Override
    public List<ArticleResponse> findMaxPriceByType(Article type) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findMaxPriceByType'");
    }

    @Override
    public List<ArticleResponse> findByNomOrTypeOrderByPrixDesc(String str, Article type) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByNomOrTypeOrderByPrixDesc'");
    }

    @Override
    public List<ArticleResponse> findByNomStartsWith(String prefix) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByNomStartsWith'");
    }

    @Override
    public List<ArticleResponse> findByNomEndsWith(String suffix) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByNomEndsWith'");
    }

    @Override
    public List<ArticleResponse> findByTypeIsNull() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByTypeIsNull'");
    }

    @Override
    public List<ArticleResponse> findByPrixNotNull() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByPrixNotNull'");
    }

    @Override
    public List<ArticleResponse> findWithActivePromotions() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findWithActivePromotions'");
    }

    @Override
    public List<ArticleResponse> findByNomContainingAndPrixBetween(String nom, float min, float max) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByNomContainingAndPrixBetween'");
    }


}
