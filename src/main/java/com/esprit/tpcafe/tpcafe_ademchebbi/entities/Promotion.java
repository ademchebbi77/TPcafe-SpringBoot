package com.esprit.tpcafe.tpcafe_ademchebbi.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "promotion")
public class Promotion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idPromotion;

    @Column(name = "pourcentage_promo")
     String pourcentagePromo;

    @Column(name = "date_debut_promo")
     LocalDate dateDebutPromo;

    @Column(name = "date_fin_promo")
     LocalDate dateFinPromo;
    @ManyToMany(mappedBy = "promotions")
    List<Article> articles ;
}