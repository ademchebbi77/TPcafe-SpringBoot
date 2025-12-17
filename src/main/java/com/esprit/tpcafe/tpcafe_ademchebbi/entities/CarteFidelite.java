package com.esprit.tpcafe.tpcafe_ademchebbi.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "carte_fidelite")
public class CarteFidelite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     Long idCarteFidelite;

    @Column(name = "points_accumule")
     int pointsAccumule;    

    @Column(name = "date_creation")
     LocalDate dateCreation;
    @OneToOne (mappedBy ="carte") /*le mot carte dans mapped by est le meme dans la classe client*/
    Client client;
}