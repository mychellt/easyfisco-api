package br.com.easyfisco.domain.model;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
public class AccessSolicitation {
    private UUID id;
    private User user;
}
