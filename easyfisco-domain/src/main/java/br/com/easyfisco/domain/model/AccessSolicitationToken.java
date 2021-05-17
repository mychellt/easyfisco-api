package br.com.easyfisco.domain.model;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
public class AccessSolicitationToken {
    private UUID id;
    private boolean used;
    private AccessSolicitation solicitation;
    private boolean valid;
}
