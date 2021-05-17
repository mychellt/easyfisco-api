package br.com.easyfisco.domain.model;

import lombok.*;

import java.util.List;
import java.util.UUID;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2020.
 */

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
public class User {
	private UUID id;
	private String email;
	private String password;
	private String phoneNumber;
	private List<Profile> profiles;
	private String token;
	private String name;
	private boolean authorized;
}
