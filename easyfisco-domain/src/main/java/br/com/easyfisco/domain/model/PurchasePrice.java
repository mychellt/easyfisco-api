package br.com.easyfisco.domain.model;

import lombok.*;

import java.math.BigDecimal;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
public class PurchasePrice {
    private BigDecimal value;
    private BigDecimal tax;
    private PriceValue tip;
    private BigDecimal administrativeCost;
}
