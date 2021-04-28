package br.com.easyfisco.persistence.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
@Entity
@Table(name = "persons")
public abstract class PersonJpaEntity extends EntityPersistent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private TypeOfPersonJpaEntity type;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "person", fetch=FetchType.LAZY)
    private List<AddressJpaEntity> addresses;

    @ElementCollection
    @CollectionTable(name = "PHONES")
    private Set<String> phones = new HashSet<>();
}
