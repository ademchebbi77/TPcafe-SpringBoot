package com.esprit.tpcafe.tpcafe_ademchebbi.mapper;

import org.mapstruct.Mapper;
import com.esprit.tpcafe.tpcafe_ademchebbi.dto.*;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Promotion;
import java.util.List;

@Mapper(componentModel = "spring")
public interface PromotionMapper {
    PromotionResponse toDto(Promotion promotion);
    List<PromotionResponse> toDtoList(List<Promotion> promotions);
    Promotion toEntity(PromotionRequest dto);
}
