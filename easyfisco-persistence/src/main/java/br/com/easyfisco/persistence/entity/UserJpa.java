package br.com.easyfisco.persistence.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * @author Mychell  Teixeira (mychellt@gmail.com)
 * @since 14/04/2020.
 */
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
@Entity(name = "users")
public class UserJpa extends EntityPersistent {
	@Id
	private UUID id;

	@Column(name = "email", nullable = false, unique = true)
	private String email;

	@Column(name = "password", nullable = false)
	private String password;


	private Set<ProfileJpa> profiles = new HashSet<>();
}
