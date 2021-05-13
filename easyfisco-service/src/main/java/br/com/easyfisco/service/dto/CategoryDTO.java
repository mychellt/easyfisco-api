package br.com.easyfisco.service.dto;

import lombok.*;

import javax.validation.constraints.NotEmpty;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 */

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
public class CategoryDTO {
    @NotEmpty(message = "A descrição da categoria não pode ser vazia")
    private String description;
    private String code;
}
