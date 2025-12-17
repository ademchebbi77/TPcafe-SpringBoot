package com.esprit.tpcafe.tpcafe_ademchebbi.repository;

import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PromotionRepository extends JpaRepository<Promotion, Long> {

    // Find all active promotions on a given date
    List<Promotion> findByDateDebutPromoBeforeAndDateFinPromoAfter(LocalDate start, LocalDate end);

    // Find promotions by percentage (ex: "20%", "50%", etc.)
    List<Promotion> findByPourcentagePromo(String pourcentagePromo);

    // Find promotions that end before a given date
    List<Promotion> findByDateFinPromoBefore(LocalDate date);
}
