package br.com.easyfisco.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
@Entity
@Table(name = "addresses")
public class AddressJpa extends EntityPersistent {
    @Id
    private UUID id;

    @Column(name = "cep")
    private String cep;

    @Column(name = "number")
    private String number;

    @Column(name = "district")
    private String district;

    @Column(name = "place")
    private String place;

    @Column(name = "complement")
    private String complement;

    @ManyToOne
    @JoinColumn(name="city_id", nullable=false)
    private CityJpa city;

    @ManyToOne
    @JoinColumn(name="person_id", nullable = false)
    private PersonJpa person;
}
