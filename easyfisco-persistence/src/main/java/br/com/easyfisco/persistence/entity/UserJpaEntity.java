package br.com.easyfisco.persistence.entity;

import lombok.*;

import javax.persistence.*;
import java.util.*;

/**
 * @author Mychell  Teixeira (mychellt@gmail.com)
 * @since 14/04/2020.
 */
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
@Entity
@Table(name = "users")
public class UserJpaEntity extends EntityPersistent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	@Column(name = "email", nullable = false, unique = true)
	private String email;

	@Column(name = "password", nullable = false)
	private String password;

	@ManyToMany
	@JoinTable(name = "USER_PROFILES",
			joinColumns = @JoinColumn(name = "user_id"),
			inverseJoinColumns = @JoinColumn(name = "profile_id")
	)
	private Set<ProfileJpaEntity> profiles = new HashSet<>();
}
