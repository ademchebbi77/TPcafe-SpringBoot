package com.esprit.tpcafe.tpcafe_ademchebbi.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdresseResponse {
    Long idAdresse;
    String rue;
    String ville;
    String codePostal;
}
