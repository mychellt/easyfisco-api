package br.com.easyfisco.service.dto;

import lombok.*;

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
public class CategoryDTO {
    private String description;
    private String code;
}
