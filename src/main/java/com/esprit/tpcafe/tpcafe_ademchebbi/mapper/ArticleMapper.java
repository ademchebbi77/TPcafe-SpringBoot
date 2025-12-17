package com.esprit.tpcafe.tpcafe_ademchebbi.mapper;

import org.mapstruct.Mapper;
import com.esprit.tpcafe.tpcafe_ademchebbi.dto.*;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Article;
import java.util.List;

@Mapper(componentModel = "spring", uses = { PromotionMapper.class })
public interface ArticleMapper {
    ArticleResponse toDto(Article article);
    List<ArticleResponse> toDtoList(List<Article> articles);
    Article toEntity(ArticleRequest dto);
}
