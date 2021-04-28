package br.com.easyfisco.domain.model;

import lombok.*;

import java.util.UUID;


/**
 * Mychell Teixeira (mychellt@gmail.com)
 * @since 28/04/2021
 */

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
public class Category {
    private UUID id;
    private String code;
    private String description;
}
