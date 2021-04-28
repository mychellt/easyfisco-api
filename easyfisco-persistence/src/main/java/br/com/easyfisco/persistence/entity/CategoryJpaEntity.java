package br.com.easyfisco.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 28/04/2021
 */


@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
@Entity
@Table(name = "category")
public class CategoryJpaEntity extends EntityPersistent {
    @Id
    private UUID id;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "code", nullable = false)
    private String code;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "category")
    private List<ProductJpaEntity> products;
}
