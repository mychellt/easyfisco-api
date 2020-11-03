package br.com.easyfisco.persistence.entity;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
public class ProviderEntity extends PersonEntity {
    private UUID id;
}
