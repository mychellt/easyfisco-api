package br.com.easyfisco.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
@Entity
@Table(name = "product")
public class ProductJpaEntity extends EntityPersistent {
    @Id
    private UUID id;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "code", nullable = false)
    private String code;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryJpaEntity category;
}
