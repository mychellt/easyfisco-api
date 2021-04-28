package br.com.easyfisco.domain.model;

import lombok.*;

import java.util.UUID;

@Data
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
public class City {
    private UUID id;
    private String name;
    private State state;
}
