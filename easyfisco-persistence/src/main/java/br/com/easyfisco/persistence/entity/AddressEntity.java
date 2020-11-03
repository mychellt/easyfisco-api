package br.com.easyfisco.persistence.entity;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
public class AddressEntity extends Entity {
    private UUID id;
    private String cep;
    private String number;
    private String district;
    private String place;
    private String complement;
}
