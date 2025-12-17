package com.esprit.tpcafe.tpcafe_ademchebbi.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "detail_Commande")
public class Detail_Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idDetailCommande;

    @Column(name = "quantite_article")
     int quantiteArticle;

    @Column(name = "sous_total_detail_article")
     float sousTotalDetailArticle;

    @Column(name = "sous_total_detail_article_apres_promo")
     float sousTotalDetailArticleApresPromo;
    @ManyToOne
    Commande commande;
    @ManyToOne
    Article article;
}