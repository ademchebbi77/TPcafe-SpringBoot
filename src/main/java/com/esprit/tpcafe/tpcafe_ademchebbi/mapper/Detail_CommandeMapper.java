package com.esprit.tpcafe.tpcafe_ademchebbi.mapper;

import org.mapstruct.Mapper;
import com.esprit.tpcafe.tpcafe_ademchebbi.dto.*;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Detail_Commande;

import java.util.List;

@Mapper(componentModel = "spring", uses = { ArticleMapper.class })
public interface Detail_CommandeMapper {
    Detail_CommandeResponse toDto(Detail_Commande detail);
    List<Detail_CommandeResponse> toDtoList(List<Detail_Commande> details);
    Detail_Commande toEntity(Detail_CommandeRequest dto);
}
