package com.esprit.tpcafe.tpcafe_ademchebbi.services;

import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Adresse;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Article;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Client;
import com.esprit.tpcafe.tpcafe_ademchebbi.dto.ClientResponse;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Commande;

import java.time.LocalDate;

import java.util.List;

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

    // Recherches par points de fidélité
    List<ClientResponse> findByPointsGreater(int pts);
    List<ClientResponse> findByPointsGreaterOrEqual(int pts);
    List<ClientResponse> findPointsBetween(int min, int max);

    // Recherches liées aux commandes
    List<ClientResponse> orderedArticle(String article);
    List<ClientResponse> nameContainsAndOrderedType(String str, Article type);


    void ajouterCommandeEtAffecterAffecterAClient(Commande c, String nomC, String promoC);

    void ajouterEtAffecterAdresseAClient(Adresse adresse, Client client);

    void ajouterEtAffecterAdresseAClient(Adresse adresse, Client client);
}