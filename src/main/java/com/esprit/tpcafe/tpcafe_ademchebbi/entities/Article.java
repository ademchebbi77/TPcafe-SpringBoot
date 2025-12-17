package com.esprit.tpcafe.tpcafe_ademchebbi.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import com.esprit.tpcafe.tpcafe_ademchebbi.enums.TypeArticle;

import java.util.List;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "article")
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idArticle;

    @Column(name = "nom_article")
     String nomArticle;

    @Column(name = "prix_article")
     float prixArticle;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_article")
     TypeArticle typeArticle;
    @OneToMany(mappedBy = "article")
    List<Detail_Commande> detailC;
    @ManyToMany
    List<Promotion> promotions;
}