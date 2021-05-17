package br.com.easyfisco.domain.model;

import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;


@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
public class Plan {
    private UUID id;
    private BigDecimal pricePerMonth;
    private BigDecimal pricePerYear;
    private PlanType type;
}
