package br.com.easyfisco.domain.model;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
public class UnitOfMeasurement {
    private UUID id;
    private String description;
    private String name;
}
