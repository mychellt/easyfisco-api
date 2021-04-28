package br.com.easyfisco.domain.model;

import lombok.*;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
public class SellPrice {
    private PriceValue cash;
    private PriceValue term;
    private PriceValue sale;
}
