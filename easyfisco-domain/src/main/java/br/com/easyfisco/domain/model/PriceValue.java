package br.com.easyfisco.domain.model;

import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
public class PriceValue {
    private BigDecimal monetary;
    private BigDecimal percentage;
}
