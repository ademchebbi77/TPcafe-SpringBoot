package com.esprit.tpcafe.tpcafe_ademchebbi.mapper;

import org.mapstruct.Mapper;
import com.esprit.tpcafe.tpcafe_ademchebbi.dto.*;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.CarteFidelite;
import java.util.List;

@Mapper(componentModel = "spring")
public interface CarteFideliteMapper {
    CarteFideliteResponse toDto(CarteFidelite carte);
    List<CarteFideliteResponse> toDtoList(List<CarteFidelite> cartes);
    CarteFidelite toEntity(CarteFideliteRequest dto);
}
