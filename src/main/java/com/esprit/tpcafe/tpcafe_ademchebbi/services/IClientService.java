package com.esprit.tpcafe.tpcafe_ademchebbi.services;

import java.time.LocalDate;
import java.util.List;

import com.esprit.tpcafe.tpcafe_ademchebbi.dto.ClientResponse;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Article;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Commande;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Client;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Adresse;

public interface IClientService {

    Client addClient(Client c);
    List<Client> saveClients(List<Client> clients);
    Client selectClientyIdWithGet(Long id);
    Client selectClientByIdWithOrElse(Long id);
    List<Client> selectAllClients();
    void deleteClient(Client c);
    void deleteAllClients();
    void deleteClientById(long id);
    long countingClients();
    boolean verifClientById(long id);

    List<ClientResponse> findByNom(String nom);
    List<ClientResponse> findByPrenom(String prenom);
    ClientResponse findByNomAndPrenom(String nom, String prenom);
    boolean existsByNom(String nom);
    long countBornAfter(LocalDate date);
    List<ClientResponse> findNomOrPrenomContains(String str);
    List<ClientResponse> findNomAndPrenomContains(String str);
    List<ClientResponse> bornBetween(LocalDate d1, LocalDate d2);
    List<ClientResponse> findNomStartsBeforeDate(String prefix, LocalDate date);
    List<ClientResponse> findByVille(String ville);
    List<ClientResponse> findNomContainsOrderAsc(String str);
    List<ClientResponse> findNomContainsOrderDesc(String str);
    List<ClientResponse> findNomStartsWith(String prefix);
    List<ClientResponse> findPrenomEndsWith(String suffix);
    List<ClientResponse> findNoDateNaissance();
    List<ClientResponse> findAdresseNotNull();
    List<ClientResponse> findByVilles(List<String> villes);
    List<ClientResponse> findByPointsGreater(int pts);
    List<ClientResponse> findByPointsGreaterOrEqual(int pts);
    List<ClientResponse> findPointsBetween(int min, int max);
    List<ClientResponse> orderedArticle(String article);
    List<ClientResponse> nameContainsAndOrderedType(String str, Article type);

    // ✅ This is the one your class MUST implement
    void ajouterCommandeEtAffecterAffecterAClient(Commande commande, String nom, String prenom);

    void affecterCommandeAClient(long idCommande, long idClient);

    // (keep your other methods here, but ensure no duplicates)
    void ajouterEtAffecterAdresseAClient(Adresse adresse, Client client);
}
