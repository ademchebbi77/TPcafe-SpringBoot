package com.esprit.tpcafe.tpcafe_ademchebbi.services;

import com.esprit.tpcafe.tpcafe_ademchebbi.dto.AdresseResponse;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Adresse;
import com.esprit.tpcafe.tpcafe_ademchebbi.repository.AdresseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdresseService implements IAdresseService {

    @Autowired
    private AdresseRepository adresseRepository;

    @Override
    public Adresse addAdresse(Adresse a) {
        return adresseRepository.save(a);
    }

    @Override
    public List<Adresse> saveAdresses(List<Adresse> adresses) {
        return adresseRepository.saveAll(adresses);
    }

    @Override
    public Adresse selectAdresseById(Long id) {
        return adresseRepository.findById(id).orElse(null);
    }

    @Override
    public List<Adresse> selectAllAdresses() {
        return adresseRepository.findAll();
    }

    @Override
    public void deleteAdresse(Adresse a) {
        adresseRepository.delete(a);
    }

    @Override
    public void deleteAdresseById(Long id) {
        adresseRepository.deleteById(id);
    }

    @Override
    public void deleteAllAdresses() {
        adresseRepository.deleteAll();
    }

    @Override
    public long countAdresses() {
        return adresseRepository.count();
    }

    @Override
    public boolean verifAdresseById(Long id) {
        return adresseRepository.existsById(id);
    }

    @Override
    public List<AdresseResponse> findByVille(String ville) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByVille'");
    }

    @Override
    public List<AdresseResponse> findByCodePostal(Integer codePostal) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByCodePostal'");
    }

    @Override
    public long countByVille(String ville) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'countByVille'");
    }

    @Override
    public void deleteByVille(String ville) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteByVille'");
    }

    @Override
    public List<AdresseResponse> findByVilleAndCodePostal(String ville, Integer codePostal) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByVilleAndCodePostal'");
    }

    @Override
    public List<AdresseResponse> findByRueContainingIgnoreCaseAndVille(String motRue, String ville) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByRueContainingIgnoreCaseAndVille'");
    }

    @Override
    public List<AdresseResponse> findByVilleIn(List<String> villes) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByVilleIn'");
    }

    @Override
    public List<AdresseResponse> findByCodePostalBetween(Integer min, Integer max) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByCodePostalBetween'");
    }

    @Override
    public List<AdresseResponse> findByCodePostalGreaterThan(Integer cp) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByCodePostalGreaterThan'");
    }

    @Override
    public List<AdresseResponse> findByCodePostalGreaterThanEqual(Integer cp) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByCodePostalGreaterThanEqual'");
    }

    @Override
    public List<AdresseResponse> findByCodePostalLessThan(Integer cp) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByCodePostalLessThan'");
    }

    @Override
    public List<AdresseResponse> findByCodePostalLessThanEqual(Integer cp) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByCodePostalLessThanEqual'");
    }

    @Override
    public List<AdresseResponse> findByRueStartsWithAndVille(String prefix, String ville) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByRueStartsWithAndVille'");
    }

    @Override
    public List<AdresseResponse> findByRueStartsWith(String prefix) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByRueStartsWith'");
    }

    @Override
    public List<AdresseResponse> findByVilleEndsWith(String suffix) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByVilleEndsWith'");
    }

    @Override
    public List<AdresseResponse> findByRueIsNull() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByRueIsNull'");
    }

    @Override
    public List<AdresseResponse> findByVilleIsNotNull() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByVilleIsNotNull'");
    }


}
