package br.com.easyfisco.domain.model;

import lombok.*;

import java.util.UUID;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */

@Data
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
public class Address {
    private UUID id;
    private String cep;
    private String number;
    private String district;
    private String place;
    private String complement;
}
