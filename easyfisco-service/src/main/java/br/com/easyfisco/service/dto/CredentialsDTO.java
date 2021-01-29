package br.com.easyfisco.service.dto;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter
@Builder
public class CredentialsDTO implements Serializable {
    private String email;
    private String password;
}
