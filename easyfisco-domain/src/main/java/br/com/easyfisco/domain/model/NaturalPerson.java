package br.com.easyfisco.domain.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@SuperBuilder
public class NaturalPerson extends Person {
    private String cpf;
    private String name;
    private LocalDate birthDate;
    private Genrer genrer;
}
