package br.com.easyfisco.persistence.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Getter
@Setter
@Builder
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Entity
@PrimaryKeyJoinColumn(name="id")
@Table(name = "natural_person")
public class NaturalPerson extends PersonJpa {
    @Column(name="cpf")
    private String cpf;
}
