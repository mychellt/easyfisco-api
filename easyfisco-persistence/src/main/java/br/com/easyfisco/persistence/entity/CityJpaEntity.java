package br.com.easyfisco.persistence.entity;


import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
@Entity
@Table(name = "cities")
public class CityJpaEntity extends EntityPersistent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name="state_id", nullable = false, foreignKey = @ForeignKey(name="fk_state_id"))
    private StateJpaEntity state;
}
