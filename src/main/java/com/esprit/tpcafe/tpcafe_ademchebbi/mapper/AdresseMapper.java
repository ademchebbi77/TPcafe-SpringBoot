package com.esprit.tpcafe.tpcafe_ademchebbi.mapper;

import org.mapstruct.Mapper;
import com.esprit.tpcafe.tpcafe_ademchebbi.dto.*;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Adresse;
import java.util.List;

@Mapper(componentModel = "spring")
public interface AdresseMapper {
    AdresseResponse toDto(Adresse adresse);
    List<AdresseResponse> toDtoList(List<Adresse> adresses);
    Adresse toEntity(AdresseRequest dto);
}
