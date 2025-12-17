package com.esprit.tpcafe.tpcafe_ademchebbi.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import com.esprit.tpcafe.tpcafe_ademchebbi.enums.StatusCommande;

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
@Table(name = "commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idCommande;

    @Column(name = "date_commande")
     LocalDate dateCommande;

    @Column(name = "total_commande")
     float totalCommande;

    @Enumerated(EnumType.STRING)
    @Column(name = "status_commande")
     StatusCommande statusCommande;
    @ManyToOne
    Client client;
    @OneToMany(mappedBy = "commande")
    List<Detail_Commande> detailC;
}