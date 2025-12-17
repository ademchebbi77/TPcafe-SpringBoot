package com.esprit.tpcafe.tpcafe_ademchebbi.repository;

import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Adresse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdresseRepository extends JpaRepository<Adresse, Long> {

    List<Adresse> findByVille(String ville);
    List<Adresse> findByCodePostal(Integer codePostal);
    long countByVille(String ville);
    void deleteByVille(String ville);
    List<Adresse> findByVilleAndCodePostal(String ville, Integer codePostal);
    List<Adresse> findByRueIgnoreCaseContainingAndVilleIgnoreCase(String motRue, String ville);
    List<Adresse> findByVilleIn(List<String> villes);
    List<Adresse> findByCodePostalBetween(Integer min, Integer max);
    List<Adresse> findByCodePostalGreaterThan(Integer codePostal);
    List<Adresse> findByCodePostalGreaterThanEqual(Integer codePostal);
    List<Adresse> findByCodePostalLessThan(Integer codePostal);
    List<Adresse> findByCodePostalLessThanEqual(Integer codePostal);
    List<Adresse> findByRueStartsWithAndVilleOrderByCodePostal(String prefix, String ville);
    List<Adresse> findByRueStartsWith(String prefix);
    List<Adresse> findByVilleEndsWith(String suffix);
    List<Adresse> findByRueIsNull();
    List<Adresse> findByVilleIsNotNull();



}
