package com.esprit.tpcafe.tpcafe_ademchebbi.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.esprit.tpcafe.tpcafe_ademchebbi.dto.ClientResponse;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Adresse;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Article;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Client;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Commande;
import com.esprit.tpcafe.tpcafe_ademchebbi.repository.ClientRepository;
import com.esprit.tpcafe.tpcafe_ademchebbi.repository.CommandeRepository;
import com.esprit.tpcafe.tpcafe_ademchebbi.repository.AdresseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService implements IClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private CommandeRepository commandeRepository;

    @Autowired
    private AdresseRepository adresseRepository;

    @Override
    public Client addClient(Client c) {
        return clientRepository.save(c);
    }

    @Override
    public List<Client> saveClients(List<Client> clients) {
        return clientRepository.saveAll(clients);
    }

    @Override
    public Client selectClientyIdWithGet(Long id) {
        return clientRepository.findById(id).get();
    }

    @Override
    public Client selectClientByIdWithOrElse(Long id) {
        // ✅ No builder() (you had compile error on builder)
        Client fallback = new Client();
        fallback.setNom("ben foulen");
        fallback.setPrenom("foulen");
        return clientRepository.findById(id).orElse(fallback);
    }

    @Override
    public List<Client> selectAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public void deleteClient(Client c) {
        clientRepository.delete(c);
    }

    @Override
    public void deleteAllClients() {
        clientRepository.deleteAll();
    }

    @Override
    public void deleteClientById(long id) {
        clientRepository.deleteById(id);
    }

    @Override
    public long countingClients() {
        return clientRepository.count();
    }

    @Override
    public boolean verifClientById(long id) {
        return clientRepository.existsById(id);
    }

    // =========================
    // YOUR SEARCH METHODS (keep as-is or implement later)
    // =========================

    @Override
    public List<ClientResponse> findByNom(String nom) {
        throw new UnsupportedOperationException("Unimplemented method 'findByNom'");
    }

    @Override
    public List<ClientResponse> findByPrenom(String prenom) {
        throw new UnsupportedOperationException("Unimplemented method 'findByPrenom'");
    }

    @Override
    public ClientResponse findByNomAndPrenom(String nom, String prenom) {
        throw new UnsupportedOperationException("Unimplemented method 'findByNomAndPrenom'");
    }

    @Override
    public boolean existsByNom(String nom) {
        throw new UnsupportedOperationException("Unimplemented method 'existsByNom'");
    }

    @Override
    public long countBornAfter(LocalDate date) {
        throw new UnsupportedOperationException("Unimplemented method 'countBornAfter'");
    }

    @Override
    public List<ClientResponse> findNomOrPrenomContains(String str) {
        throw new UnsupportedOperationException("Unimplemented method 'findNomOrPrenomContains'");
    }

    @Override
    public List<ClientResponse> findNomAndPrenomContains(String str) {
        throw new UnsupportedOperationException("Unimplemented method 'findNomAndPrenomContains'");
    }

    @Override
    public List<ClientResponse> bornBetween(LocalDate d1, LocalDate d2) {
        throw new UnsupportedOperationException("Unimplemented method 'bornBetween'");
    }

    @Override
    public List<ClientResponse> findNomStartsBeforeDate(String prefix, LocalDate date) {
        throw new UnsupportedOperationException("Unimplemented method 'findNomStartsBeforeDate'");
    }

    @Override
    public List<ClientResponse> findByVille(String ville) {
        throw new UnsupportedOperationException("Unimplemented method 'findByVille'");
    }

    @Override
    public List<ClientResponse> findNomContainsOrderAsc(String str) {
        throw new UnsupportedOperationException("Unimplemented method 'findNomContainsOrderAsc'");
    }

    @Override
    public List<ClientResponse> findNomContainsOrderDesc(String str) {
        throw new UnsupportedOperationException("Unimplemented method 'findNomContainsOrderDesc'");
    }

    @Override
    public List<ClientResponse> findNomStartsWith(String prefix) {
        throw new UnsupportedOperationException("Unimplemented method 'findNomStartsWith'");
    }

    @Override
    public List<ClientResponse> findPrenomEndsWith(String suffix) {
        throw new UnsupportedOperationException("Unimplemented method 'findPrenomEndsWith'");
    }

    @Override
    public List<ClientResponse> findNoDateNaissance() {
        throw new UnsupportedOperationException("Unimplemented method 'findNoDateNaissance'");
    }

    @Override
    public List<ClientResponse> findAdresseNotNull() {
        throw new UnsupportedOperationException("Unimplemented method 'findAdresseNotNull'");
    }

    @Override
    public List<ClientResponse> findByVilles(List<String> villes) {
        throw new UnsupportedOperationException("Unimplemented method 'findByVilles'");
    }

    @Override
    public List<ClientResponse> findByPointsGreater(int pts) {
        throw new UnsupportedOperationException("Unimplemented method 'findByPointsGreater'");
    }

    @Override
    public List<ClientResponse> findByPointsGreaterOrEqual(int pts) {
        throw new UnsupportedOperationException("Unimplemented method 'findByPointsGreaterOrEqual'");
    }

    @Override
    public List<ClientResponse> findPointsBetween(int min, int max) {
        throw new UnsupportedOperationException("Unimplemented method 'findPointsBetween'");
    }

    @Override
    public List<ClientResponse> orderedArticle(String article) {
        throw new UnsupportedOperationException("Unimplemented method 'orderedArticle'");
    }

    @Override
    public List<ClientResponse> nameContainsAndOrderedType(String str, Article type) {
        throw new UnsupportedOperationException("Unimplemented method 'nameContainsAndOrderedType'");
    }

    // =========================
    // ✅ FIXED METHODS
    // =========================

    /**
     * ✅ This fixes:
     * "ClientService is not abstract and does not override abstract method
     * ajouterCommandeEtAffecterAffecterAClient(Commande,String,String)"
     */
    @Override
    public void ajouterCommandeEtAffecterAffecterAClient(Commande commande, String nom, String prenom) {

        // IMPORTANT:
        // Your repository method might return List<Client> (your error shows List problems).
        // So we DON'T use orElseThrow here.

        List<Client> clients = clientRepository.findByNomAndPrenom(nom, prenom);

        if (clients == null || clients.isEmpty()) {
            throw new RuntimeException("Client non trouvé (nom=" + nom + ", prenom=" + prenom + ")");
        }

        Client client = clients.get(0);

        // ✅ this requires Commande to have setClient(Client)
        // If you still get "cannot find symbol setClient", you must add the setter in Commande entity.
        commande.setClient(client);

        commandeRepository.save(commande);
    }

    @Override
    public void affecterCommandeAClient(long idCommande, long idClient) {
        Optional<Commande> commandeOptional = commandeRepository.findById(idCommande);
        Optional<Client> clientOptional = clientRepository.findById(idClient);

        if (commandeOptional.isEmpty() || clientOptional.isEmpty()) {
            throw new RuntimeException("Commande ou Client non trouvé");
        }

        Commande commande = commandeOptional.get();
        Client client = clientOptional.get();

        // ✅ requires setClient(Client) in Commande
        commande.setClient(client);
        commandeRepository.save(commande);
    }

    @Override
    public void ajouterEtAffecterAdresseAClient(Adresse adresse, Client client) {
        Adresse savedAdresse = adresseRepository.save(adresse);
        client.setAdresse(savedAdresse);
        clientRepository.save(client);
    }
}
