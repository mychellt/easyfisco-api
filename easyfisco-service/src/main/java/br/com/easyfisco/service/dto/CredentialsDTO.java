package br.com.easyfisco.service.dto;

import lombok.*;

import java.io.Serializable;

/**
 * @author Mychell Teixeira (mychellt@gmail.com)
 *
 */

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Builder
public class CredentialsDTO implements Serializable {
    private String email;
    private String password;
}
