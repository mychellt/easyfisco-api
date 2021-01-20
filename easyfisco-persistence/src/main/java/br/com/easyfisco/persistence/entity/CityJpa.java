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
public class CityJpa extends EntityPersistent {
    @Id
    private UUID id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name="state_id", nullable = false)
    private StateJpa state;
}
