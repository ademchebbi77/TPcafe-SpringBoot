package com.esprit.tpcafe.tpcafe_ademchebbi.services;

import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Adresse;
import com.esprit.tpcafe.tpcafe_ademchebbi.dto.AdresseResponse;


import java.util.List;

public interface IAdresseService {
    Adresse addAdresse(Adresse a);
    List<Adresse> saveAdresses(List<Adresse> adresses);
    Adresse selectAdresseById(Long id);
    List<Adresse> selectAllAdresses();
    void deleteAdresse(Adresse a);
    void deleteAdresseById(Long id);
    void deleteAllAdresses();
    long countAdresses();
    boolean verifAdresseById(Long id);

    List<AdresseResponse> findByVille(String ville);
    List<AdresseResponse> findByCodePostal(Integer codePostal);
    long countByVille(String ville);
    void deleteByVille(String ville);
    List<AdresseResponse> findByVilleAndCodePostal(String ville, Integer codePostal);
    List<AdresseResponse> findByRueContainingIgnoreCaseAndVille(String motRue, String ville);
    List<AdresseResponse> findByVilleIn(List<String> villes);
    List<AdresseResponse> findByCodePostalBetween(Integer min, Integer max);
    List<AdresseResponse> findByCodePostalGreaterThan(Integer cp);
    List<AdresseResponse> findByCodePostalGreaterThanEqual(Integer cp);
    List<AdresseResponse> findByCodePostalLessThan(Integer cp);
    List<AdresseResponse> findByCodePostalLessThanEqual(Integer cp);
    List<AdresseResponse> findByRueStartsWithAndVille(String prefix, String ville);
    List<AdresseResponse> findByRueStartsWith(String prefix);
    List<AdresseResponse> findByVilleEndsWith(String suffix);
    List<AdresseResponse> findByRueIsNull();
    List<AdresseResponse> findByVilleIsNotNull();
}
