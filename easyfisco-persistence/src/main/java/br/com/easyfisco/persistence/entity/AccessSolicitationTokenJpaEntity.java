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
@Table(name = "access_solicitation_token")
public class AccessSolicitationTokenJpaEntity extends EntityPersistent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "user", nullable = false)
    private boolean used;

    @Column(name="key")
    private String key;

    @ManyToOne
    @JoinColumn(name="solicitation_id", nullable=false, foreignKey = @ForeignKey(name="fk_solicitation_id") )
    private AccessSolicitationJpaEntity solicitation;
}
