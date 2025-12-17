package com.esprit.tpcafe.tpcafe_ademchebbi.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import java.time.LocalDate;
import com.esprit.tpcafe.tpcafe_ademchebbi.enums.StatusCommande;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommandeRequest {
    LocalDate dateCommande;
    float totalCommande;
    StatusCommande statusCommande;
    Long clientId; // pour lier à un client existant
}
