package com.esprit.tpcafe.tpcafe_ademchebbi.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Detail_CommandeResponse {
    Long idDetailCommande;
    int quantiteArticle;
    float sousTotalDetailArticle;
    float sousTotalDetailArticleApresPromo;
    ArticleResponse article;
}
