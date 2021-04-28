package br.com.easyfisco.domain.model;

import lombok.*;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
public class PriceDetails {
    private SellPrice sellPrice;
    private PurchasePrice purchasePrice;
}
