package br.com.easyfisco.domain.model;

import lombok.*;

import java.util.UUID;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
public class Contact {
    private UUID id;
    private String name;
    private String email;
    private String phone;
    private String whatsapp;
}
