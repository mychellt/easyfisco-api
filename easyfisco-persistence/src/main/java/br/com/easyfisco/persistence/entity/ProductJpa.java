package br.com.easyfisco.persistence.entity;

import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
public class ProductJpa extends EntityPersistent {
    private UUID id;
    private BigDecimal price;
}
