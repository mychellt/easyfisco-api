package br.com.easyfisco.persistence.entity;


import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
public class CityEntity extends Entity {
    private UUID id;
    private String name;
    private StateEntity state;
}