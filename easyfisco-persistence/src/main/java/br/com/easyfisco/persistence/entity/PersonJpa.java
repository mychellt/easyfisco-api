package br.com.easyfisco.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name = "persons")
public abstract class PersonJpa extends EntityPersistent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private TypeOfPersonJpa type;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "person", fetch=FetchType.LAZY)
    private List<AddressJpa> addresses;

}
