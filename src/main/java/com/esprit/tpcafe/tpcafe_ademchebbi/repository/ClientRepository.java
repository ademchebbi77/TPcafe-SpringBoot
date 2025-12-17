package com.esprit.tpcafe.tpcafe_ademchebbi.repository;

import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Client;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    //select * from Client where nom = ............
    List<Client> findByNom(String n);
    List<Client> getByNom(String n);
    List<Client> searchByNom(String n);
    List<Client> readByNom(String n);
    List<Client> queryByNom(String n);



    //Select * from Client where nom=.....& prenom =.........
    List<Client> findByNomAndPrenom(String n,String p);
    List<Client> findByNomOrPrenom(String n,String p);


    //Select * from client where nom=
    List<Client> findByNomIgnoreCase(String n);


    //Select * from Client Where nom like ........
    List<Client> findByNomLike(String n);
    List<Client> findByNomContaining(String n);
    List<Client> findByNomContains(String n);
    List<Client> findByNomIsContaining(String n);



    List<Client> findByNomStartsWith(String n);
    List<Client> findByNomStartingWith(String n);
    List<Client> findByNomIsStartingWith(String n);






    List<Client> findByNomEndsWith(String n);
    List<Client> findByNomEndingWith(String n);
    List<Client> findByNomIsEndingWith(String n);



    List<Client> findByDateNaissanceBetween(LocalDate min, LocalDate max);
    List<Client> findByDateNaissanceGreaterThanAndDateNaissanceLessThan(LocalDate min,LocalDate max);

    List<Client> findByDateNaissanceGreaterThan(LocalDate p);

    List<Client> findByDateNaissanceGreaterThanEqual(LocalDate p);


    List<Client> findByDateNaissanceLessThan(LocalDate p);


    List<Client> findByDateNaissanceLessThanEqual(LocalDate p);




















}
