package com.esprit.tpcafe.tpcafe_ademchebbi.services;

import java.time.LocalDate;
import java.util.List;

import com.esprit.tpcafe.tpcafe_ademchebbi.dto.ClientResponse;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Article;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Client;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Commande;
import com.esprit.tpcafe.tpcafe_ademchebbi.repository.ClientRepository;
import com.esprit.tpcafe.tpcafe_ademchebbi.repository.CommandeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService implements IClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private CommandeRepository commandeRepository;

    // ================= BASIC CRUD =================

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
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client selectClientByIdWithOrElse(Long id) {
        Client c = new Client();
        c.setNom("ben foulen");
        c.setPrenom("foulen");
        return clientRepository.findById(id).orElse(c);
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

    // ================= REQUIRED BY INTERFACE =================

    /**
     * FIXED: interface requires
     * ajouterCommandeEtAffecterAffecterAClient(Commande, String, String)
     * and repository returns List<Client>
     */
    @Override
    public void ajouterCommandeEtAffecterAffecterAClient(
            Commande commande,
            String nom,
            String prenom) {

        List<Client> clients = clientRepository.findByNomAndPrenom(nom, prenom);

        if (clients.isEmpty()) {
            throw new RuntimeException(
                    "Client non trouvé : " + nom + " " + prenom
            );
        }

        Client client = clients.get(0); // take first match

        commande.setClient(client);
        commandeRepository.save(commande);
    }

    // ================= OPTIONAL HELPER =================
    public void ajouterCommandeEtAffecterAClient(Commande commande, long idClient) {
        Client client = clientRepository.findById(idClient)
                .orElseThrow(() -> new RuntimeException("Client non trouvé"));

        commande.setClient(client);
        commandeRepository.save(commande);
    }

    // ================= SEARCH METHODS (NOT IMPLEMENTED YET) =================

    @Override public List<ClientResponse> findByNom(String nom) { throw new UnsupportedOperationException(); }
    @Override public List<ClientResponse> findByPrenom(String prenom) { throw new UnsupportedOperationException(); }
    @Override public ClientResponse findByNomAndPrenom(String nom, String prenom) { throw new UnsupportedOperationException(); }
    @Override public boolean existsByNom(String nom) { throw new UnsupportedOperationException(); }
    @Override public long countBornAfter(LocalDate date) { throw new UnsupportedOperationException(); }
    @Override public List<ClientResponse> findNomOrPrenomContains(String str) { throw new UnsupportedOperationException(); }
    @Override public List<ClientResponse> findNomAndPrenomContains(String str) { throw new UnsupportedOperationException(); }
    @Override public List<ClientResponse> bornBetween(LocalDate d1, LocalDate d2) { throw new UnsupportedOperationException(); }
    @Override public List<ClientResponse> findNomStartsBeforeDate(String prefix, LocalDate date) { throw new UnsupportedOperationException(); }
    @Override public List<ClientResponse> findByVille(String ville) { throw new UnsupportedOperationException(); }
    @Override public List<ClientResponse> findNomContainsOrderAsc(String str) { throw new UnsupportedOperationException(); }
    @Override public List<ClientResponse> findNomContainsOrderDesc(String str) { throw new UnsupportedOperationException(); }
    @Override public List<ClientResponse> findNomStartsWith(String prefix) { throw new UnsupportedOperationException(); }
    @Override public List<ClientResponse> findPrenomEndsWith(String suffix) { throw new UnsupportedOperationException(); }
    @Override public List<ClientResponse> findNoDateNaissance() { throw new UnsupportedOperationException(); }
    @Override public List<ClientResponse> findAdresseNotNull() { throw new UnsupportedOperationException(); }
    @Override public List<ClientResponse> findByVilles(List<String> villes) { throw new UnsupportedOperationException(); }
    @Override public List<ClientResponse> findByPointsGreater(int pts) { throw new UnsupportedOperationException(); }
    @Override public List<ClientResponse> findByPointsGreaterOrEqual(int pts) { throw new UnsupportedOperationException(); }
    @Override public List<ClientResponse> findPointsBetween(int min, int max) { throw new UnsupportedOperationException(); }
    @Override public List<ClientResponse> orderedArticle(String article) { throw new UnsupportedOperationException(); }
    @Override public List<ClientResponse> nameContainsAndOrderedType(String str, Article type) { throw new UnsupportedOperationException(); }
}
