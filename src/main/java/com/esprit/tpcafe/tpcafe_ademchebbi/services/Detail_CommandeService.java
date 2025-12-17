package com.esprit.tpcafe.tpcafe_ademchebbi.services;

import com.esprit.tpcafe.tpcafe_ademchebbi.dto.Detail_CommandeResponse;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Detail_Commande;
import com.esprit.tpcafe.tpcafe_ademchebbi.repository.Detail_CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Detail_CommandeService implements IDetail_CommandeService {

    @Autowired
    private Detail_CommandeRepository Detail_CommandeRepository;

    @Override
    public Detail_Commande addDetailCommande(Detail_Commande d) {
        return Detail_CommandeRepository.save(d);
    }

    @Override
    public List<Detail_Commande> saveDetailCommandes(List<Detail_Commande> details) {
        return Detail_CommandeRepository.saveAll(details);
    }

    @Override
    public Detail_Commande selectDetailCommandeById(Long id) {
        return Detail_CommandeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Detail_Commande> selectAllDetailCommandes() {
        return Detail_CommandeRepository.findAll();
    }

    @Override
    public void deleteDetailCommande(Detail_Commande d) {
        Detail_CommandeRepository.delete(d);
    }

    @Override
    public void deleteDetailCommandeById(Long id) {
        Detail_CommandeRepository.deleteById(id);
    }

    @Override
    public void deleteAllDetailCommandes() {
        Detail_CommandeRepository.deleteAll();
    }

    @Override
    public List<Detail_Commande> selectAllDetailsCommandes() {
        return List.of();
    }

    @Override
    public List<Detail_CommandeResponse> findByQuantiteExact(int qty) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByQuantiteExact'");
    }

    @Override
    public List<Detail_CommandeResponse> findBySousTotalExact(float st) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findBySousTotalExact'");
    }

    @Override
    public long countQuantityGreater(int qty) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'countQuantityGreater'");
    }

    @Override
    public boolean existsBySousTotalGreater(float st) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'existsBySousTotalGreater'");
    }

    @Override
    public List<Detail_CommandeResponse> findByQuantiteRangeAndSousTotal(int min, int max, float stMin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByQuantiteRangeAndSousTotal'");
    }

    @Override
    public List<Detail_CommandeResponse> findBySousTotalRangeOrderByQty(float min, float max) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findBySousTotalRangeOrderByQty'");
    }

    @Override
    public List<Detail_CommandeResponse> findBySousTotalPromoRange(float min, float max) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findBySousTotalPromoRange'");
    }

    @Override
    public List<Detail_CommandeResponse> findByQtyOrSousTotalMin(int qty, float st) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByQtyOrSousTotalMin'");
    }

    @Override
    public List<Detail_CommandeResponse> top5Expensive() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'top5Expensive'");
    }

    @Override
    public List<Detail_CommandeResponse> findQuantityNull() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findQuantityNull'");
    }

    @Override
    public List<Detail_CommandeResponse> findSousTotalPromoNotNull() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findSousTotalPromoNotNull'");
    }

    @Override
    public List<Detail_CommandeResponse> findWithCommandeAndArticle() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findWithCommandeAndArticle'");
    }
}