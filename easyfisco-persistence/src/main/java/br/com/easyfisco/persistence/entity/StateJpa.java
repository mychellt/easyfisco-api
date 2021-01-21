package br.com.easyfisco.persistence.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
@Entity(name = "states")
public class StateJpa extends EntityPersistent {
    @Id
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "initials")
    private String initials;
}