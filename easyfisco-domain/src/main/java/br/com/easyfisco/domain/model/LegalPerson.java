package br.com.easyfisco.domain.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@SuperBuilder
public class LegalPerson extends Person {
    private String cnpj;
    private String companyName;
    private String tradingName;
}
