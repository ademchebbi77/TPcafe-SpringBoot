package com.esprit.tpcafe.tpcafe_ademchebbi.services;

import com.esprit.tpcafe.tpcafe_ademchebbi.dto.CommandeResponse;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Commande;
import com.esprit.tpcafe.tpcafe_ademchebbi.repository.CommandeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CommandeService implements ICommandeService {

    @Autowired
    private CommandeRepository commandeRepository;

    @Override
    public Commande addCommande(Commande c) {
        return commandeRepository.save(c);
    }

    @Override
    public List<Commande> saveCommandes(List<Commande> commandes) {
        return commandeRepository.saveAll(commandes);
    }

    @Override
    public Commande selectCommandeById(Long id) {
        return commandeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Commande> selectAllCommandes() {
        return commandeRepository.findAll();
    }

    @Override
    public void deleteCommande(Commande c) {
        commandeRepository.delete(c);
    }

    @Override
    public void deleteCommandeById(Long id) {
        commandeRepository.deleteById(id);
    }

    @Override
    public void deleteAllCommandes() {
        commandeRepository.deleteAll();
    }

    @Override
    public long countCommandes() {
        return commandeRepository.count();
    }

    @Override
    public boolean verifCommandeById(Long id) {
        return commandeRepository.existsById(id);
    }

    @Override
    public List<CommandeResponse> findByStatus(String status) {
        throw new UnsupportedOperationException("Unimplemented method 'findByStatus'");
    }

    @Override
    public List<CommandeResponse> findByDate(LocalDate date) {
        throw new UnsupportedOperationException("Unimplemented method 'findByDate'");
    }

    @Override
    public long countByStatus(String status) {
        throw new UnsupportedOperationException("Unimplemented method 'countByStatus'");
    }

    @Override
    public void deleteBefore(LocalDate date) {
        throw new UnsupportedOperationException("Unimplemented method 'deleteBefore'");
    }

    @Override
    public List<CommandeResponse> findBetweenDatesAndStatus(LocalDate d1, LocalDate d2, String status) {
        throw new UnsupportedOperationException("Unimplemented method 'findBetweenDatesAndStatus'");
    }

    @Override
    public List<CommandeResponse> findTotalGreaterAndStatusNot(float montant, String status) {
        throw new UnsupportedOperationException("Unimplemented method 'findTotalGreaterAndStatusNot'");
    }

    @Override
    public List<CommandeResponse> findByStatuses(List<String> statuses) {
        throw new UnsupportedOperationException("Unimplemented method 'findByStatuses'");
    }

    @Override
    public List<CommandeResponse> findBeforeDateTotalBetween(LocalDate date, float min, float max) {
        throw new UnsupportedOperationException("Unimplemented method 'findBeforeDateTotalBetween'");
    }

    @Override
    public List<CommandeResponse> findStatusEndsWith(String suffix) {
        throw new UnsupportedOperationException("Unimplemented method 'findStatusEndsWith'");
    }

    @Override
    public List<CommandeResponse> findStatusNull() {
        throw new UnsupportedOperationException("Unimplemented method 'findStatusNull'");
    }

    @Override
    public List<CommandeResponse> findTotalNotNull() {
        throw new UnsupportedOperationException("Unimplemented method 'findTotalNotNull'");
    }

    @Override
    public List<CommandeResponse> findWithDetailsAndClient() {
        throw new UnsupportedOperationException("Unimplemented method 'findWithDetailsAndClient'");
    }

    @Override
    public List<CommandeResponse> top3Recent() {
        throw new UnsupportedOperationException("Unimplemented method 'top3Recent'");
    }
}
