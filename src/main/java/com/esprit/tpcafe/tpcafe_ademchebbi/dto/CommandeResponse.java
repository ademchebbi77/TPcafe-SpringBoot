package com.esprit.tpcafe.tpcafe_ademchebbi.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import java.time.LocalDate;
import java.util.List;
import com.esprit.tpcafe.tpcafe_ademchebbi.enums.StatusCommande;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommandeResponse {
    Long idCommande;
    LocalDate dateCommande;
    float totalCommande;
    StatusCommande statusCommande;
    List<Detail_CommandeResponse> detailC;
}
