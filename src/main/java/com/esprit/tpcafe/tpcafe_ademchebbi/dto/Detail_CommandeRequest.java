package com.esprit.tpcafe.tpcafe_ademchebbi.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Detail_CommandeRequest {
    int quantiteArticle;
    float sousTotalDetailArticle;
    float sousTotalDetailArticleApresPromo;
    Long commandeId;
    Long articleId;
}



