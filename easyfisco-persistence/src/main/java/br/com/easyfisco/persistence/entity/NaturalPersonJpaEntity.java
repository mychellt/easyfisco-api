package br.com.easyfisco.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Entity
@PrimaryKeyJoinColumn(name="id")
@Table(name = "natural_person")
public class NaturalPersonJpaEntity extends PersonJpaEntity {
    @Column(name="cpf")
    private String cpf;

    @Column(name = "name")
    private String name;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "genrer")
    private GenrerJpaEntity genrer;
}
