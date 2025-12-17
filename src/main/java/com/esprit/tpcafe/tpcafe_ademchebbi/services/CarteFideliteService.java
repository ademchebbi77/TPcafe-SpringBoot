package com.esprit.tpcafe.tpcafe_ademchebbi.services;

import com.esprit.tpcafe.tpcafe_ademchebbi.dto.CarteFideliteResponse;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.CarteFidelite;
import com.esprit.tpcafe.tpcafe_ademchebbi.repository.CarteFideliteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CarteFideliteService implements ICarteFideliteService {

    @Autowired
    private CarteFideliteRepository carteFideliteRepository;

    @Override
    public CarteFidelite addCarteFidelite(CarteFidelite c) {
        return carteFideliteRepository.save(c);
    }

    @Override
    public List<CarteFidelite> saveCartesFidelite(List<CarteFidelite> cartes) {
        return carteFideliteRepository.saveAll(cartes);
    }

    @Override
    public CarteFidelite selectCarteFideliteById(Long id) {
        return carteFideliteRepository.findById(id).orElse(null);
    }

    @Override
    public List<CarteFidelite> selectAllCartesFidelite() {
        return carteFideliteRepository.findAll();
    }

    @Override
    public void deleteCarteFidelite(CarteFidelite c) {
        carteFideliteRepository.delete(c);
    }

    @Override
    public void deleteCarteFideliteById(Long id) {
        carteFideliteRepository.deleteById(id);
    }

    @Override
    public void deleteAllCartesFidelite() {
        carteFideliteRepository.deleteAll();
    }

    @Override
    public long countCartesFidelite() {
        return carteFideliteRepository.count();
    }

    @Override
    public boolean verifCarteFideliteById(Long id) {
        return carteFideliteRepository.existsById(id);
    }

    @Override
    public List<CarteFideliteResponse> findByExactPoints(int points) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByExactPoints'");
    }

    @Override
    public List<CarteFideliteResponse> findByDateCreation(LocalDate date) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByDateCreation'");
    }

    @Override
    public long countByPointsGreater(int points) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'countByPointsGreater'");
    }

    @Override
    public void deleteByDateBefore(LocalDate date) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteByDateBefore'");
    }

    @Override
    public List<CarteFideliteResponse> findPointsBetweenAfterDate(int min, int max, LocalDate date) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findPointsBetweenAfterDate'");
    }

    @Override
    public List<CarteFideliteResponse> findByPointsGreaterSortedByDate(int points) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByPointsGreaterSortedByDate'");
    }

    @Override
    public List<CarteFideliteResponse> findByDateBetween(LocalDate start, LocalDate end) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByDateBetween'");
    }

    @Override
    public List<CarteFideliteResponse> findPointsLessOrDateBefore(int points, LocalDate date) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findPointsLessOrDateBefore'");
    }

    @Override
    public List<CarteFideliteResponse> findCarteWithMaxPoints() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findCarteWithMaxPoints'");
    }

    @Override
    public List<CarteFideliteResponse> findCarteNoDate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findCarteNoDate'");
    }

    @Override
    public List<CarteFideliteResponse> findCartePointsNotNull() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findCartePointsNotNull'");
    }

    @Override
    public List<CarteFideliteResponse> findByClientNomPrenom(String nom, String prenom) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByClientNomPrenom'");
    }

    @Override
    public List<CarteFideliteResponse> findTop5ByPoints() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findTop5ByPoints'");
    }
}
