package com.esprit.tpcafe.tpcafe_ademchebbi.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import com.esprit.tpcafe.tpcafe_ademchebbi.enums.TypeArticle;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ArticleResponse {
    Long idArticle;
    String nomArticle;
    float prixArticle;
    TypeArticle typeArticle;
    List<PromotionResponse> promotions;
}
