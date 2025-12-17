package com.esprit.tpcafe.tpcafe_ademchebbi.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import com.esprit.tpcafe.tpcafe_ademchebbi.dto.*;
import com.esprit.tpcafe.tpcafe_ademchebbi.entities.Client;

import java.util.List;

/**
 * Mapper MapStruct pour convertir entre entité Client et DTOs ClientRequest / ClientResponse.
 */
@Mapper(componentModel = "spring", uses = {
        AdresseMapper.class,
        CarteFideliteMapper.class,
        CommandeMapper.class
})
public interface ClientMapper {

    // Mapping de l'entité vers le DTO de réponse (inclut les sous-objets)
    @Mapping(target = "adress", source = "adress")
    @Mapping(target = "carte", source = "carte")
    @Mapping(target = "commande", source = "commande")
    ClientResponse toDto(Client client);

    // Mapping de la liste d'entités vers liste de DTOs
    List<ClientResponse> toDtoList(List<Client> clients);

    // Mapping du DTO de requête vers l'entité
    @Mapping(target = "idClient", ignore = true) // ID auto-généré
    @Mapping(target = "commande", ignore = true) // Commandes non présentes dans la requête
    Client toEntity(ClientRequest dto);
}
