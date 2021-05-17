package br.com.easyfisco.service.dto;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 * @since 14/02/2021.
 */
@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
public class UserRegistrationDTO {
	@NotEmpty
	private String login;

	@NotEmpty
	@Email
	private String email;

	@NotEmpty
	private String password;

	@NotEmpty
	private String phoneNumber;

	@NotEmpty
	private String name;
}
