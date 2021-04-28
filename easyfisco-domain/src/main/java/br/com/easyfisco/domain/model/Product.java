package br.com.easyfisco.domain.model;

import lombok.*;

import java.security.Provider;
import java.util.UUID;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
public class Product {
    private UUID id;
    private String barcode;
    private String description;
    private UnitOfMeasurement unit;
    private Manufacturer manufacturer;
    private Provider provider;
    private Category category;
    private StatusOfProduct status;
    private PriceDetails priceDetails;
}
