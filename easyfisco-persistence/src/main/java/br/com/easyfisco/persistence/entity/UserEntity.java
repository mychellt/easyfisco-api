package br.com.easyfisco.persistence.entity;

import lombok.*;

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
public class UserEntity extends Entity {
	private UUID id;

	private String login;

	private String password;
}
